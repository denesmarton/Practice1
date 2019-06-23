public class Investment {
	private double balance;
	private double rate;
	private int year;
/** 
 * Constructs an investment object from a starting balance and interest rate
 * @param aBalance the starting balance
 * @param aRate the interest rate in percent
 */
	public Investment (double aBalance, double aRate) {
		balance = aBalance;
		rate = aRate;
		year = 0;
	} 
/**
Keeps accumulating interest until a target balance has been reached.
@param targetBalance the desired balance
*/
	public void waitForBalance (double targetBalance)
	{
		while (balance < targetBalance)
		{
			year++;
			double interest = balance * rate / 100;
			balance = balance + interest;
			System.out.println(balance);
		}
	}
	/**
	 * Accumulates interest after a certain number of years
	 * @param numberOfYears the number of years you've waited
	 */
	public void waitYears (int numberOfYears)
	{
		for (int i = 1; i <= numberOfYears; i++)
		{
			double interest = balance * rate / 100;
			balance = balance + interest;
		}
	}
		
	/**
	 * Gets the current investment balance
	 */
	public double getBalance ()
	{
		return balance;
	}
	/**
	 * Gets the number of years this investment has accumulated interest
	 * @return the number of years since the investment
	 */
	public int getYears ()
	{
		return year;
	}
	public static void main (String[] args)
	{
		double BALANCE = 10000;
		double RATE = 5;
		int years = 20;
		Investment invest = new Investment (BALANCE, RATE);
		invest.waitYears(years);
		double balance = invest.getBalance();
		System.out.printf("The balance after %d years is %.2f\n", years, balance);
	}
}