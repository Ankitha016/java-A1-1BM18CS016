import java.util.*;
class Studarray
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i,j;
	int r,c;
	int sum=0,avg;
	System.out.println("enter number of students and subjects=");
	 r=sc.nextInt();
	 c=sc.nextInt();
	int a[][]=new int[r+2][c+2];
	for(i=0;i<r;i++)
	{
		System.out.println("enter marks of student"+(i+1));
		for(j=0;j<c;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			sum+=a[i][j];
		}
		a[i][c]=sum;
		avg=sum/(c);
		a[i][c+1]=avg;
		sum=0;
	}
	int s=0;
	for(j=0;j<c;j++)
	{
		for(i=0;i<r;i++)
		{
			s+=a[i][j];
		}
		a[r][j]=s;
		a[r+1][j]=s/(r);
		s=0;
	}
	System.out.println("resultant array=");
	for(i=0;i<r+2;i++)
	{
		for(j=0;j<c+2;j++)
		{
			System.out.println(a[i][j]);
		}
		System.out.println("\n");
	}
}
}