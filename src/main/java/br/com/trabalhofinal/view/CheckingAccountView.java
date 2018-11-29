package br.com.trabalhofinal.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CheckingAccountView extends JPanel {

    private JButton consulta;
    private JButton calculadora;
    private JButton sacar;
    private JLabel contaCorrente;
    private JButton emitirExtrato;
    private JButton depositar;

    public CheckingAccountView() {

    	consulta = new JButton ("Consultar Informações");
        calculadora = new JButton ("Calculadora de Investimentos");
        sacar = new JButton ("Sacar");
        contaCorrente = new JLabel ("Conta Corrente");
        emitirExtrato = new JButton ("Emitir Extrato");
        depositar = new JButton ("Depositar");

        setPreferredSize (new Dimension (599, 279));
        setLayout (null);

        add (consulta);
        add (calculadora);
        add (sacar);
        add (contaCorrente);
        add (emitirExtrato);
        add (depositar);

        consulta.setBounds (55, 80, 215, 30);
        calculadora.setBounds (55, 150, 215, 30);
        sacar.setBounds (200, 210, 215, 30);
        contaCorrente.setBounds (260, 20, 100, 25);
        emitirExtrato.setBounds (335, 80, 215, 30);
        depositar.setBounds (335, 150, 215, 30);
    }
    
    public void criaTela() {
    	
        JFrame frame = new JFrame ("Painel de Conta Corrente");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new CheckingAccountView());
        frame.pack();
        frame.setVisible (true);
    	
    }
	
}
