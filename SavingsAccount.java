package lab_6;

public class SavingsAccount extends BankAccount
{
	//an instance variable called rate that represents the annual interest 
	//rate. Set it equal to 2.5%.
	double rate = 0.025;
	
	// an instance variable called savingsNumber, initialized to 0.
	int savingsNumber = 0;
	
	//An instance variable called accountNumber that will hide the accountNumber from 
	//the superclass
	String accountNumber;
	
	/*
	Write a constructor that takes a name and an initial balance as parameters and calls 
	the constructor for the superclass. It should initialize accountNumber to be the 
	current value in the superclass accountNumber (the hidden instance variable) 
	concatenated with a hyphen and then the savingsNumber.*/
	public SavingsAccount(String name, double initialBalance)
	{
		//calls the constructor for the superclass
		super(name, initialBalance);
		
		//initialize accountNumber to be the current value in the superclass accountNumber
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;		
	}
	
	/*
		Write a method called postInterest that has no parameters and returns no value. This 
		method will calculate one month's worth of interest on the balance and deposit it into 
		the account*/
	public void postInterest()
	{
		//calculate one month's worth of interest on the balance
		super.setBalance( super.getBalance() * (1 + (rate/12) ) );
			
			
	}
	
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	/*
	Write a copy constructor that creates another savings account for the same person. It 
	should take the original savings account and an initial balance as parameters. It 
	should call the copy constructor of the superclass, assign the savingsNumber to be 
	one more than the savingsNumber of the original savings account. It should assign 
	the accountNumber to be the accountNumber of the superclass concatenated with the 
	hypen and the savingsNumber of the new account*/
	public SavingsAccount(SavingsAccount s, double initialBalance)
	{
		//call the copy constructor of the superclass
		super(s, initialBalance);
		
		//assign the savingsNumber to be 
		//one more than the savingsNumber of the original savings account
		savingsNumber++;
		
		//accountNumber = s.getAccountNumber();
		//assign the accountNumber to be the accountNumber of the superclass concatenated with 
		//the hyphen and the savingsNumber of the new account
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;			
	}
}

