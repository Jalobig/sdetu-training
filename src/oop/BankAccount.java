package oop;

public class BankAccount {

	String accountNumber;
	static final String routingNumber = "01234";
	String name;
	String ssn;
	String accountTy7pe;
	
	BankAccount( ){
		System.out.println("NEW ACCOUNT CREATED");
	}
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	void deposit() {
		
	}
	void withdrawal() {
		
	}
	void checkBalance() {
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	void getStatus() {
		
	}
}
