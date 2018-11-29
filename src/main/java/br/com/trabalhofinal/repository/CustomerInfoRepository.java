package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.trabalhofinal.entities.AccountType;
import br.com.trabalhofinal.entities.CheckingAccount;
import br.com.trabalhofinal.entities.CustomerInfo;
import br.com.trabalhofinal.entities.SavingsAccount;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Long> {

}


