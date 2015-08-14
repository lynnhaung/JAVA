package ch08;
import java.lang.*;

public class Override_04
{
	public static void main(String[] args)
	{
	CB3 objB = new CB3();
	objB.show();
	objB.show(10);
	objB.show(10.0);
	}
}

class CA3
{
	public void show()
	{
		System.out.println("目前執行父類別的show()");
	}
}

class CB3 extends CA3
{
	public void show()
	{
		System.out.println("目前執行子類別的show()");
	}
	
	public void show(int x)
	{
		System.out.println("目前執行子類別的show("+x+")");
	}
	
	public void show(double x)
	{
		System.out.println("目前執行子類別的show(double)");
		super.show();
	}
}