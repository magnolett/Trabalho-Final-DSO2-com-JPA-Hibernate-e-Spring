package br.com.trabalhofinal.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FINANCIAL_INVESTMENTS")
public class FinancialInvestments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private CheckingAccount checkingAccount;
	private Long amountToInvest;
	private Integer investmentPercentualRentability;
	private InvestmentType investmentType;
	
	public FinancialInvestments(CheckingAccount checkingAccount, Long amountToInvest,
			Integer investmentPercentualRentability, InvestmentType investmentType) {
		
		this.checkingAccount = checkingAccount;
		this.amountToInvest = amountToInvest;
		this.investmentPercentualRentability = investmentPercentualRentability;
		this.investmentType = investmentType;
	}
	
	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}
	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	public Long getAmountToInvest() {
		return amountToInvest;
	}
	public void setAmountToInvest(Long amountToInvest) {
		this.amountToInvest = amountToInvest;
	}
	public Integer getInvestmentPercentualRentability() {
		return investmentPercentualRentability;
	}
	public void setInvestmentPercentualRentability(Integer investmentPercentualRentability) {
		this.investmentPercentualRentability = investmentPercentualRentability;
	}
	public InvestmentType getInvestmentType() {
		return investmentType;
	}
	public void setInvestmentType(InvestmentType investmentType) {
		this.investmentType = investmentType;
	}
	
	
}
