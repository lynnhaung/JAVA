package ch07;
import java.lang.*;

public class Object_07
{
	
	public static void main(String[] args)
	{
		CVector2 i = new CVector2();
		i.set(20,40);
		CVector2 j = new CVector2();
		j.set(15,45);
		CVector2 k;
		CMyClassb X = new CMyClassb();
		k=X.sum(i, j);
		
		System.out.println("Vector i=("+i.x+","+i.y+")");
		System.out.println("Vector j=("+j.x+","+j.y+")");
		System.out.println("Vector k=i+j=("+k.x+","+k.y+")");
		
	}
}

class CMyClassb
{
	public int sum(int a,int b)
	{
		return a+b;
	}
	
	public double sum(double a,double b)
	{
		return a+b;
	}
	
	public CVector2 sum(CVector2 a,CVector2 b)
	{
		CVector2 tempVector = new CVector2();
		tempVector.x=a.x+b.x;
		tempVector.y=a.y+b.y;
		return tempVector;
	}
}

class CVector2
{
	public int x,y;
	public void set(int m, int n)
	{
		x=m;
		y=n;
	}
	
}