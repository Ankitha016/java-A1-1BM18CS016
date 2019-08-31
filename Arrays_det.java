import java.util.*;

class ArrayDemo
{
	int i,j;
	float d=0,temp;
	float a[][]=new float[2][2];
	boolean b;
	ArrayDemo()
	{
		i=0;j=0;
	}
	ArrayDemo(int i,int j)
	{
		this.i=i;
		this.j=j;
	}

void determinant()
{
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			 d=a[0][0]*a[1][1]-a[0][1]*a[1][0];
		}
	}
	System.out.println("determinant="+d);
}
void inverse()
{
		temp = a[0][0];
		a[0][0] = a[1][1];
		a[1][1] = temp;
		
		a[0][1] = - a[0][1];
		a[1][0] = - a[1][0];
		if(d==0)
		{
			System.out.print("inverse does not exist");

		}
		else
		{
		System.out.println("\nInverse of matrix is:");
		for(int i = 0; i < 2; ++i) {
			for(int j = 0; j < 2; ++j)
				System.out.print((a[i][j]/d) + " ");
			System.out.print("\n");
		}
		}
}
void set()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array ele=");
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<2;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}
}
void singularity()
{
	if(d==0)
	{
		b=true;
		System.out.println("Is singular "+b);
	}
	else
	{
		b=false;
		System.out.println("Is singular "+b);
	}
	
}
}
class Arrays_det
{
	public static void main(String args[])
{
	
	float a[][]=new float[2][2];
	ArrayDemo ob=new ArrayDemo();
	ob.set();
	ob.determinant();
	ob.inverse();
	ob.singularity();
}
}