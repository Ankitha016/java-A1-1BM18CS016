import java.util.*;
class Person
{
	String name,address;
	int age ;
	void person()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name,address,age=");
	name=sc.next();
	address=sc.next();
	age=sc.nextInt();
	}
}
class Student extends Person
{
	int rollno,sem;
	void student()
	{
	person();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter roll no,sem=");
	rollno=sc.nextInt();
	sem=sc.nextInt();
	}
}
class Exam extends Student
{
	int m1,m2;
	double avg;
	void input()
	{
	student();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter m1,m2=");
	m1=sc.nextInt();
	m2=sc.nextInt();
	}
	void average()
	{
		avg=(m1+m2)/2;
	}
	
}
class Perinhw
{
	public static void main(String args[])
	{
		int i,j;
		double large=0.0;
		double avg=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of students=");
		int n=sc.nextInt();
		Exam s[]=new Exam[n]; 
		for(j=0;j<n;j++)
		{
			s[j]=new Exam();
			s[j].input();
			s[j].average();
		}
		int top=0; 
		for(i=0;i<n;i++)
		{
			if(s[i].avg>large)
			{
				large=s[i].avg;
 				top=i;
			}
		}
		System.out.println("large="+large+"Topper name:"+s[top].name);
		
	}
}