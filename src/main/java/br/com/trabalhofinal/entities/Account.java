package br.com.trabalhofinal.entities;

public abstract class Account {

	private Long accountNumber;
	private CustomerInfo customerInfo;
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
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}
	public Long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
