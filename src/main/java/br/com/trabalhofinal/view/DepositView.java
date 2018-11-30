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

import org.dom4j.tree.DefaultProcessingInstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.trabalhofinal.entities.AccountType;
import br.com.trabalhofinal.entities.CheckingAccount;
import br.com.trabalhofinal.entities.CustomerInfo;
import br.com.trabalhofinal.entities.SavingsAccount;
import br.com.trabalhofinal.service.CheckingAccountService;
import br.com.trabalhofinal.service.SavingsAccountService;

@Component
public class DepositView extends JFrame {

	@Autowired
	private SavingsAccountView savingsAccountView;

	@Autowired
	private CheckingAccountView checkingAccountView;

	@Autowired
	private SavingsAccountService savingsAccountService;

	@Autowired
	private CheckingAccountService checkingAccountService;

	private JLabel realizaDeposito;
	private JLabel valorDeposito;
	private JTextField inputDeposito;
	private JButton depositar;
	private JButton voltar;

	private Long depositValue;
	private CustomerInfo customerInfo;

	@PostConstruct
	public void initComponents() {

		realizaDeposito = new JLabel("Realizar Depósito");
		valorDeposito = new JLabel("Valor a depositar:");
		inputDeposito = new JTextField(5);
		depositar = new JButton("Depositar");
		voltar = new JButton("Voltar");

		setPreferredSize(new Dimension(394, 200));
		setLayout(null);

		add(realizaDeposito);
		add(valorDeposito);
		add(inputDeposito);
		add(depositar);
		add(voltar);

		realizaDeposito.setBounds(150, 0, 155, 25);
		valorDeposito.setBounds(150, 35, 125, 25);
		inputDeposito.setBounds(140, 70, 125, 20);
		depositar.setBounds(95, 120, 100, 25);
		voltar.setBounds(220, 120, 100, 25);

		depositar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (inputDeposito.getText() != null && !inputDeposito.getText().replaceAll("\\D", "").isEmpty()) {
					depositValue = Long.valueOf(inputDeposito.getText());
					depositCalculator();
				} else {
					JOptionPane.showMessageDialog(null, "Apenas números! Não deixe o campo em branco!");
				}

			}
		});

		voltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (customerInfo.getAccountType().equals(AccountType.CHECKING_ACCOUNT)) {
					checkingAccountView.criaTela();
					setVisible(false);

				} else if (customerInfo.getAccountType().equals(AccountType.SAVINGS_ACCOUNT)) {
					savingsAccountView.criaTela();
					setVisible(false);
				}
			}
		});

		setLocation(640, 260);

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		getContentPane().setLayout(groupLayout);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		pack();
	}

	public void criaTela(final CustomerInfo customerInfo) {

		this.customerInfo = customerInfo;
		setVisible(true);
	}

	public void depositCalculator() {
		
		try {
			if(customerInfo.getAccountType().equals(AccountType.CHECKING_ACCOUNT)) {

				final CheckingAccount checkingAccount = checkingAccountService.findByCostumerInfo(customerInfo.getId());
				final Long oldValue = checkingAccount.getAccountBalance();
				checkingAccount.setAccountBalance(checkingAccount.getAccountBalance() + depositValue);

				JOptionPane.showMessageDialog(null, "Saldo Antigo: R$ " + oldValue);
				JOptionPane.showMessageDialog(null, "Saldo Novo: R$ " + checkingAccount.getAccountBalance());
				
				checkingAccountService.save(checkingAccount);
			} else if (customerInfo.getAccountType().equals(AccountType.SAVINGS_ACCOUNT)){
				
				final SavingsAccount savingsAccount = savingsAccountService.findByCostumerInfo(customerInfo);
				final Long oldValue = savingsAccount.getAccountBalance();
				savingsAccount.setAccountBalance(savingsAccount.getAccountBalance() + depositValue);
			
				JOptionPane.showMessageDialog(null, "Saldo Antigo: R$ " + oldValue);
				JOptionPane.showMessageDialog(null, "Saldo Novo: R$ " + savingsAccount.getAccountBalance());

				savingsAccountService.save(savingsAccount);
			} else {
				JOptionPane.showMessageDialog(null, "Problema não mapeado no sistema!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
