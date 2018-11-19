package br.com.trabalhofinal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trabalhofinal.entities.SavingsAccount;
import br.com.trabalhofinal.repository.SavingsAccountRepository;
import br.com.trabalhofinal.service.SavingsAccountService;

public class SavingsAccountServiceImpl implements SavingsAccountService {

	@Autowired
	SavingsAccountRepository savingsAccountRepository;
	
	@Override
	public void save(SavingsAccount savingsAccount) {
		savingsAccountRepository.save(savingsAccount);
	}

	@Override
	public void delete(SavingsAccount savingsAccount) {
		savingsAccountRepository.delete(savingsAccount);
	}

	@Override
	public SavingsAccount findById(Long savingsAccountId) {
		return savingsAccountRepository.findById(savingsAccountId).get();
	}

}
