package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.trabalhofinal.entities.CustomerInfo;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Long> {

	@Query("SELECT * FROM CustomerInfo c WHERE c.account.accountNumber = ?0")
	public CustomerInfo findByAccountNumber(final String accountNumber);
	
}


