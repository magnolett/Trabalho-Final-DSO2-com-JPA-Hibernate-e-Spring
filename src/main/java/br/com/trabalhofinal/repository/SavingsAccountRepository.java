package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.trabalhofinal.entities.SavingsAccount;

public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Long> {

	@Query("SELECT c FROM SavingsAccount c WHERE c.accountNumber = ?0 AND c.accountPassword = ?1")
	public SavingsAccount findByAccountNumberAndPassword(final String accountNumber, final String accountPassword);
	
}
