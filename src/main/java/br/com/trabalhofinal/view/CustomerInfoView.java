package br.com.trabalhofinal.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.trabalhofinal.entities.AccountType;
import br.com.trabalhofinal.entities.CustomerInfo;
import br.com.trabalhofinal.service.CustomerInfoService;

@Component
public class CustomerInfoView extends JFrame {

	@Autowired
	private CustomerInfoService customerInfoService;
	
	@Autowired
	private CheckingAccountView checkingAccountView;

	@Autowired
	private SavingsAccountView savingsAccountView;
	
	private JLabel nome;
	private JLabel sobrenome;
	private JLabel cpf;
	private JLabel endereco;
	private JLabel renda;
	private JButton voltar;
	private JTextField showNome;
	private JTextField showSobrenome;
	private JTextField showCpf;
	private JTextField showEndereco;
	private JTextField showRenda;
	
	private CustomerInfo customerInfo;

	public CustomerInfoView() {
		initComponents();

	}

	public void initComponents() {
		
		nome = new JLabel("Nome");
		sobrenome = new JLabel("Sobrenome");
		cpf = new JLabel("CPF");
		endereco = new JLabel("Endereço");
		renda = new JLabel("Renda Cadastrada");
		voltar = new JButton("Voltar");
		showNome = new JTextField(5);
		showSobrenome = new JTextField(10);
		showCpf = new JTextField(10);
		showEndereco = new JTextField(10);
		showRenda = new JTextField(5);

		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(customerInfo.getAccountType().equals(AccountType.CHECKING_ACCOUNT)) {
					checkingAccountView.criaTela();
					setVisible(false);
				} else if(customerInfo.getAccountType().equals(AccountType.SAVINGS_ACCOUNT)) {
					savingsAccountView.criaTela();
					setVisible(false);
				} else {
					System.out.println("Erro ao identificar tipo de conta.");
				}
			}
		});
		
		setPreferredSize(new Dimension(482, 310));
		setLayout(null);

		nome.setBounds(95, 10, 100, 25);
		sobrenome.setBounds(80, 75, 100, 25);
		cpf.setBounds(100, 145, 100, 25);
		endereco.setBounds(350, 40, 100, 25);
		renda.setBounds(335, 115, 110, 25);
		voltar.setBounds(200, 230, 100, 25);
		showNome.setBounds(65, 45, 100, 25);
		showSobrenome.setBounds(65, 115, 100, 25);
		showCpf.setBounds(65, 180, 100, 25);
		showEndereco.setBounds(330, 75, 100, 25);
		showRenda.setBounds(335, 160, 100, 25);

		add(nome);
		add(sobrenome);
		add(cpf);
		add(endereco);
		add(renda);
		add(voltar);
		add(showNome);
		add(showSobrenome);
		add(showCpf);
		add(showEndereco);
		add(showRenda);
		
		setLocation(640, 260);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		getContentPane().setLayout(groupLayout);
		
		
		pack();
	}

	public void criaTela(final CustomerInfo customerInfo) {

		this.customerInfo = customerInfo;
		
		initComponents();
		setVisible(true);
		
		showNome.setText(customerInfo.getCustomerName());
		showSobrenome.setText(customerInfo.getCustomerSurname());
		showCpf.setText(numberToCpfFormatter(customerInfo.getCustomerCPF()));
		showEndereco.setText(customerInfo.getCustomerStreetAddress());
		showRenda.setText("R$ "+customerInfo.getCustomerIncome().toString());
	}
	
	public CustomerInfo carregaCustomer(final AccountType accountType) {
		return customerInfoService.findCustomerByAccountType(accountType);
	}
	
   public static String numberToCpfFormatter(final String cpf) {  
		return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");		
	 }

}
