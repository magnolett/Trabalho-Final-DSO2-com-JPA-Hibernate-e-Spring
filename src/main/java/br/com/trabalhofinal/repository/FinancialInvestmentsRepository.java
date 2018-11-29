package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import br.com.trabalhofinal.entities.FinancialInvestments;

@Component
public interface FinancialInvestmentsRepository extends JpaRepository<FinancialInvestments, Long> {

}
