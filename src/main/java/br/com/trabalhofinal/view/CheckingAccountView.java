package br.com.trabalhofinal.view;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.trabalhofinal.entities.AccountType;
import br.com.trabalhofinal.service.CustomerInfoService;

@Component
public class CheckingAccountView extends JFrame {

	@Autowired
	private CustomerInfoView customerInfoView;

	@Autowired
	private CustomerInfoService customerInfoService;
	
	@Autowired
	private FinancialInvestmentsView financialInvestmentsView;

	private JButton consulta;
	private JButton calculadora;
	private JButton sacar;
	private JLabel contaCorrente;
	private JButton emitirExtrato;
	private JButton depositar;

	public CheckingAccountView() {
		initComponents();

	}

	public void initComponents() {

		consulta = new JButton("Consultar Informações");
		calculadora = new JButton("Calculadora de Investimentos");
		sacar = new JButton("Sacar");
		contaCorrente = new JLabel("Conta Corrente");
		emitirExtrato = new JButton("Emitir Extrato");
		depositar = new JButton("Depositar");

		consulta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				customerInfoView.criaTela(customerInfoService.findCustomerByAccountType(AccountType.CHECKING_ACCOUNT));
				setVisible(false);
			}
		});

		calculadora.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				financialInvestmentsView.criaTela();
				setVisible(false);
				
			}
		});
		
		setPreferredSize(new Dimension(599, 300));
		setLayout(null);

		consulta.setBounds(55, 80, 215, 30);
		calculadora.setBounds(55, 150, 215, 30);
		sacar.setBounds(200, 210, 215, 30);
		contaCorrente.setBounds(260, 20, 100, 25);
		emitirExtrato.setBounds(335, 80, 215, 30);
		depositar.setBounds(335, 150, 215, 30);

		add(consulta);
		add(calculadora);
		add(sacar);
		add(contaCorrente);
		add(emitirExtrato);
		add(depositar);

		setLocation(640, 260);

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		getContentPane().setLayout(groupLayout);

		pack();

	}

	public void criaTela() {

		initComponents();
		setVisible(true);

	}

}
