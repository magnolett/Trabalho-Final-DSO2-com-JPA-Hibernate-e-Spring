package br.com.trabalhofinal.service;

import br.com.trabalhofinal.entities.CheckingAccount;

public interface CheckingAccountService {

	public void save(CheckingAccount checkingAccount);
	public void delete(CheckingAccount checkingAccount);
	public CheckingAccount findById(Long checkingAccountId);
	public CheckingAccount findByAccountNumberAndPassword(final String accountNumber, final String accountPassword);	

}
