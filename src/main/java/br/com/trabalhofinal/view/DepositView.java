package br.com.trabalhofinal.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DepositView extends JPanel {
    
	private JLabel realizaDeposito;
    private JLabel valorDeposito;
    private JTextField inputDepoisto;
    private JButton depositar;
    private JButton voltar;

    public DepositView() {

    	realizaDeposito = new JLabel ("Realizar Depósito");
        valorDeposito = new JLabel ("Valor a depositar:");
        inputDepoisto = new JTextField (5);
        depositar = new JButton ("Depositar");
        voltar = new JButton ("Voltar");

        setPreferredSize (new Dimension (394, 177));
        setLayout (null);

        add (realizaDeposito);
        add (valorDeposito);
        add (inputDepoisto);
        add (depositar);
        add (voltar);

        realizaDeposito.setBounds (150, 0, 155, 25);
        valorDeposito.setBounds (150, 35, 125, 25);
        inputDepoisto.setBounds (140, 70, 125, 20);
        depositar.setBounds (95, 120, 100, 25);
        voltar.setBounds (220, 120, 100, 25);
    }
    
    public void criaTela() {
    	
        JFrame frame = new JFrame ("Depositar");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new DepositView());
        frame.pack();
        frame.setVisible (true);
    }
	
}
