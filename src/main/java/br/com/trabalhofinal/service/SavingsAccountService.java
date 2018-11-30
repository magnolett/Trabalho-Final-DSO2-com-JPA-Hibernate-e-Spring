package br.com.trabalhofinal.service;

import br.com.trabalhofinal.entities.CustomerInfo;
import br.com.trabalhofinal.entities.SavingsAccount;

public interface SavingsAccountService {

	public void save(SavingsAccount savingsAccount);
	public void delete(SavingsAccount savingsAccount);
	public SavingsAccount findById(Long savingsAccountService);	
	public SavingsAccount findByAccountNumberAndPassword(final String accountNumber, final String accountPassword);	
	public SavingsAccount findByCostumerInfo(final CustomerInfo customerInfo);
	
}
