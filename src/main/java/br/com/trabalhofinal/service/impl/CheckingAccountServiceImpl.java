package br.com.trabalhofinal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trabalhofinal.entities.CheckingAccount;
import br.com.trabalhofinal.repository.CheckingAccountRepository;
import br.com.trabalhofinal.service.CheckingAccountService;

public class CheckingAccountServiceImpl implements CheckingAccountService {

	@Autowired
	CheckingAccountRepository checkingAccountRepository;
	
	public void save(CheckingAccount checkingAccount) {
		checkingAccountRepository.saveAndFlush(checkingAccount);
	}
	
	public void delete(CheckingAccount checkingAccount) {
		checkingAccountRepository.delete(checkingAccount);
	}
	
	public CheckingAccount findOne(Long checkingAccountId) {
		return checkingAccountRepository.findOne(checkingAccountId);
	}
	
}
