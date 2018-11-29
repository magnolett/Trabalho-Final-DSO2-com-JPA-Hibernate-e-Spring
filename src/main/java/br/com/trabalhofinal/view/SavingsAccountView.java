package br.com.trabalhofinal.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.annotation.PostConstruct;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.trabalhofinal.entities.AccountType;
import br.com.trabalhofinal.entities.Authentication;
import br.com.trabalhofinal.service.CustomerInfoService;

@Component
public class SavingsAccountView extends JFrame {

	@Autowired
	private AuthenticationView authenticationView;
	
	@Autowired
	private CustomerInfoService customerInfoService;

	@Autowired
	private CustomerInfoView customerInfoView;
	
    private JButton consultaInfo;
    private JButton saca;
    private JButton emiteExtrato;
    private JLabel contaPoupanca;
    private JButton depositar; 
    private JButton voltar;

    @PostConstruct
    public void initComponents() {

    	consultaInfo = new JButton ("Consultar Informações");
        saca = new JButton ("Sacar");
        emiteExtrato = new JButton ("Emitir Extrato");
        contaPoupanca = new JLabel ("Conta Poupança");
        depositar = new JButton ("Depositar");
        voltar = new JButton("Logout");

        consultaInfo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				customerInfoView.criaTela(customerInfoService.findCustomerByAccountType(AccountType.SAVINGS_ACCOUNT));
				setVisible(false);
			}
		});
        
        voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				authenticationView.criaTela();
				setVisible(false);
			}
		});
        
        setPreferredSize (new Dimension (599, 300));
        setLayout (null);

        add (consultaInfo);
        add (saca);
        add (emiteExtrato);
        add (contaPoupanca);
        add (depositar);
        add (voltar);

        voltar.setBounds (200, 210, 215, 30);
        consultaInfo.setBounds (55, 80, 215, 30);
        saca.setBounds (55, 150, 215, 30);
        emiteExtrato.setBounds (335, 150, 215, 30);
        contaPoupanca.setBounds (260, 20, 100, 25);
        depositar.setBounds (335, 80, 215, 30);

		setLocation(640, 260);

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		getContentPane().setLayout(groupLayout);
		
		pack();
    }
    
    public void criaTela() {
        setVisible (true);
    }
}
