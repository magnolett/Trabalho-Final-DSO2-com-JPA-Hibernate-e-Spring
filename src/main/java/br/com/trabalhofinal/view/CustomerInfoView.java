package br.com.trabalhofinal.view;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class CustomerInfoView extends JPanel {

    private JLabel nome;
    private JLabel sobrenome;
    private JLabel cpf;
    private JLabel endereco;
    private JLabel renda;
    private JButton voltar;
    private JTextField showNome;
    private JTextField showSenha;
    private JTextField showCpf;
    private JTextField showEndereco;
    private JTextField showRenda;

    public CustomerInfoView() {
        //construct components
        nome = new JLabel ("Nome");
        sobrenome = new JLabel ("Sobrenome");
        cpf = new JLabel ("CPF");
        endereco = new JLabel ("Endereço");
        renda = new JLabel ("Renda Cadastrada");
        voltar = new JButton ("Voltar");
        showNome = new JTextField (5);
        showSenha = new JTextField (5);
        showCpf = new JTextField (5);
        showEndereco = new JTextField (5);
        showRenda = new JTextField (5);

        setPreferredSize (new Dimension (482, 283));
        setLayout (null);

        add (nome);
        add (sobrenome);
        add (cpf);
        add (endereco);
        add (renda);
        add (voltar);
        add (showNome);
        add (showSenha);
        add (showCpf);
        add (showEndereco);
        add (showRenda);

        nome.setBounds (95, 10, 100, 25);
        sobrenome.setBounds (80, 75, 100, 25);
        cpf.setBounds (100, 145, 100, 25);
        endereco.setBounds (350, 40, 100, 25);
        renda.setBounds (335, 115, 110, 25);
        voltar.setBounds (200, 230, 100, 25);
        showNome.setBounds (65, 45, 100, 25);
        showSenha.setBounds (65, 115, 100, 25);
        showCpf.setBounds (65, 180, 100, 25);
        showEndereco.setBounds (330, 75, 100, 25);
        showRenda.setBounds (335, 160, 100, 25);
    }

	
}
