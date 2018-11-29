package br.com.trabalhofinal.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trabalhofinal.service.CustomerInfoService;

public class AuthenticationView extends JPanel {
	
	@Autowired
	private CustomerInfoService customerInfoService;
	
    private JLabel numeroConta;
    private JTextField inputConta;
    private JLabel senha;
    private JPasswordField inputSenha;
    private JButton entrar;
    private JButton limpar;

    public AuthenticationView() {

    	numeroConta = new JLabel ("Número da Conta:");
        inputConta = new JTextField (5);
        senha = new JLabel ("Senha:");
        inputSenha = new JPasswordField (5);
        entrar = new JButton ("Entrar");
        limpar = new JButton ("Limpar");

        setPreferredSize (new Dimension (590, 261));
        setLayout (null);

        add (numeroConta);
        add (inputConta);
        add (senha);
        add (inputSenha);
        add (entrar);
        add (limpar);

        numeroConta.setBounds (235, 40, 120, 20);
        inputConta.setBounds (220, 65, 135, 20);
        senha.setBounds (260, 90, 100, 25);
        inputSenha.setBounds (220, 115, 135, 20);
        entrar.setBounds (175, 175, 100, 25);
        limpar.setBounds (300, 175, 100, 25);
    }
    
    public void criaTela() {
        JFrame frame = new JFrame ("Tela de Login");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new AuthenticationView());
        frame.pack();
        frame.setVisible (true);
    	
    }
    
    public boolean validaConta(final String accountNumber) {
		return false;

    }
}
