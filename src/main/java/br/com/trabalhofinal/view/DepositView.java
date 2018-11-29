package br.com.trabalhofinal.view;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.annotation.PostConstruct;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.hibernate.boot.model.relational.InitCommand;
import org.springframework.stereotype.Component;

@Component
public class DepositView extends JFrame {

	private JLabel realizaDeposito;
	private JLabel valorDeposito;
	private JTextField inputDepoisto;
	private JButton depositar;
	private JButton voltar;

	@PostConstruct
	public void initComponents() {

		realizaDeposito = new JLabel("Realizar Depósito");
		valorDeposito = new JLabel("Valor a depositar:");
		inputDepoisto = new JTextField(5);
		depositar = new JButton("Depositar");
		voltar = new JButton("Voltar");

		setPreferredSize(new Dimension(394, 177));
		setLayout(null);

		add(realizaDeposito);
		add(valorDeposito);
		add(inputDepoisto);
		add(depositar);
		add(voltar);

		realizaDeposito.setBounds(150, 0, 155, 25);
		valorDeposito.setBounds(150, 35, 125, 25);
		inputDepoisto.setBounds(140, 70, 125, 20);
		depositar.setBounds(95, 120, 100, 25);
		voltar.setBounds(220, 120, 100, 25);

		setLocation(640, 260);

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		getContentPane().setLayout(groupLayout);

		pack();
	}

	public void criaTela() {
		setVisible(true);
	}

}
