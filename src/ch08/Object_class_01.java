package ch08;
import java.lang.*;

public class Object_class_01
{
	public static void main(String [] args)
	{
		CMyClass X = new CMyClass(5);
		CMyClass Y = new CMyClass(5);
		CMyClass Z = X;
		System.out.print("Object X and Objext Y");
		if(X.equals(Y))
			System.out.println("The two objects are same.");
		else
			System.out.println("The two objects aren't same.");
		System.out.print("Object Y and Objext Z");
		if(X.equals(Z))
			System.out.println("The two objects are same.");
		else
			System.out.println("The two objects aren't same.");
	}

}

class CMyClass
{
	private int Var;
	public CMyClass(){}
	public CMyClass(int i)
	{
		Var = i;
	}
}