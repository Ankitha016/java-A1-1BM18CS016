import java.util.*;
class Ascend
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i,j;
	System.out.println("Enter the size of the array");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the elements");
	for(i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	int temp;
	for(i=0;i<size;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(a[j]<a[i])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Sorted array is");
	for(i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
}
}

