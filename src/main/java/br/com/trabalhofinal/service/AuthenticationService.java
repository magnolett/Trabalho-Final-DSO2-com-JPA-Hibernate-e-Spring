package br.com.trabalhofinal.service;

import br.com.trabalhofinal.entities.Authentication;

public interface AuthenticationService {

	public void save(Authentication authentication);
	public void delete(Authentication authentication);
	public Authentication findOne(Long authenticationId);
	
}
