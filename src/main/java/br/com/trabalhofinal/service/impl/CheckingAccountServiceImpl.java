package br.com.trabalhofinal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.trabalhofinal.entities.CheckingAccount;
import br.com.trabalhofinal.repository.CheckingAccountRepository;
import br.com.trabalhofinal.service.CheckingAccountService;

@Component
public class CheckingAccountServiceImpl implements CheckingAccountService {

	@Autowired
	CheckingAccountRepository checkingAccountRepository;

	public void save(CheckingAccount checkingAccount) {
		checkingAccountRepository.saveAndFlush(checkingAccount);
	}

	public void delete(CheckingAccount checkingAccount) {
		checkingAccountRepository.delete(checkingAccount);
	}

	public CheckingAccount findById(Long checkingAccountId) {
		return checkingAccountRepository.findById(checkingAccountId).get();
	}

	public CheckingAccount findByAccountNumberAndPassword(final String accountNumber, final String accountPassword) {
		return checkingAccountRepository.findByAccountNumberAndPassword(accountNumber, accountPassword);
		
	}

}
