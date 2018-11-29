package br.com.trabalhofinal.view;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.springframework.stereotype.Component;

@Component
public class SavingsAccountView extends JFrame {

    private JButton consultaInfo;
    private JButton saca;
    private JButton emiteExtrato;
    private JLabel contaPoupanca;
    private JButton depositar; 

    public SavingsAccountView() {
    	initComponents();
    }
    
    public void initComponents() {

    	consultaInfo = new JButton ("Consultar Informações");
        saca = new JButton ("Sacar");
        emiteExtrato = new JButton ("Emitir Extrato");
        contaPoupanca = new JLabel ("Conta Poupança");
        depositar = new JButton ("Depositar");

        setPreferredSize (new Dimension (599, 279));
        setLayout (null);

        add (consultaInfo);
        add (saca);
        add (emiteExtrato);
        add (contaPoupanca);
        add (depositar);

        consultaInfo.setBounds (55, 80, 215, 30);
        saca.setBounds (55, 150, 215, 30);
        emiteExtrato.setBounds (200, 210, 215, 30);
        contaPoupanca.setBounds (260, 20, 100, 25);
        depositar.setBounds (335, 80, 215, 30);
    
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		getContentPane().setLayout(groupLayout);
		
		pack();
    }
    
    public void criaTela() {
    	
//        JFrame frame = new JFrame ("Painel de Conta Poupança");
//        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().add (new CheckingAccountView());
//        frame.pack();
//        frame.setVisible (true);
        initComponents();
        setVisible (true);
    }
}
