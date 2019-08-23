import java.util.*;
class Time
{
	int h,m,s;
	Time()
	{
		h=0;m=0;s=0;
	}
	Time(int a,int b,int c)
	{
		h=a;m=b;s=c;
	}
	void currentTime(int a,int b,int c)
	{
		h=a;m=b;s=c;
	}
	void advance(int a,int b,int c)
	{
		s=s+c;
		m=m+b+(s/60);
		s=s%60;
		h=h+a+(m/60);
		m=m%60;
		h=h%24;
	}
	void print()
	{
		System.out.println("hour="+h);
		System.out.println("minutes="+m);
		System.out.println("second="+s);
	}
}
class TimeDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Time t=new Time();
		System.out.println("enter d current time  =");
		int aa=sc.nextInt();
		int bb=sc.nextInt();
		int cc=sc.nextInt();
		System.out.println("hour="+aa+"min="+bb+"sec="+cc);
		System.out.println("enter d  time to be advanced  =");
		int hh=sc.nextInt();
		int mm=sc.nextInt();
		int ss=sc.nextInt();
		t.currentTime(aa,bb,cc);
		t.advance(hh,mm,ss);
		t.print();
		
	}
}

