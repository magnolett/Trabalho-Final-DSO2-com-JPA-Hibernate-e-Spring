package br.com.trabalhofinal.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WithdrawView extends JPanel {

    private JLabel realizaSaque;
    private JLabel valorSaque;
    private JTextField inputValorSaque;
    private JButton sacar;
    private JButton voltar;

    public WithdrawView() {

    	realizaSaque = new JLabel ("Realizar Saque");
        valorSaque = new JLabel ("Valor a sacar:");
        inputValorSaque = new JTextField (5);
        sacar = new JButton ("Sacar");
        voltar = new JButton ("Voltar");

        setPreferredSize (new Dimension (394, 177));
        setLayout (null);

        add (realizaSaque);
        add (valorSaque);
        add (inputValorSaque);
        add (sacar);
        add (voltar);

        realizaSaque.setBounds (150, 0, 155, 25);
        valorSaque.setBounds (155, 35, 125, 25);
        inputValorSaque.setBounds (135, 70, 125, 20);
        sacar.setBounds (95, 120, 100, 25);
        voltar.setBounds (220, 120, 100, 25);
    }
    
    public void criaTela() {

    	JFrame frame = new JFrame ("Sacar");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new WithdrawView());
        frame.pack();
        frame.setVisible (true);
    }
}
