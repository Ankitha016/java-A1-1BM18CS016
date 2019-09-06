import java.util.*;
class Command
{
	public static void main(String args[])
	{
		int i,a;
		int large=-99;
		for(i=0;i<args.length;i++)
		{
		a=Integer.parseInt(args[i]);
		System.out.println(args[i]);
		if(a>large)
		{
			large=a;
		}
		}
		System.out.println("largest number is="+large);
	}
}
23
45
67
largest number is=67
			
		
	
