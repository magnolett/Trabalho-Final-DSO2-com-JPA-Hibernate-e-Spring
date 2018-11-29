package br.com.trabalhofinal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUTHENTICATION")
public class Authentication {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private Long customerAccountNumber;
	
	@Column
	private String customerPassword;
	
	public Authentication(Long customerAccountNumber, String customerPassword) {
		this.customerAccountNumber = customerAccountNumber;
		this.customerPassword = customerPassword;
	}

	public Authentication() {}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getCustomerAccountNumber() {
		return customerAccountNumber;
	}
	public void setCustomerAccountNumber(Long customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	
	
}
