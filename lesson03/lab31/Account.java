package lesson03.lab31;

public class Account {
	
	private final static double DEFAULT_BALANCE = 0.0;

	public double getBalance() {
		return balance;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}
	
	Account(Employee employee, AccountType accountType, double balance) {

		this.employee = employee;
		this.accountType = accountType;
		this.balance = balance;
	}

	Account(Employee employee, AccountType accountType) {

		this(employee, accountType, DEFAULT_BALANCE);
	}

	public String toString() {

		return "type = " + accountType + ", balance = " + balance;
	}

	public void makeDeposit(double deposit) {

		balance += deposit;
	}

	public boolean makeWithdrawal(double amount) {
		
		if(amount > balance) 
			return false;
		
		balance -= amount;
		return true;
	}	
	
	// instance variables
	private AccountType accountType;
	private Employee employee;
	private double balance;
}