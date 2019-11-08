package cie;
import java.util.*;
public class Student
{
	int s;
	String usn,name;
	public void get()
	{
	Scanner sc=new ScanNer(System.in);
	System.out.println("enter the name,usn the the semester");
	name=sc.next();
	usn=sc.next();
	s=sc.next();
	}
	public void show()
	{	
		System.out.println("name"+name);
		System.out.println("usn"+usn);
	}
}
public class Internals extends Student
{
	Scanner sc=new ScanNer(System.in);
	int m[]=new int[5];
	public void get()
	{
		super.get();
	System.out.println("enter the marks in 5 subjects");
	for(i=0;i<n;i++)
	{
		m[i]=sc.nextInt();
	}
	}
	public void show()
	{
		super.show();
	}
}	
