package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("195782648");
		BankAccount acc2 = new BankAccount("540654064");
		BankAccount acc3 = new BankAccount("488782648");
		BankAccount acc4 = new BankAccount("894649646");

	}

}


class BankAccount {
	private static int iD = 1000;	// Internal ID
	private String accountNumber;	// iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "15964";
	private String name;
	private String ssn;
	private double balance;
	
	// Constructor
	BankAccount(String SSN) {
		this.ssn = SSN;
		iD++;
		setAccountNumber();
	}
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD +""+ random + ssn.substring(0, 2);
		System.out.println(accountNumber);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}