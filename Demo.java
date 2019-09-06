import java.util.*;
class Account
{
	Scanner sc=new Scanner(System.in);
	String name;
	int num;
	float balance;
	void input()
	{
		System.out.println("Enter the name");
		name=sc.next();
		System.out .println("Enter the customer number");
		num=sc.nextInt();
		System.out .println("Enter the balance");
		balance=sc.nextFloat();
	}
	void display()
	{
		System.out.println("name="+name);
		System.out.println("Customer number="+num);
		System.out.println("Balance="+balance);
	}
}
class Savings extends Account
{
	Scanner sc=new Scanner(System.in);
	float interest,time;
	void input1()
	{
		input();
		System.out.println("Enter the interest and time=");
		float interest=sc.nextFloat();
		float time=sc.nextFloat();
	}
	void display1()
	{
		display();
		System.out.println("Rate="+interest);
		System.out.println("time="+time);
	}
	float compute()
	{
		return balance*time*interest;
	}
}
class Demo
{
	public static void main(String args[])
	{
		float i;
		Savings s=new Savings();
		s.input1();
		i=s.compute();
		System.out.println(i);
		s.display1();
	}
}
		
		











		
		
