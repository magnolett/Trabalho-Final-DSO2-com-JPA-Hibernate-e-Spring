package br.com.trabalhofinal.service;

import br.com.trabalhofinal.entities.CustomerInfo;

public interface CustomerInfoService {

	public void save(CustomerInfo customerInfo);
	public void delete(CustomerInfo customerInfo);
	public CustomerInfo findOne(Long customerInfoId);	
}
