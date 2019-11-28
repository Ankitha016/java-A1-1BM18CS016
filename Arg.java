
import java.util.*;
class Anexception extends Exception
{
	String details;
	Anexception(String a){details=a;}
	public String toString()
	{
		return details;
	}
}
class Noarg extends Exception
{
	String details;
	Noarg(String a){details=a;}
	public String toString()
	{
		return details;
	}
}
class Arg
{
	public static void main(String args[])
	{
			
	String usn,name;
	int i;
	int a=args.length;
	Scanner sc=new Scanner(System.in);
		
		try
		{
			
		
			if(a==0)
			{
				throw new Noarg("no argument");
			}
			name=args[0];
			usn=args[1];
				System.out.println("name="+name);
		System.out.println("usn="+usn);
		}
		catch(Noarg e)
		{
			
			System.out.println("no argument exception caught");
		}
		
		for( i=2;i<a;i++)
		{
		
			try
			{
				if(Integer.parseInt(args[i])<0)
				{
					throw new Anexception("negative marks exception caught");
				}
				
			System.out.println("marks=" +args[i]);
		
			}
			catch(Anexception e1)
			{
				System.out.println(e1);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
			
			
			}
			
		
		}
	
		
		
	
		
		
	}
}