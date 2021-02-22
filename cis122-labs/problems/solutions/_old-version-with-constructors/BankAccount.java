// Each BankAccount object represents one user's bank account information
// including their ID and balance of money.

public class BankAccount {
	String id;
	double balance;

	public BankAccount(String initID) {
		id = initID;
		balance = 0.00;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}
}
