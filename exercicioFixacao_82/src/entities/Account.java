package entities;

public class Account {

	private int accountNumber;
	private String accountName;
	private double accountBalance;

	public Account(int accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}

	public Account(int accountNumber, String accountName, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		deposit(initialDeposit);
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void deposit(double amount) {
		accountBalance += amount;
	}
	
	public void withdraw(double amount) {
		accountBalance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account " 
				+ accountNumber
				+ ", Holder: "
				+ accountName
				+ ", Balance: $ "
				+ String.format("%.2f", accountBalance);
	}
}