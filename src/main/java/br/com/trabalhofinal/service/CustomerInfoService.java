package br.com.trabalhofinal.service;

import br.com.trabalhofinal.entities.AccountType;
import br.com.trabalhofinal.entities.CustomerInfo;

public interface CustomerInfoService {

	public void save(CustomerInfo customerInfo);
	public void delete(CustomerInfo customerInfo);
	public CustomerInfo findById(Long customerInfoId);	
	public CustomerInfo findCustomerByAccountType(AccountType accountType);
}	
