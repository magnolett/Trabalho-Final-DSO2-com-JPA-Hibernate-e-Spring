package br.com.trabalhofinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.trabalhofinal.entities.Authentication;
import br.com.trabalhofinal.service.AuthenticationService;

@RestController
@RequestMapping("/authentication")
public class AuthenticationController {

	@Autowired
	private AuthenticationService authenticationService;

	@GetMapping("/")
	public Authentication findOne(@RequestParam("id") final Long authenticationId) {
		return authenticationService.findOne(authenticationId);
	}
}
