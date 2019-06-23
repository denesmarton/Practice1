
public class BankAccount {
	private double balance;

	BankAccount ()
	{
		balance = 0;
	
	}
	BankAccount (double initialBalance)
	{
		balance = initialBalance;
	}
	public void deposit (double amount)
	{
		balance = balance + amount;
	}
	public void withdraw (double amount)
	{
		balance = balance - amount;
	}
	public double getBalance()
	{
		return balance;
	}

public static void main(String[] args) {
BankAccount denesChecking = new BankAccount();
denesChecking.withdraw(100.5);

System.out.println(denesChecking.getBalance());
}}
	


