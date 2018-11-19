package br.com.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.trabalhofinal.entities.CustomerInfo;
import br.com.trabalhofinal.service.CustomerInfoService;

@RestController
@RequestMapping("/customerInfo")
public class CustomerInfoController {

	@Autowired
	private CustomerInfoService customerService;

	@GetMapping("/")
	public CustomerInfo findById(@RequestParam("id") final Long customerInfoId) {
		return customerService.findById(customerInfoId);
	}
	
	@PostMapping("/")
	public void save(@RequestBody final CustomerInfo customerInfo) {
		customerService.save(customerInfo);
	}
	
	@DeleteMapping("/")
	public void delete(@RequestBody final CustomerInfo customerInfo) {
		customerService.delete(customerInfo);
	}
	
}
