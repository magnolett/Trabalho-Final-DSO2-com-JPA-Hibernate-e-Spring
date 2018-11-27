package br.com.trabalhofinal.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class DepositView extends JPanel {
    
	private JLabel jcomp1;
    private JLabel jcomp2;
    private JPasswordField jcomp3;
    private JButton jcomp4;
    private JButton jcomp5;

    public DepositView() {

    	jcomp1 = new JLabel ("Realizar Depósito");
        jcomp2 = new JLabel ("Valor a depositar:");
        jcomp3 = new JPasswordField (5);
        jcomp4 = new JButton ("Depositar");
        jcomp5 = new JButton ("Voltar");

        setPreferredSize (new Dimension (394, 177));
        setLayout (null);

        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);

        jcomp1.setBounds (150, 0, 155, 25);
        jcomp2.setBounds (150, 35, 125, 25);
        jcomp3.setBounds (140, 70, 125, 20);
        jcomp4.setBounds (95, 120, 100, 25);
        jcomp5.setBounds (220, 120, 100, 25);
    }
    
    public void criaTela() {
    	
        JFrame frame = new JFrame ("Depositar");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new DepositView());
        frame.pack();
        frame.setVisible (true);
    }
	
}
