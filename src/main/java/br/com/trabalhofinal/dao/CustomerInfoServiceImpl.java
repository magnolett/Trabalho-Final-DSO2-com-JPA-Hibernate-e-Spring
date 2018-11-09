package br.com.trabalhofinal.dao;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trabalhofinal.entities.CheckingAccount;
import br.com.trabalhofinal.entities.CustomerInfo;
import br.com.trabalhofinal.repository.CustomerInfoRepository;

public class CustomerInfoServiceImpl {

	@Autowired
	CustomerInfoRepository customerInfoRepository;
	
	public void save(CustomerInfo customerInfo) {
		customerInfoRepository.saveAndFlush(customerInfo);
	}
	
	public void delete(Long customerInfoId) {
		customerInfoRepository.delete(customerInfoId);
	}
	
	public CheckingAccount getAuthById(Long checkingAccountId) {
		return customerInfoRepository.findOne(checkingAccountId);
	}
}
