package com.hdfc.loans.carloans;

public class icici implements Rbi
{

	
	public static void main(String[] args) 
	{
		icici i= new icici();
			  i.withdrawl();
		      i.deposit();

	}
	@Override
	public void withdrawl()
	{
		System.out.println("i am overridden withdrawl in icici");

	}

	@Override
	public void deposit() 
	{
		System.out.println("i am overridden deposit in icici");

	}

	

}
