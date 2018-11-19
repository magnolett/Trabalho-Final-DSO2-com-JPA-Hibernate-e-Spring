package br.com.trabalhofinal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trabalhofinal.entities.FinancialInvestments;
import br.com.trabalhofinal.repository.FinancialInvestmentsRepository;
import br.com.trabalhofinal.service.FinancialInvestmentsService;

public class FinancialInvestmentsServiceImpl implements FinancialInvestmentsService {

	@Autowired
	FinancialInvestmentsRepository financialInvestmentsRepository; 
	
	@Override
	public void save(FinancialInvestments financialInvestments) {
		financialInvestmentsRepository.save(financialInvestments);
	}

	@Override
	public void delete(FinancialInvestments financialInvestments) {
		financialInvestmentsRepository.delete(financialInvestments);
		
	}

	@Override
	public FinancialInvestments findOne(Long financialInvestmentsId) {
		return financialInvestmentsRepository.findOne(financialInvestmentsId);
	}

}
