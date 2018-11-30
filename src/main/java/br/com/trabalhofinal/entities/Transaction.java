package br.com.trabalhofinal.entities;

import javax.persistence.MappedSuperclass;

import org.springframework.stereotype.Component;

@MappedSuperclass
public abstract class Transaction {

	private Long value;

	public Transaction() {
	}
	
	public Transaction(Long value) {
		this.value = value;
	}
	
	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}
	
	
}
