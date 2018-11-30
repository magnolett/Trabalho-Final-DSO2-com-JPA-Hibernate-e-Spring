package br.com.trabalhofinal.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.annotation.PostConstruct;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.trabalhofinal.entities.AccountType;
import br.com.trabalhofinal.entities.CheckingAccount;
import br.com.trabalhofinal.entities.CustomerInfo;
import br.com.trabalhofinal.entities.SavingsAccount;
import br.com.trabalhofinal.entities.Transaction;
import br.com.trabalhofinal.service.CheckingAccountService;
import br.com.trabalhofinal.service.SavingsAccountService;

@Component
public class WithdrawView extends JFrame {

	@Autowired
	private CheckingAccountView checkingAccountView;

	@Autowired
	private CheckingAccountService checkingAccountService;

	@Autowired
	private SavingsAccountService savingsAccountService;

	@Autowired
	private SavingsAccountView savingsAccountView;

	private JLabel realizaSaque;
	private JLabel valorSaque;
	private JTextField inputValorSaque;
	private JButton sacar;
	private JButton voltar;

	private Long withdrawValue;
	private CustomerInfo customerInfo;

	@PostConstruct
	public void initComponents() {

		realizaSaque = new JLabel("Realizar Saque");
		valorSaque = new JLabel("Valor a sacar:");
		inputValorSaque = new JTextField(5);
		sacar = new JButton("Sacar");
		voltar = new JButton("Voltar");

		sacar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(inputValorSaque.getText() != null && !inputValorSaque.getText().replaceAll("\\D", "").isEmpty()) {
					withdrawValue = Long.valueOf(inputValorSaque.getText());
				} else {
					JOptionPane.showMessageDialog(null, "Apenas números! Não deixe o campo em branco!");
				}
				
			}
		});
		
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(customerInfo.getAccountType().equals(AccountType.CHECKING_ACCOUNT)) {
					checkingAccountView.criaTela();
					setVisible(false);
					
				} else if (customerInfo.getAccountType().equals(AccountType.SAVINGS_ACCOUNT)){
					savingsAccountView.criaTela();
					setVisible(false);
				}
			}
		});
		
		setPreferredSize(new Dimension(394, 200));
		setLayout(null);

		add(realizaSaque);
		add(valorSaque);
		add(inputValorSaque);
		add(sacar);
		add(voltar);

		realizaSaque.setBounds(150, 0, 155, 25);
		valorSaque.setBounds(155, 35, 125, 25);
		inputValorSaque.setBounds(135, 70, 125, 20);
		sacar.setBounds(95, 120, 100, 25);
		voltar.setBounds(220, 120, 100, 25);

		setLocation(640, 260);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		getContentPane().setLayout(groupLayout);

		pack();
	}

	public void criaTela(final CustomerInfo customerInfo) {
		
		this.customerInfo = customerInfo;
		
		try {
			if(customerInfo.getAccountType().equals(AccountType.CHECKING_ACCOUNT)) {

				final CheckingAccount checkingAccount = checkingAccountService.findByCostumerInfo(customerInfo.getId());
				final Long oldValue = checkingAccount.getAccountBalance();
				checkingAccount.setAccountBalance(checkingAccount.getAccountBalance() - withdrawValue);

				JOptionPane.showMessageDialog(null, "Saldo Antigo: R$ " + oldValue);
				JOptionPane.showMessageDialog(null, "Saldo Novo: R$ " + checkingAccount.getAccountBalance());
				
			} else if (customerInfo.getAccountType().equals(AccountType.SAVINGS_ACCOUNT)){
				
				final SavingsAccount savingsAccount = savingsAccountService.findByCostumerInfo(customerInfo);
				final Long oldValue = savingsAccount.getAccountBalance();
				savingsAccount.setAccountBalance(savingsAccount.getAccountBalance() - withdrawValue);
			
				JOptionPane.showMessageDialog(null, "Saldo Antigo: R$ " + oldValue);
				JOptionPane.showMessageDialog(null, "Saldo Novo: R$ " + savingsAccount.getAccountBalance());
				
			} else {
				JOptionPane.showMessageDialog(null, "Problema não mapeado no sistema!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		setVisible(true);
	}
}
