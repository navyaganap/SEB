package com.hdfc.loans.carloans;

public class FirstClass 
{
	
	int a=10,b=20, c; //Properties
	
	public void add()
	{
		c=a+b;
		System.out.println("Additon of A&B is:" + c);
	}
    public void sub()
    {
	    c=a-b;
	    System.out.println("Substraction of A&B is:" + c);
    }
	
    public static void main(String[] args) 
    {
		System.out.println("Hi");
		
		FirstClass obj=new FirstClass();
		obj.add();
		obj.sub();
		
		FirstClass obj1=new FirstClass();
		obj1.add();
		obj1.sub();
    }

}
