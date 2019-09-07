import java.util.*;
class prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer");
		int n=sc.nextInt();
		int i;
		for(i=0;i<n;i++)
		{
			if(isprime(i)==1)
			{
				if(isprime(n-i)==1)
				{
					System.out.println("yes");
				}
				else
				{
					System.out.println("no");
				}
					
			}
			else
			{
				System.out.println("no");
			}
		}
	}	
            static int isprime(int x)
	{
		int j,prime=1;
		for(j=2;j<=(x/2);j++)
		{
			if(x%j==0)
			{
				prime=0;
				return prime;
			}
			else
			{
				prime=1;
				return prime;
			}
		}	
	}
}
				