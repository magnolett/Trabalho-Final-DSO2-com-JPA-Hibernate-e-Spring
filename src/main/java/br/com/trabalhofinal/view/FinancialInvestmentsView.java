package br.com.trabalhofinal.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class FinancialInvestmentsView extends JPanel {
    private JButton jcomp1;
    private JLabel jcomp2;
    private JButton jcomp3;
    private JRadioButton jcomp4;
    private JRadioButton jcomp5;
    private JPasswordField jcomp6;
    private JPasswordField jcomp7;
    private JLabel jcomp8;
    private JLabel jcomp9;
    private JLabel jcomp10;
    private JPasswordField jcomp11;
    private JButton jcomp12;

    public FinancialInvestmentsView() {
        jcomp1 = new JButton ("Realizar Investimento ");
        jcomp2 = new JLabel ("Investimentos Financeiros");
        jcomp3 = new JButton ("Calcular");
        jcomp4 = new JRadioButton ("Renda Fixa");
        jcomp5 = new JRadioButton ("Renda Variável");
        jcomp6 = new JPasswordField (5);
        jcomp7 = new JPasswordField (5);
        jcomp8 = new JLabel ("Valor Mensal");
        jcomp9 = new JLabel ("Número de Meses");
        jcomp10 = new JLabel ("Valor Resultante");
        jcomp11 = new JPasswordField (5);
        jcomp12 = new JButton ("Voltar ao Menu Anterior");

        setPreferredSize (new Dimension (586, 375));
        setLayout (null);

        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);

        jcomp1.setBounds (200, 275, 220, 30);
        jcomp2.setBounds (230, 0, 170, 55);
        jcomp3.setBounds (200, 170, 220, 30);
        jcomp4.setBounds (200, 55, 100, 25);
        jcomp5.setBounds (310, 55, 120, 25);
        jcomp6.setBounds (200, 135, 100, 25);
        jcomp7.setBounds (320, 135, 100, 25);
        jcomp8.setBounds (210, 100, 100, 25);
        jcomp9.setBounds (320, 100, 110, 25);
        jcomp10.setBounds (255, 205, 100, 25);
        jcomp11.setBounds (245, 235, 125, 25);
        jcomp12.setBounds (200, 320, 220, 30);
    }

    public void criaTela() {
    	
        JFrame frame = new JFrame ("Investimentos Financeiros");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new FinancialInvestmentsView());
        frame.pack();
        frame.setVisible (true);
    }
}
