package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trabalhofinal.entities.FinancialInvestments;

public interface FinancialInvestmentsRepository extends JpaRepository<FinancialInvestments, Long> {

}
