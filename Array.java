import java.util.*;
class Array
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of students and subjects");
	int x=sc.nextInt();
	int y=sc.nextInt();
	int a[][]=new int[x+2][y+2];
	int i,j;
	int sum=0;
	for(i=0;i<x;i++)
	{
		System.out.println("Enter the marks of students"+(i+1));
		for(j=0;i<y;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<x;i++)
	{
		for(j=0;j<y;j++)
		{
			sum=sum+a[i][j];
		}
		a[i][y]=sum;
		a[i][y+1]=sum/(y-1);
	}
	for(j=0;j<y;j++)
	{
		for(i=0;i<x;i++)
		{
			sum=sum+a[i][j];
		}
		a[x][j]=sum;
		a[x+1][j]=sum/(x-1);
	}
	for(int arr[]:a)
	{
		for(int b:arr)
		{
			System.out.println(x);
		}
		System.out.println("\n");
	}
	}
}
	

	