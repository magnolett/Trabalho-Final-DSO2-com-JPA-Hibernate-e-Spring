package br.com.trabalhofinal;

import javax.swing.JFrame;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Application implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		JFrame frame = new JFrame("ABC");
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	public static void main(final String[] args) {	
		SpringApplication.run(Application.class, args);
		
	}

	
	
}
