import java.util.*;
class Sorting
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements to be entered");
		int n=sc.nextInt();
		int a[]=new int[n+1];
		a[n]=0;
		int i,temp;
		System.out.println("Enter the elements=");					
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(i=0;i<n;i++)
		{
			if(a[i]>a[i+1])
			{
				count++;
				temp=a[n-1];
				a[n-1]=a[i];
				a[i]=temp;
			}
		}
		System.out.println("The sorted array is:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}		
		System.out.println("The number of counts"+count);
	}	
}
			