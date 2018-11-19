package br.com.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.trabalhofinal.entities.FinancialInvestments;
import br.com.trabalhofinal.service.FinancialInvestmentsService;

@RestController
@RequestMapping
public class FinancialInvestmentsController {

	@Autowired
	FinancialInvestmentsService financialInvestmentsService;
	
	@GetMapping("/")
	public FinancialInvestments findById(@RequestParam("id") final Long financialInvestmentsId) {
		return financialInvestmentsService.findById(financialInvestmentsId);
	}
	
	@PostMapping("/")
	public void save(@RequestBody final FinancialInvestments financialInvestments) {
		financialInvestmentsService.save(financialInvestments);
	}
	
	@DeleteMapping("/")
	public void delete(@RequestBody final FinancialInvestments financialInvestments) {
		financialInvestmentsService.delete(financialInvestments);
	}
}
