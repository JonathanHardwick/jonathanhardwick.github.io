// Each BankAccount object represents one user's bank account information
// including their ID and balance of money.

public class BankAccount {
	String id;
	double balance;
	double transactionFee;

	public BankAccount(String initID) {
		id = initID;
		balance = 0.00;
		transactionFee = 1.00;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		double newBalance = balance - amount - transactionFee;
		if (newBalance >= 0.00) {
			balance = newBalance;   // don't allow negative
		}
	}
}
