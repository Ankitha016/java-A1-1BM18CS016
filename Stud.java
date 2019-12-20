
import java.util.*;
class Student
{
	String USN;
	String name;
	int i,n;
        int total=0;
	float sgpa;
	int k=0;
	int credit[];
	int marks[];
	void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name and usn");
		USN=sc.next();
		name=sc.next();
		System.out.println("Enter the number of subjects");
		 n=sc.nextInt();
		 credit=new int[n];
		System.out.println("enter the credits in all the subjects");
		for(i=0;i<n;i++)
		{
			credit[i]=sc.nextInt();
		}
		 marks=new int[n];
		System.out.println("enter the marks in all the subjects");
		for(i=0;i<n;i++)
		{
			marks[i]=sc.nextInt();
		}
	}
	void compute()
	{
	
	for(i=0;i<n;i++)
	{
	
		if(marks[i]<90&&marks[i]>=75)
		{
			k+=9*credit[i];
		}
		else if(marks[i]>=90)
		{
			k+=10*credit[i];
		}
		else if(marks[i]<75&&marks[i]>=60)
		{
			k+=8*credit[i];
		}
		else if(marks[i]<60&&marks[i]>=50)
		{
			k+=7*credit[i];
		}
		else if(marks[i]<50&&marks[i]>=40)
		{
			k+=6*credit[i];
		}
		else
		{
			k+=0;
		}
		
														
	}
	for(i=0;i<n;i++)
	{
		total+=credit[i];
		
	}
	sgpa=(float)k/total;
	
	}
	
	void display()
	{
		System.out.println("SGPA="+sgpa);
	}
}
class Stud
	{
	public static void main(String args[])
		{
		Student ob=new Student();
		ob.set();
		ob.compute();
		ob.display();
		}
	}
		
				
	
