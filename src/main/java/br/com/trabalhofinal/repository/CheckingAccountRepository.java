package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import br.com.trabalhofinal.entities.CheckingAccount;

@Component
public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Long> {

	@Query("SELECT c FROM CheckingAccount c WHERE c.accountNumber = :accountNumber AND c.accountPassword = :accountPassword")
	public CheckingAccount findByAccountNumberAndPassword(@Param("accountNumber") 
	final String accountNumber, @Param("accountPassword") final String accountPassword);

}
