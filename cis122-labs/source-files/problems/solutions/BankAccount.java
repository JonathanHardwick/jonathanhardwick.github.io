// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
	String name;
	double balance;
	double transactionFee;                       // added

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {        // modified
		double newBalance = balance - amount - transactionFee;
		if (newBalance >= 0.00) {
			balance = newBalance;   // don't allow negative
		}
	}
}
