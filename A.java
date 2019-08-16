import java.util.*;
class Rec
{
	int length;
	int bredth;
	int a;
	void set()
	{
	 Scanner sc=new Scanner(System.in);
		System.out.println("entrer length and bredth");
		 bredth=sc.nextInt();
		 length=sc.nextInt();
	}
	void display()
	{
	System.out.println("area is"+a);
	System.out.println("bredth="+bredth);
	System.out.println("LENGTH="+length);

	}	
	void area()
	{
		a=(length*bredth);
	}
}
class A
{
	public static void main(String args[])
{

	Rec br=new Rec();
	br.set();
	br.area();
	br.display();
	

}
}
