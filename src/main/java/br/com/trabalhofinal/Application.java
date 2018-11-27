package br.com.trabalhofinal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.trabalhofinal.view.AuthenticationView;

@Configuration
@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class Application implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		new AuthenticationView().criaTela();
	}
	
	public static void main(final String[] args) {	
		SpringApplication.run(Application.class, args);
		
	}

	
	
}
