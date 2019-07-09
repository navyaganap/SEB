package com.hdfc.loans.carloans;

public class Kotak implements Rbi 
{
    public static void main(String[] args) 
    {
		Kotak k= new Kotak();
		k.withdrawl();
		k.deposit();

	}
	@Override
	public void withdrawl() 
	{
		System.out.println("i am overridden withdrawl in Kotak");

	}

	@Override
	public void deposit() 
	{
		System.out.println("i am overridden deposit in Kotak");

	}

	

}
