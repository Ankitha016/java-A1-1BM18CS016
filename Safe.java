import java.util.*;
interface Safedrive
{
	float Safe_Speed=60;
	void speed_Of_the_vehicle();
}
class Drive implements Safedrive
{
	Scanner sc=new Scanner(System.in);
	
	
	
	public void speed_Of_the_vehicle()
	{	
		System.out.println("enter the speed");
		float s=sc.nextFloat();
		if(s<Safe_Speed)
			System.out.println("Safe Driving");
		else
			System.out.println("Drive slow");
	}
}
class Safe
{
	public static void main(String args[])
	{
		Safedrive ref;
		ref=new Drive();
		ref.speed_Of_the_vehicle();
	}
}
	
	

