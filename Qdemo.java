import java.util.*;
class Queue
{
	
	int q[]=new int[10];
	int item;
	int f,r,s,i,n;
	Queue()
	{
		f=0;r=-1;
	}
	void insert(int item)
	{
			if(r==9)
		{
			System.out.println("queue is full \n");
			return;
		}
			r=r+1;
			q[r]=item;
	}
	void display()
	{
		int i;
		if(f>r)
		{
			System.out.println("queue is empty\n");
			return;
		}
		System.out.println("contents of queue are :\n");
		for(i=f;i<=r;i++)
		System.out.println(q[i]);
	
	}
	int delet()
	{
	int item;
	if(f==-1)
	{
		System.out.println("queue is empty\n");
		return -9999;
	}
	if(f>r)
	{
		
		System.out.println("queue underflow\n");
		return -9999;
	}
	else
		item=q[f];
		f=(f+1);
		return item;
	}
}
class Qdemo
{
	public static void main(String args[])
	{
	int e;
	Queue ob=new Queue();
	ob.insert(1);
	ob.insert(2);
	ob.display();
	e=ob.delet();
	System.out.println("deleted ele ="+e);
	e=ob.delet();
	System.out.println("deleted ele ="+e);
	ob.display();
	}
}
contents of queue are :

1
2
deleted ele =1
deleted ele =2
queue is empty


