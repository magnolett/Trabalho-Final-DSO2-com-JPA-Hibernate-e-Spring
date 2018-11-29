package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import br.com.trabalhofinal.entities.AccountType;
import br.com.trabalhofinal.entities.CustomerInfo;

@Component
public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Long> {

	@Query("SELECT c FROM CustomerInfo c WHERE c.accountType = :accountType")
	CustomerInfo findCustomerByAccountType(final AccountType accountType);
	
}


