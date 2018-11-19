package br.com.trabalhofinal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trabalhofinal.entities.CheckingAccount;
import br.com.trabalhofinal.entities.CustomerInfo;
import br.com.trabalhofinal.repository.CustomerInfoRepository;
import br.com.trabalhofinal.service.CustomerInfoService;

public class CustomerInfoServiceImpl implements CustomerInfoService {

	@Autowired
	CustomerInfoRepository customerInfoRepository;
	
	public void save(CustomerInfo customerInfo) {
		customerInfoRepository.saveAndFlush(customerInfo);
	}
	
	public void delete(CustomerInfo customerInfoId) {
		customerInfoRepository.delete(customerInfoId);
	}
	
	public CustomerInfo findById(Long customerInfoId) {
		return customerInfoRepository.findById(customerInfoId).get();
	}
}
