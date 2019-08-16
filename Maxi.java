import java.util.*;
class Maxi
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows and columns ");
	int r1=sc.nextInt();
	int c1=sc.nextInt();
	int a[][]=new int[r1][c1];
	System.out.println("Enter the elements");
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	int large=-1;
	for(int ar[]:a)
	{
		for(int x:ar)
		{
		if(large<x)
		{
			large=x;
		}
}
	}
	System.out.println("largest element is"+large);
	}
}
	
