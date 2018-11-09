package br.com.trabalhofinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trabalhofinal.entities.CustomerInfo;

public interface CustomerInfoRepository extends JpaRepository<CustomerInfo, Long> {

}
