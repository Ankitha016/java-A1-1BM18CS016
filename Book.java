import java.util.*;
class Bookdemo
{
	String title,author;
	int pages;
	float price;
	Bookdemo()
	{
		title="\0";
		author="\0";
		pages=0;
		price=0;
	}
	void set()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the title,author,pages,price");
		title=sc.next();
		author=sc.next();
		pages=sc.nextInt();
		price=sc.nextInt();
	}
	public String toString()
	{
		return "title="+title+",author="+author+",pages="+pages+",price="+price;
	}
	void get()
	{
		System.out.println(toString());
	}
}
class Book
{
	public static void main(String args[])
{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of books");
	n=sc.nextInt();
	Bookdemo arr[]=new Bookdemo[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=new Bookdemo();
		arr[i].set();
		arr[i].get();
		
	}
}
}
output:
Enter the number of books
2  
Enter the title,author,pages,price
xxx
yyy
180
90
title=xxx,author=yyy,pages=180,price=90.0
Enter the title,author,pages,price
ttt
sss
280
100
title=ttt,author=sss,pages=280,price=100.0

	
