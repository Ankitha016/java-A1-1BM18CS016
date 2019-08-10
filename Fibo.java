import java.util.*;
class Fibo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		F(n);
	}
	static void F(int x)
	{
	    int f1=0;
	    int f2=1;
	    int f3=0,y;
	    if(x==1)
	    System.out.println(f1);
	    else if(x==2)
	    System.out.println(f2);
	    else
	    
	    {
	        {
	            for(y=2;y<x;y++)
	            f3=f1+f2;
	            f1=f2;
	            f2=f3;
	            
	        }
	        System.out.println(f3);
	        
	    }
	    
	    
	}
}
