package br.com.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.trabalhofinal.entities.CheckingAccount;
import br.com.trabalhofinal.service.CheckingAccountService;

@RestController
@RequestMapping("/checkingAccount")
public class CheckingAccountController {

	@Autowired
	private CheckingAccountService checkingAccountService;
	
	@GetMapping("/")
	public CheckingAccount findById(@RequestParam("id") final Long checkingAccountId) {
		return checkingAccountService.findById(checkingAccountId);
	}
	
	@PostMapping("/")
	public void save(@RequestBody final CheckingAccount checkingAccount) {
		checkingAccountService.save(checkingAccount);
	}
	
	@DeleteMapping("/")
	public void delete(@RequestBody final CheckingAccount checkingAccount) {
		checkingAccountService.delete(checkingAccount);
	}
}
