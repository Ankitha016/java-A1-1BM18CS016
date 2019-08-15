/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Emter the elements of the array");
		int sum=0;
		for(int i=0;i<size;i++)
		{
		    arr[i]=sc.nextInt();
		}
		for(int x:arr)
		sum+=x;
		System.out.println("sum is"+sum);
	}
}
