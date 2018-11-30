package br.com.trabalhofinal.service;

import br.com.trabalhofinal.entities.CheckingAccount;
import br.com.trabalhofinal.entities.CustomerInfo;

public interface CheckingAccountService {

	public void save(CheckingAccount checkingAccount);
	public void delete(CheckingAccount checkingAccount);
	public CheckingAccount findById(Long checkingAccountId);
	public CheckingAccount findByAccountNumberAndPassword(final String accountNumber, final String accountPassword);	
//	public CheckingAccount findByCostumerInfo(final CustomerInfo customerInfo);
	CheckingAccount findByCostumerInfo(Long customerInfoId);
}
