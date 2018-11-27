package br.com.trabalhofinal.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExtractView extends JPanel {

    private JLabel jcomp1;
    private JLabel jcomp2;
    private JButton jcomp3;
    private JButton jcomp4;
    private JComboBox selecione;

    @SuppressWarnings("unchecked")
	public ExtractView() {

    	String[] selecioneItems = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        jcomp1 = new JLabel ("Emitir Extrato");
        jcomp2 = new JLabel ("Selecione o mês:");
        jcomp3 = new JButton ("Emitir Extrato");
        jcomp4 = new JButton ("Voltar");
        selecione = new JComboBox (selecioneItems);

        setPreferredSize (new Dimension (394, 177));
        setLayout (null);

        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (selecione);

        jcomp1.setBounds (150, 0, 155, 25);
        jcomp2.setBounds (145, 30, 125, 25);
        jcomp3.setBounds (90, 120, 120, 25);
        jcomp4.setBounds (220, 120, 100, 25);
        selecione.setBounds (130, 65, 135, 30);
    }
    
    public void criaTela() {
    	
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new ExtractView());
        frame.pack();
        frame.setVisible (true);
    }
}
