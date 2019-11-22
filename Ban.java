//Implement user defined exception in a java program for Bank application which has a
class with instance variables acno, name, balance and methods like deposit(amt) and
withdraw(amt). If the balance falls below 2000/- then it should throw user defined
exception “insufficient balance”.

import java.util.*;
class Bank
{
	String n;
	int a;
	float b;
	Bank(String name,int acc,float balance)
	{
		n=name;
		a=acc;
		b=balance;
	}
	void deposit(int amt)
	{
		balance=balance+amt;
		if(balance<2000)
		{
			throw new Wrongagebalance("invalid");
		}
	}
	void withdraw(int at)
	{
		balance=balance+amt;
		try
		{
		if(balance<2000)
		{
			throw new Wrongagebalance("invalid");
		}
		}
		catch( WrongageException e)
		{
			System.out.println(e);
		}
	}
	
	
}
class  Wrongagebalance extends Exception
{
	String details;
	 WrongageException(String s)
	{
		details=s;
	}
	public String toString()
	{
		return details;
	}
}	
