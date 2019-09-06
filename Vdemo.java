import java.util.*;
class Vehicles
{
	private String model,colour; 
	private int year;
	public static int total;
	Vehicles(String model, String colour,int year)
	{
		this.model=model;
		this.colour=colour;
		this.year=year;
		total++;
	}
	void display()
	{
		System.out.println("model="+model);
		System.out.println("colour="+colour);
		System.out.println("year="+year);
	}
	static void display1()
	{
		System.out.println("total="+total);
	}
}
class Vdemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("enter the number of vehicles=");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			
			System.out.println("enter the model,colour,year=");
			String model=sc.next();
			String colour=sc.next();
			int year=sc.nextInt();
			Vehicles c=new Vehicles(model,colour,year);
			c.display();
			c.display1();
		}
	}
}
