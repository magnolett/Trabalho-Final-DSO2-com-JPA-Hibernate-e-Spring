package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trabalhofinal.entities.CheckingAccount;

public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Long> {

}
