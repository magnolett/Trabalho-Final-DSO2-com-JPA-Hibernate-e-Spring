package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.trabalhofinal.entities.CustomerInfo;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Long> {

	@Query("SELECT c FROM CustomerInfo c LEFT JOIN account a on p.account_id = a.id")
	public CustomerInfo findByAccountNumber(final String accountNumber);
	
}


