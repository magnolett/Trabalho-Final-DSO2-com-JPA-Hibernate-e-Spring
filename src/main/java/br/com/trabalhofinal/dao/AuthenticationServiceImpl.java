package br.com.trabalhofinal.dao;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.trabalhofinal.entities.Authentication;
import br.com.trabalhofinal.repository.AuthenticationRepository;

public class AuthenticationServiceImpl {

	@Autowired
	AuthenticationRepository authenticationRepository;
	
	public void save(Authentication authentication) {
		authenticationRepository.saveAndFlush(authentication);
	}
	
	public void delete(Authentication authentication) {
		authenticationRepository.delete(authentication);
	}
	
	public Authentication getAuthById(Long authId) {
		return authenticationRepository.findOne(authId);
	}
	
}
