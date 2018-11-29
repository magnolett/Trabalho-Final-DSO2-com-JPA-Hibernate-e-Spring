package br.com.trabalhofinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.trabalhofinal.entities.AccountType;
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

		CustomerInfo customerInfoCheck = new CustomerInfo("Marcos", "Vinicius", "11122233344", "Rua XY", "1000", 
				AccountType.CHECKING_ACCOUNT);
		
		CustomerInfo customerInfoSavings = new CustomerInfo("Luiz", "Fernando", "44433322211", "Rua YX", "5000", 
				AccountType.SAVINGS_ACCOUNT);
		
		SavingsAccount savingsAccount = new SavingsAccount("123", "123", 6000l, customerInfoCheck);
		CheckingAccount checkingAccount = new CheckingAccount("abc", "abc", 10000l, customerInfoSavings);
		
		customerInfoService.save(customerInfoCheck);
		customerInfoService.save(customerInfoSavings);

		savingsAccountService.save(savingsAccount);
		checkingAccountService.save(checkingAccount);
		
		
//		authenticationView.criaTela();
		
	}
	
	public static void main(final String[] args) {	

		ConfigurableApplicationContext context = new SpringApplicationBuilder(Application.class).headless(false).run(args);
	    AuthenticationView appFrame = context.getBean(AuthenticationView.class);
	    
        appFrame.setVisible(true);
		
	}

	
	
}
