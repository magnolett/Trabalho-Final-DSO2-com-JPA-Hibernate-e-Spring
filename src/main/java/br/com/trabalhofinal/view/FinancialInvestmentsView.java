package br.com.trabalhofinal.view;

import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.springframework.stereotype.Component;

@Component
public class FinancialInvestmentsView extends JFrame {

	private JButton realizarInvestimento;
	private JLabel tipoInvestimento;
	private JButton calcular;
	private JRadioButton rendaFixa;
	private JRadioButton rendaVariavel;
	private JTextField inputFixa;
	private JTextField inputVariavel;
	private JLabel valorMensal;
	private JLabel numeroMeses;
	private JLabel valorResultante;
	private JTextField mostraResultante;
	private JButton menuAnterior;

	public FinancialInvestmentsView() {
		initComponents();

	}

	public void initComponents() {
		realizarInvestimento = new JButton("Realizar Investimento ");
		tipoInvestimento = new JLabel("Investimentos Financeiros");
		calcular = new JButton("Calcular");
		rendaFixa = new JRadioButton("Renda Fixa");
		rendaVariavel = new JRadioButton("Renda Variável");
		inputFixa = new JTextField(5);
		inputVariavel = new JTextField(5);
		valorMensal = new JLabel("Valor Mensal");
		numeroMeses = new JLabel("Número de Meses");
		valorResultante = new JLabel("Valor Resultante");
		mostraResultante = new JTextField(5);
		menuAnterior = new JButton("Voltar ao Menu Anterior");

		setPreferredSize(new Dimension(586, 375));
		setLayout(null);

		add(realizarInvestimento);
		add(tipoInvestimento);
		add(calcular);
		add(rendaFixa);
		add(rendaVariavel);
		add(inputFixa);
		add(inputVariavel);
		add(valorMensal);
		add(numeroMeses);
		add(valorResultante);
		add(mostraResultante);
		add(menuAnterior);

		realizarInvestimento.setBounds(200, 275, 220, 30);
		tipoInvestimento.setBounds(230, 0, 170, 55);
		calcular.setBounds(200, 170, 220, 30);
		rendaFixa.setBounds(200, 55, 100, 25);
		rendaVariavel.setBounds(310, 55, 120, 25);
		inputFixa.setBounds(200, 135, 100, 25);
		inputVariavel.setBounds(320, 135, 100, 25);
		valorMensal.setBounds(210, 100, 100, 25);
		numeroMeses.setBounds(320, 100, 110, 25);
		valorResultante.setBounds(255, 205, 100, 25);
		mostraResultante.setBounds(245, 235, 125, 25);
		menuAnterior.setBounds(200, 320, 220, 30);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		getContentPane().setLayout(groupLayout);
		
		pack();

	}

	public void criaTela() {

		// JFrame frame = new JFrame ("Painel de Conta Corrente");
		// frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		// frame.getContentPane().add (new CheckingAccountView());
		// frame.pack();
		initComponents();
		setVisible(true);

	}
}
