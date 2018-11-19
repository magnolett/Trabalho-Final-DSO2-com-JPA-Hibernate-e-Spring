package br.com.trabalhofinal.service;

import br.com.trabalhofinal.entities.FinancialInvestments;

public interface FinancialInvestmentsService {

	public void save(FinancialInvestments financialInvestments);
	public void delete(FinancialInvestments financialInvestments);
	public FinancialInvestments findById(Long financialInvestmentsId);
}
