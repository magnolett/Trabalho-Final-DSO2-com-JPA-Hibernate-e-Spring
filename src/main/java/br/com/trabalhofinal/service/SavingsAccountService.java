package br.com.trabalhofinal.service;

import br.com.trabalhofinal.entities.SavingsAccount;

public interface SavingsAccountService {

	public void save(SavingsAccount savingsAccount);
	public void delete(SavingsAccount savingsAccount);
	public SavingsAccount findOne(Long savingsAccountService);	
	
}
