package br.com.trabalhofinal;

import java.awt.EventQueue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.trabalhofinal.entities.CheckingAccount;
import br.com.trabalhofinal.entities.CustomerInfo;
import br.com.trabalhofinal.entities.SavingsAccount;
import br.com.trabalhofinal.service.CheckingAccountService;
import br.com.trabalhofinal.service.CustomerInfoService;
import br.com.trabalhofinal.service.SavingsAccountService;
import br.com.trabalhofinal.view.AuthenticationView;

@Configuration
@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class Application implements CommandLineRunner{

	@Autowired
	private SavingsAccountService savingsAccountService;

	@Autowired
	private CheckingAccountService checkingAccountService;
	
	@Autowired
	private CustomerInfoService customerInfoService;
	
	@Override
	public void run(String... args) throws Exception {

	    SavingsAccount savingsAccount = new SavingsAccount("123", "123", 6000l);
		CheckingAccount checkingAccount = new CheckingAccount("abc", "abc", 10000l);
		CustomerInfo customerInfo = new CustomerInfo("Marcos", "Vinicius", "11122233344", "Rua XY", 500l);
		
		savingsAccountService.save(savingsAccount);
		checkingAccountService.save(checkingAccount);
		customerInfoService.save(customerInfo);

//		authenticationView.criaTela();
		
	}
	
	public static void main(final String[] args) {	

		ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class).headless(false).run(args);
	    AuthenticationView appFrame = context.getBean(AuthenticationView.class);
        appFrame.setVisible(true);
        appFrame.criaTela();
		
	}

	
	
}
