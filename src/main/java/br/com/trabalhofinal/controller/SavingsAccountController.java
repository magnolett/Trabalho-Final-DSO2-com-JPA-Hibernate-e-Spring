package br.com.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.trabalhofinal.entities.SavingsAccount;
import br.com.trabalhofinal.service.SavingsAccountService;

@RestController
@RequestMapping("/savingsAccount")
public class SavingsAccountController {

	@Autowired
	SavingsAccountService savingsAccountService;
	
	@GetMapping("/")
	public SavingsAccount findById(@RequestParam("id") final Long savingsAccountId) {
		return savingsAccountService.findById(savingsAccountId);
	}
	
	@PostMapping("/")
	public void save(@RequestBody final SavingsAccount savingsAccount) {
		savingsAccountService.save(savingsAccount);
	}
	
	@DeleteMapping("/")
	public void delete(@RequestBody final SavingsAccount savingsAccount) {
		savingsAccountService.delete(savingsAccount);
	}
	
}
