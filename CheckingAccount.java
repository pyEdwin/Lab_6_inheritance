package lab_6;

public class CheckingAccount extends BankAccount{

	private static final double  FEE = 0.15;
	
	/**
	 * 
	 * @param name
	 * @param amount
	 */
	public CheckingAccount(String name, double amount)
	
	{
		super(name , amount);
		setAccountNumber(getAccountNumber() + "-10");
	}
	/**
	 * 
	 * @param amount
	 * @return
	 */
	public boolean withdraw(double amount)
	
	{
		amount +=FEE;
		 return super.withdraw(amount);
	}
}
