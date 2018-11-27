package br.com.trabalhofinal.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SavingsAccountView extends JPanel {

    private JButton jcomp1;
    private JButton jcomp2;
    private JButton jcomp3;
    private JLabel jcomp4;
    private JButton jcomp5;

    public SavingsAccountView() {

    	jcomp1 = new JButton ("Consultar Informações");
        jcomp2 = new JButton ("Sacar");
        jcomp3 = new JButton ("Emitir Extrato");
        jcomp4 = new JLabel ("Conta Poupança");
        jcomp5 = new JButton ("Depositar");

        setPreferredSize (new Dimension (599, 279));
        setLayout (null);

        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);

        jcomp1.setBounds (55, 80, 215, 30);
        jcomp2.setBounds (55, 150, 215, 30);
        jcomp3.setBounds (200, 210, 215, 30);
        jcomp4.setBounds (260, 20, 100, 25);
        jcomp5.setBounds (335, 80, 215, 30);
    }
    
    public void criaTela() {
    	
        JFrame frame = new JFrame ("Painel de Conta Poupança");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new CheckingAccountView());
        frame.pack();
        frame.setVisible (true);
    	
    }
}
