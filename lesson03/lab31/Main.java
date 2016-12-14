package lesson03.lab31;

public class Main {

	public static void main(String[] args) {

		Employee employee = new Employee("Robert", "Bob", 10000, 2015, 10, 21);

		Account[] employeeAccounts = {
				new Account(employee, AccountType.CHECKING, 300.00),
				new Account(employee, AccountType.SAVINGS, 300.00),
				new Account(employee, AccountType.RETIREMENT, 300.00) };
		
		System.out.println("Employee Details:");
		System.out.println(employee);
		
		System.out.println("Employee Accounts:");
		for(Account account: employeeAccounts)
			System.out.println(account);
	}
}