package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import br.com.trabalhofinal.entities.SavingsAccount;

@Component
public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Long> {

	@Query("SELECT c FROM SavingsAccount c WHERE c.accountNumber = :accountNumber AND c.accountPassword = :accountPassword")
	public SavingsAccount findByAccountNumberAndPassword(final String accountNumber, final String accountPassword);
	
}
