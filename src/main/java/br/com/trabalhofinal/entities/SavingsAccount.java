package br.com.trabalhofinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SAVINGS_ACCOUNT")
public class SavingsAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String accountNumber;
	
	@Column
	private String accountPassword;
	
	@Column
	private Long accountBalance;
	
	@OneToOne
	private CustomerInfo customerInfo;
	
	public SavingsAccount(String accountNumber, String accountPassword, Long accountBalance, CustomerInfo customerInfo) {
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.accountPassword = accountPassword;
		this.customerInfo = customerInfo;
		
	}
	
	public SavingsAccount() {}
	
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}
	
	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Long getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public String getAccountPassword() {
		return accountPassword;
	}
	
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
}
