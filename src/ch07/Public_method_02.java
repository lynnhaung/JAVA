package ch07;

public class Public_method_02{
	
	public static void main(String[] args)
	{
		CMyClass X = new CMyClass();
		CMyClass Y = new CMyClass();
		
		X.intVar();
		Y.intVar();
		
		X.addVar(10);
		System.out.print("物件X \t");
		
		X.showVar();
		
		System.out.print("物件Y \t");
		Y.addVar(5);
		Y.showVar();
		
		System.out.print("物件Y \t");
		Y.addVar(3);
		Y.showVar();
		
	}
}

class CMyClass
{
	public void intVar()
	{
		Var =1;
	}
	
	public void addVar(int b)
	{
		Var =Var+b;
	}
	
	public void showVar()
	{
		realShow();
	}
	
	private int Var;
	private void realShow()
	{
		System.out.println("Var="+Var);
	}
}