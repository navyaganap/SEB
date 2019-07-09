package com.hdfc.loans.carloans;

public interface Rbi 
{
    public void withdrawl();
    public void deposit();
    public static void main (String[] args)
    {
       
      Rbi i1= new icici();
       i1.deposit();
       i1.withdrawl();
      
      Rbi i2= new Kotak();
       i2.deposit();
       i2.withdrawl();
       
      Rbi i3= new hdfc();
       i3.deposit();
       i3.withdrawl();
    }
}
