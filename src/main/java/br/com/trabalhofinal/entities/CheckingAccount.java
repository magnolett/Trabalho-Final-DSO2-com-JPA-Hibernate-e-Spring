package br.com.trabalhofinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CHECKING_ACCOUNT")
public class CheckingAccount extends Transaction {

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
	
	@Column
	private Long bankValue;
	
	public CheckingAccount(String accountNumber, String accountPassword, Long accountBalance, CustomerInfo customerInfo) {
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.accountPassword = accountPassword;
		this.customerInfo = customerInfo;
		this.bankValue = super.getValue();
	}
	
	public CheckingAccount() {}
	
	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}
	
	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}
	
	public String getAccountPassword() {
		return accountPassword;
	}
	
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	public Long getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
}
