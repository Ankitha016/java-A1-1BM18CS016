class T1 implements Runnable
{
	Thread t;
	T1()
	{
		t=new Thread(this,"T1");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("BMSCE");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println("interrupted");
			}
		}
	}
}
class T2 implements Runnable
{
	Thread t;
	T2()
	{
		t=new Thread(this,"T2");
		t.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("CSE");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("interrupted");
			}
		}
	}
}
class Main
{
	public static void main(String args[])
	{
		new T1();
		new T2();
	}
}

		

