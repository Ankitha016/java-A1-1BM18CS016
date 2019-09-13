import java.util.*;
class Patients
{
	String id,name,doc;
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id, name and doctor");
		id=sc.next();
		name=sc.next();
		doc=sc.next();
	}
	void display()
	{
		System.out.println("name="+name);
		System.out.println("id="+id);
		System.out.println("doctor="+doc);
		
	}
}
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of patients");
		int n=sc.nextInt();
		Patients ob[]=new Patients[n];
		int i,j;
		for(i=0;i<n;i++)
		{
			ob[i]=new Patients();
			ob[i].input();
			ob[i].display();
		}
		System.out.println("Enter the doctors name ");
		String doctor=sc.next();
		for(j=0;j<n;j++)
		{
			System.out.println("The patients are");
			if(doctor.equals(ob[j].doc))
			{
				System.out.println(ob[j].name);	
			}

		}
	}
}
		
			
		

		
		
	
