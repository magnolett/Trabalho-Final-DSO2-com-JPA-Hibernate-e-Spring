package br.com.trabalhofinal.entities;

public class FinancialInvestments {

	private CheckingAccount checkingAccount;
	private Long amountToInvest;
	private Integer investmentPercentualRentability;
	private InvestmentType investmentType;
	
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
