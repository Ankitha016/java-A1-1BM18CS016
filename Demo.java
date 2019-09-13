import java.util.*;
abstract class Base
{
	protected int l,b;
	protected double area;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 sides");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	void display()
	{
		System.out.println("Area="+area);
	}
	abstract double compute();
}
class Triangle extends Base
{
	double compute()
	{
		area=0.5*l*b;
		return area;
	}
}
class Rectangle extends Base
{
	double compute()
	{
		area=l*b;
		return area;
	}
}
class Demo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		Base ref;
		System.out.println("Enter 1 for Triangle and 2 for rectangke");
		choice=sc.nextInt();
		if(choice==1)
		{
			ref=new Triangle();
		}
		else 
			ref=new Rectangle();
		ref.getdata();
		ref.compute();
		ref.display();
	}
}
		
	

