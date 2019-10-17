import java.util.*;
abstract class Player
{
	Scanner sc=new Scanner(System.in);
	String name;
	int matches;
	float avg;
	void get()
	{
		System.out.println("enter the name and matches played by the player");
		name=sc.next();
		matches=sc.nextInt();
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("Mtches played:"+matches);
	}		
	abstract void average();
}
class Batsman extends Player
{
	int runs;
	Scanner sc=new Scanner(System.in);
	void get()
	{
		super.get();
		System.out.println("enter the total rus scored");
		runs=sc.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("Runs scored:"+runs);
	}
	void average()
	{
		avg=runs/matches;
		System.out.println("average:"+avg);
			
	}
}
class Bowler extends Player
{
	int rung;
	Scanner sc=new Scanner(System.in);
	void get()
	{
		super.get();
		System.out.println("enter the total rus scored");
		rung=sc.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("Runs scored:"+rung);
	}
	void average()
	{
		avg=rung/matches;
		System.out.println("average:"+avg);
			
	}
}
class Lab5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of batsmen");
		int m=sc.nextInt();
		System.out.println("enter number of bowlers");
		int n=sc.nextInt();
		Batsman b[]=new Batsman[m];
		Bowler a[]=new Bowler[n]; 
		System.out.println("enter 1 for batsman,2 for bowlers");
		int c=sc.nextInt();
		int i,j;
		while(c!=0)
		{
			switch(c)
			{
				case 1:for(i=0;i<n;i++)
					{
						b[i]=new Batsman();
						b[i].get();
						b[i].display();
						b[i].average();
					}
				
				case 2:for(j=0;j<m;j++)
					{
						a[j]=new Bowler();
						a[j].get();
						a[j].display();
						a[j].average();
					}		
				
			}
			System.out.println("enter 1 for batsman,2 for bowlers");
		c=sc.nextInt();
		}
	}
}
		
	
		
											
		
				
	

	