package com.hdfc.loans.carloans;

public class hdfc implements Rbi
{
	public static void main(String[] args) 
	{
		hdfc h= new hdfc();
		h.withdrawl();
		h.deposit();

	}

    @Override
	public void withdrawl() 
    {
		System.out.println("i am overridden withdrawl in hdfc");
	}

	@Override
	public void deposit() 
	{
		System.out.println("i am overridden deposit in hdfc");

	}

	
}
