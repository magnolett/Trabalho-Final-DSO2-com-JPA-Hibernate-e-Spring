package br.com.trabalhofinal.dao;

import br.com.trabalhofinal.entities.Authentication;

public interface AuthenticationService {

	public void save(Authentication authentication);
	public void delete(Authentication authentication);
	
}
