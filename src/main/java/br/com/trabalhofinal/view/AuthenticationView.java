package br.com.trabalhofinal.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trabalhofinal.entities.CustomerInfo;
import br.com.trabalhofinal.service.CustomerInfoService;

public class AuthenticationView extends JPanel {
	
	@Autowired
	private CustomerInfoService customerInfoService;
	
    private JLabel jcomp1;
    private JTextField jcomp2;
    private JLabel jcomp3;
    private JTextField jcomp4;
    private JButton jcomp5;
    private JButton jcomp6;

    public AuthenticationView() {

    	jcomp1 = new JLabel ("Número da Conta:");
        jcomp2 = new JTextField (5);
        jcomp3 = new JLabel ("Senha:");
        jcomp4 = new JTextField (5);
        jcomp5 = new JButton ("Entrar");
        jcomp6 = new JButton ("Limpar");

        setPreferredSize (new Dimension (590, 261));
        setLayout (null);

        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);

        jcomp1.setBounds (235, 40, 120, 20);
        jcomp2.setBounds (220, 65, 135, 20);
        jcomp3.setBounds (260, 90, 100, 25);
        jcomp4.setBounds (220, 115, 135, 20);
        jcomp5.setBounds (175, 175, 100, 25);
        jcomp6.setBounds (300, 175, 100, 25);
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
