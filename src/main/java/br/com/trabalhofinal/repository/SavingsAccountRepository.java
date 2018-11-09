package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trabalhofinal.entities.SavingsAccount;

public interface SavingsAccountRepository extends JpaRepository<SavingsAccount, Long> {

}
