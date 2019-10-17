import java.util.*;
class Employee
{
	Scanner sc=new Scanner(System.in);
	String name;
	int num;
	void get()
	{
		System.out.println("enter the name and number");
		name=sc.next();
		num=sc.nextInt();
	}
	void put()
	{
		System.out.println("Name"+name);
		System.out.println("Number"+num);
	}
}
class Regular extends Employee
{
	Scanner sc=new Scanner(System.in);
	int rpay;
	void get()
	{
		super.get();
		
		System.out.println("enter the regular pay");
		rpay=sc.nextInt();
	}
	void put()
	{
		super.put();
		System.out.println("regular pay:"+rpay);
	}
}
class Overtime extends Regular
{
	Scanner sc=new Scanner(System.in);
	int apay;
	int tpay;
	void get()
	{
		super.get();
		
		System.out.println("enter the additional pay");
		apay=sc.nextInt();
	}
	void put()
	{
		super.put();
		System.out.println("additional pay:"+apay);
	}
	void over()
	{
		tpay=rpay+apay;
		System.out.println("total pay:"+tpay);	
	}
	int compute()
	{
		if(apay>rpay)
		{
			return 1;
		}
		else
			return 0;
	}		
}
class Lab6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,co;
		System.out.println("enter the number of employees");
		int n=sc.nextInt();
		Overtime	ov[]=new Overtime[n];
		for(i=0;i<n;i++)
		{
			ov[i]=new Overtime();
			ov[i].get();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Employee with additional pay greater");
			//co=ov[i].compute();
			//{
			//	if(co==1)
			//	{
			//		ov[i].put();
			//	}
			//}
				if(ov[i].apay>ov[i].rpay)
				{
					ov[i].put;
				}
									
		}
	}
}
		
		