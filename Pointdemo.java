import java.util.*;
class Point{
	int x,y;
	Point()
	{
		x=y=0;
	}
	Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	Point(Point p)
	{
		x=p.x;
		y=p.y;
	}
	double compute(Point p)
	{
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
}
class Pointdemo
{
	public static void main(String args[])
	{
		Point p1=new Point(1,2);
		Point p2=new Point(p1);
		Point p3=new Point(3,4);
		double dis=p1.compute(p3);
		System.out.println(dis);
	}
}
