import java.util.*;
class Student
{
	String USN;
	String name;
	int i,j,n,total;
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
	for(j=0;j<n;j++)
	{
		marks[j]=sc.nextInt();
	}
	}
	void compute()
	{
	
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
		if(marks[j]<90&&marks[j]>=75)
		{
			k+=9*credit[i];
		}
		else if(marks[j]>=90)
		{
			k+=10*credit[i];
		}
		else if(marks[j]<75&&marks[j]>=60)
		{
			k+=8*credit[i];
		}
		else if(marks[j]<60&&marks[j]>=50)
		{
			k+=7*credit[i];
		}
		else if(marks[j]<50&&marks[j]>=40)
		{
			k+=6*credit[i];
		}
		else
		{
			k+=0;
		}
		
	}													
	}
	for(i=0;i<n;i++)
	{
		total+=credit[i];
		
	}
	sgpa=k/total;
	
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
		
				
	
	
	
