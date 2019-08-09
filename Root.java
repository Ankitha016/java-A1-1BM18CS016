import java.util.*;
class Root
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b,c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=(b*b-4*a*c);
double r1,r2;
		if(d==0)
		{
			 r1=-b/2*a;
			r2=-b/2*a;
			System.out.println(r1);
			System.out.println(r2);
		}
		else if(d>=0)
		{
			r1=-b+Math.sqrt(d)/2*a;
			r2=-b-Math.sqrt(d)/2*a;
			System.out.println(r1);
			System.out.println(r2);
		}
		else
		{
			System.out.println("imaginary");
}
}
}
			

