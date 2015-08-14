package ch08;
import java.lang.*;

public class Getclass_10
{
	public static void main(String[] args)
	{
		CMyClass1 X = new CMyClass1();
		Class Y;
		Y=X.getClass();
		System.out.println("X is "+Y+"'s objects");
		String str = new String("..");
		Y=str.getClass();
		System.out.println("Y is "+Y+"'s objects");
	}

}

class CMyClass1
{
	private int var;

}