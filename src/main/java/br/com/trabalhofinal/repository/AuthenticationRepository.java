package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import br.com.trabalhofinal.entities.Authentication;

@Component
public interface AuthenticationRepository extends JpaRepository<Authentication, Long>{

}
