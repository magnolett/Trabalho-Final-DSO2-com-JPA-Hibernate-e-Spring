package br.com.trabalhofinal.dao;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trabalhofinal.entities.CheckingAccount;
import br.com.trabalhofinal.repository.CheckingAccountRepository;

public class CheckingAccountServiceImpl {

	@Autowired
	CheckingAccountRepository checkingAccountRepository;
	
	public void save(CheckingAccount checkingAccount) {
		checkingAccountRepository.saveAndFlush(checkingAccount);
	}
	
	public void delete(CheckingAccount checkingAccount) {
		checkingAccountRepository.delete(checkingAccount);
	}
	
	public CheckingAccount getAuthById(Long checkingAccountId) {
		return checkingAccountRepository.findOne(checkingAccountId);
	}
	
}
