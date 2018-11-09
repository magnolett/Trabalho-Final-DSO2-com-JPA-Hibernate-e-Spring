package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trabalhofinal.entities.Authentication;

public interface AuthenticationRepository extends JpaRepository<Authentication, Long>{

}
