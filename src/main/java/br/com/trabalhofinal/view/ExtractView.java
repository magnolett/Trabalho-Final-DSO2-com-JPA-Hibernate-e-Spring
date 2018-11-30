package br.com.trabalhofinal.view;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.annotation.PostConstruct;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.springframework.stereotype.Component;

@Component
public class ExtractView extends JFrame {

	private JLabel emitirExtrato;
	private JLabel selecionarMes;
	private JButton emiteExtrato;
	private JButton voltar;
	private JComboBox selecione;

	@PostConstruct
	@SuppressWarnings("unchecked")
	public void initComponents() {

		String[] selecioneItems = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" };

		emitirExtrato = new JLabel("Emitir Extrato");
		selecionarMes = new JLabel("Selecione o mês:");
		emiteExtrato = new JButton("Emitir Extrato");
		voltar = new JButton("Voltar");
		selecione = new JComboBox(selecioneItems);

		setPreferredSize(new Dimension(394, 177));
		setLayout(null);

		add(emitirExtrato);
		add(selecionarMes);
		add(emiteExtrato);
		add(voltar);
		add(selecione);

		emitirExtrato.setBounds(150, 0, 155, 25);
		selecionarMes.setBounds(145, 30, 125, 25);
		emiteExtrato.setBounds(90, 120, 120, 25);
		voltar.setBounds(220, 120, 100, 25);
		selecione.setBounds(130, 65, 135, 30);

		setLocation(640, 260);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		getContentPane().setLayout(groupLayout);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pack();
	}

	public void criaTela() {
		setVisible(true);

	}
}
