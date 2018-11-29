package br.com.trabalhofinal.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.trabalhofinal.entities.AccountType;
import br.com.trabalhofinal.service.CheckingAccountService;
import br.com.trabalhofinal.service.CustomerInfoService;
import br.com.trabalhofinal.service.SavingsAccountService;

@Component
public class AuthenticationView extends JPanel {

	@Autowired
	private CustomerInfoService customerInfoService;

	@Autowired
	private CheckingAccountService checkingAccountService;

	@Autowired
	private SavingsAccountService savingsAccountService;
	
	private JLabel numeroConta;
	private JTextField inputConta;
	private JLabel senha;
	private JPasswordField inputSenha;
	private JButton entrar;
	private JButton limpar;

	public AuthenticationView() {

		numeroConta = new JLabel("Número da Conta:");
		inputConta = new JTextField(5);
		senha = new JLabel("Senha:");
		inputSenha = new JPasswordField(5);
		entrar = new JButton("Entrar");
		limpar = new JButton("Limpar");

		entrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				validaContaESenha(inputConta.getText(), inputSenha.getPassword());
			}
		});

		limpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputConta.setText("");
				inputSenha.setText("");

			}
		});

		setPreferredSize(new Dimension(590, 261));
		setLayout(null);

		add(numeroConta);
		add(inputConta);
		add(senha);
		add(inputSenha);
		add(entrar);
		add(limpar);

		numeroConta.setBounds(235, 40, 120, 20);
		inputConta.setBounds(220, 65, 135, 20);
		senha.setBounds(260, 90, 100, 25);
		inputSenha.setBounds(220, 115, 135, 20);
		entrar.setBounds(175, 175, 100, 25);
		limpar.setBounds(300, 175, 100, 25);
	}

	public void criaTela() {
		JFrame frame = new JFrame("Tela de Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new AuthenticationView());
		frame.pack();
		frame.setVisible(true);

	}

	public void validaContaESenha(final String accountNumber, final char[] accountPassword) {

		try {

			String password = String.valueOf(accountPassword);
			
			if (checkingAccountService.findByAccountNumberAndPassword(accountNumber, password) != null) {
				validaTipoConta(AccountType.CHECKING_ACCOUNT);
			} else if (savingsAccountService.findByAccountNumberAndPassword(accountNumber, password) != null) {
				validaTipoConta(AccountType.SAVINGS_ACCOUNT);
			}
		} catch (Exception e) {
			if (e instanceof NullPointerException) {
				JOptionPane.showMessageDialog(null,
						"O número da conta não está relacionado" + "à senha! Favor tentar novamente.");
			} else {
				e.printStackTrace();
				System.out.println("Erro de sistema.");
			}
		}
	}

	public void validaTipoConta(final AccountType accountType) {

		if (accountType.equals(AccountType.CHECKING_ACCOUNT)) {
//			new CheckingAccountView().criaTela();
		} else {
//			new SavingsAccountView().criaTela();
		}
	}
}
