package br.com.trabalhofinal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trabalhofinal.entities.Authentication;
import br.com.trabalhofinal.repository.AuthenticationRepository;
import br.com.trabalhofinal.service.AuthenticationService;

public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	AuthenticationRepository authenticationRepository;
	
	public void save(Authentication authentication) {
		authenticationRepository.saveAndFlush(authentication);
	}
	
	public void delete(Authentication authentication) {
		authenticationRepository.delete(authentication);
	}
	
	public Authentication findOne(Long authId) {
		return authenticationRepository.findOne(authId);
	}
	
}
