import java.util.*;
abstract class Shape
{
	int l,b;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and bredth\n");
		l=sc.nextInt();
		b=sc.nextInt();
	}
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius\n");
		l=sc.nextInt();
	}	
	abstract void area();
}
class Rectangle extends Shape
{
	void area()
	{
		System.out.println("Area="+l*b);
	}
}
class Triangle extends Shape
{
	void area()
	{
		System.out.println("Area="+0.5*l*b);
	}
}
class Circle extends Shape
{
	void area()
	{
		System.out.println("Area="+(3.14*l*l));
	}
}
class Shapemain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Shape ref=null;
		System.out.println("Enter 1,2,3 to find the area of rectangle,triangle,circle resp");
		int ch=sc.nextInt();
		if(ch==1)
		{
			ref=new Rectangle();
			ref.getdata();
			ref.area();
		}
		if(ch==2)
		{
			ref=new Triangle();
			ref.getdata();
			ref.area();
		}
		else
		if(ch==3)
		{
			ref=new Circle();
			ref.get();
			ref.area();
		}
	}
}
			
			



