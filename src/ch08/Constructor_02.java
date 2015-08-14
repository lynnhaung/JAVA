package ch08;
import java.lang.*;

public class Constructor_02
{
	
	public static void main (String [] args)
	{
		CB1 objB = new CB1();
		objB.show();
		
	}
}

class CA1
{
	protected int varX;
	public CA1()
	{
		System.out.println("父類別建構子執行中...");
		varX = 10;
	}
}

class CB1 extends CA1
{
	
	public CB1()
	{
		System.out.println("子類別建構子執行中...");
	}
	public void show()
	{
		System.out.println("VarX="+varX);
	}
}