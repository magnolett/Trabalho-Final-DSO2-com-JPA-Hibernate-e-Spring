package br.com.trabalhofinal.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Account {

	private Long accountNumber;
	private Long accountBalance;
	
	public Account(Long accountNumber, Long accountBalance) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public Account() {
	}
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
