
  


import java.util.*;
class Bank
{
	String n;
	int a;
	int amt;
	float b;
	Bank(String name,int acc,float balance)
	{
		n=name;
		a=acc;
		b=balance;
	}
	void deposit(int amt)
	{
		b=b+amt;
		try
		{
		if(b<2000)
		{
			throw new Wrongagebalance("insufficient balance");
		}
		}
		catch( Wrongagebalance e)
		{
			System.out.println(e);
		}
	}
	void withdraw(int at)
	{
		b=b-amt;
		try
		{
		if(b<2000)
		{
			throw new Wrongagebalance("insufficient balance");
		}
		}
		catch( Wrongagebalance e)
		{
			System.out.println(e);
		}
	}
	
	
}
class  Wrongagebalance extends Exception
{
	String details;
	 Wrongagebalance(String s)
	{
		details=s;
	}
	public String toString()
	{
		return details;
	}
}
class Banklab
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int accno;
		float bal;
		String name;
		System.out.println("Enter the name,account and balance");
		name=sc.next();
		accno=sc.nextInt();
		bal=sc.nextFloat();
		try
		{
		Bank ob=new Bank(name,accno,bal);
		System.out.println("Enter 1 balance,2 to withdraw");

		int ch=sc.nextInt();
		System.out.println("Enter amt");

		int am=sc.nextInt();
		switch(ch)
		{
			case 1:ob.withdraw(am);
				break;
			
			case 2:ob.deposit(am);
				break;	
		}
		}
		catch( Exception e1)
		{
			
		}
	}
}					