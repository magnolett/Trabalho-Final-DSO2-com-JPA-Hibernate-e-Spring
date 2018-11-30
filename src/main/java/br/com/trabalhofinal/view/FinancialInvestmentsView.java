package br.com.trabalhofinal.view;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.annotation.PostConstruct;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FinancialInvestmentsView extends JFrame {

	@Autowired
	private CheckingAccountView checkingAccountView;
	
	private JButton realizarInvestimento;
	private JLabel tipoInvestimento;
	private JButton calcular;
	private JRadioButton rendaFixa;
	private JRadioButton rendaVariavel;
	private JTextField inputValorMensal;
	private JTextField inputNumeroMeses;
	private JLabel valorMensal;
	private JLabel numeroMeses;
	private JLabel valorResultante;
	private JTextField mostraResultante;
	private JButton menuAnterior;
	
	private Double jurosMensal;

	@PostConstruct
	public void initComponents() {
		
		realizarInvestimento = new JButton("Realizar Investimento ");
		tipoInvestimento = new JLabel("Investimentos Financeiros");
		calcular = new JButton("Calcular");
		rendaFixa = new JRadioButton("Renda Fixa");
		rendaVariavel = new JRadioButton("Renda Variável");
		inputValorMensal = new JTextField(5);
		inputNumeroMeses = new JTextField(5);
		valorMensal = new JLabel("Valor Mensal");
		numeroMeses = new JLabel("Número de Meses");
		valorResultante = new JLabel("Lucro Final");
		mostraResultante = new JTextField(5);
		menuAnterior = new JButton("Voltar ao Menu Anterior");

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rendaFixa);
		buttonGroup.add(rendaVariavel);

		realizarInvestimento.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if(mostraResultante.getText() != null && !mostraResultante.getText().isEmpty()) {
						final Double valor = Double.valueOf(inputValorMensal.getText());
						final Double meses = Double.valueOf(inputNumeroMeses.getText());
						final Double investimento = valor*meses;
						final Double lucro = investimento + (investimento*jurosMensal);
						
						JOptionPane.showMessageDialog(null, "Valor investido: R$" + investimento + " >> Valor final (soma do investimento ao rendimento): R$ " + lucro);
					}
				} catch (Exception ex) {
					if(ex instanceof NullPointerException) {
						JOptionPane.showMessageDialog(null, "Há campos em branco!");
					}
				}
				
			}
		});
		
		menuAnterior.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				checkingAccountView.criaTela();
				setVisible(false);
			}
		});
		
		rendaFixa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jurosMensal = 0.3;
			}
		});
		
		rendaVariavel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jurosMensal = 0.5;
				
			}
		});
		
		calcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				final Double calculaInvestimento = calculaInvestimento(inputValorMensal.getText().trim(), inputNumeroMeses.getText().trim());
				mostraResultante.setText("R$ "+calculaInvestimento.toString());
				
			}
		});
		
		setPreferredSize(new Dimension(586, 400));
		setLayout(null);
		
		add(realizarInvestimento);
		add(tipoInvestimento);
		add(calcular);
		add(rendaFixa);
		add(rendaVariavel);
		add(inputValorMensal);
		add(inputNumeroMeses);
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
		inputValorMensal.setBounds(200, 135, 100, 25);
		inputNumeroMeses.setBounds(320, 135, 100, 25);
		valorMensal.setBounds(210, 100, 100, 25);
		numeroMeses.setBounds(320, 100, 110, 25);
		valorResultante.setBounds(255, 205, 100, 25);
		mostraResultante.setBounds(245, 235, 125, 25);
		menuAnterior.setBounds(200, 320, 220, 30);
		
		setLocation(640, 260);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		getContentPane().setLayout(groupLayout);
		
		pack();

	}

	public void criaTela() {
		setVisible(true);
	}
	
	public Double calculaInvestimento(final String valorMensal, final String numeroMes) {
		
		try {
			if(valorMensal != null && numeroMes != null) {
				final Double valorMensalDouble = Double.valueOf(valorMensal);
				final Double numeroMesesDouble = Double.valueOf(inputNumeroMeses.getText());
				return ((valorMensalDouble * numeroMesesDouble)*jurosMensal);

			} else {
				JOptionPane.showMessageDialog(null, "Número de meses e valor mensal depositado precisam de preenchimento!");
			}
		} catch (Exception ex) {
			if(ex instanceof NullPointerException) {
				JOptionPane.showMessageDialog(null, "Número de meses e valor mensal depositado precisam de preenchimento!");
			}
		}
		return null;
		
	}
	
	
	
}
