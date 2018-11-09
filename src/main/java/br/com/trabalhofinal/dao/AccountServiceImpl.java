package br.com.trabalhofinal.dao;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trabalhofinal.entities.Account;
import br.com.trabalhofinal.repository.AccountRepository;

public class AccountServiceImpl {

	@Autowired
	AccountRepository accountRepository;
	
	public void save(Account account) {
	}
	
}
