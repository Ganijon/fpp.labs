package lesson03.lab31;

public enum AccountType {

	CHECKING("checking"),
	SAVINGS ("savings"),
	RETIREMENT ("retirement");
	
	private AccountType(String description){
		this.description = description;
	}
	
	@SuppressWarnings("unused")
	private String description;
}