package lesson03.lab32;

import java.time.LocalDate;

public class Employee {

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		
		this.name = name;
		hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}
	
	public String getName() {
	    return name;
	}
	
	public LocalDate getHireDate(){
	    return hireDate;
	}

	public void createNewChecking(double startAmount) {    
	    if(checkingAccount == null)
            checkingAccount = new Account(this, AccountType.CHECKING, startAmount);
    }

    public void createNewSavings(double startAmount) {
 	    if(savingsAccount == null)
            savingsAccount = new Account(this, AccountType.SAVINGS, startAmount);
    }
    
    public void createNewRetirement(double startAmount) {
	    if(retirementAccount == null)
            retirementAccount = new Account(this, AccountType.RETIREMENT, startAmount);
    }
    
    public void deposit(AccountType acctType, double amt) {
        switch(acctType) {
            case CHECKING: 
                checkingAccount.makeDeposit(amt); break;
            case SAVINGS:
                savingsAccount.makeDeposit(amt); break;
            case RETIREMENT: 
                retirementAccount.makeDeposit(amt); break;
        }
    }
    
    public boolean withdraw(AccountType acctType, double amt) {
        switch(acctType) {
            case CHECKING: 
                if(amt > checkingAccount.getBalance())
                    return false;
                checkingAccount.makeWithdrawal(amt); 
                break;
            case SAVINGS:
                if(amt > savingsAccount.getBalance())
                    return false;
                savingsAccount.makeWithdrawal(amt); 
                break;
            case RETIREMENT: 
                if(amt > retirementAccount.getBalance())
                    return false;
                retirementAccount.makeWithdrawal(amt); 
                break;
        }
        return true;
    }
    
    public String getFormattedAcctInfo() {
    
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n\nACCOUNT INFO FOR " + name + ":\n\n");
        
        if(savingsAccount != null)
            sb.append(savingsAccount.toString());

        if(checkingAccount != null)
            sb.append(checkingAccount.toString());
            
        if(retirementAccount != null)
            sb.append(retirementAccount.toString());
        
        return sb.toString();
    }
    
    	
	// instance fields
	private Account checkingAccount;
	private Account savingsAccount;
	private Account retirementAccount;
	
	private String name;
	private LocalDate hireDate;
}