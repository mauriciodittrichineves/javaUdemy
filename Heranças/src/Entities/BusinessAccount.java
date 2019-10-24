package Entities;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
		deposit(amount);
	}
	}
	
	@Override
	public void withdraw(double amount) {
		/* A idéia neste passo é aproveitar a função que está no account, mas implementar uma 
		 * taxa extra de -2.0, para realizar o saque.*/
		super.withdraw(amount); // realizado o saque com a regra da super classe Account
		balance -= 2.0; // depois é acrescentado o desconto de 2.0
	}
	
	
	
	
	
	
	
}
