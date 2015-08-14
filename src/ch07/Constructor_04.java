package ch07;

import java.lang.*;

public class Constructor_04
{

	public static void main(String[] args)
	{
		
		CMyClassa X = new CMyClassa(1);
		CMyClassa Y = new CMyClassa(2);
		
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

class CMyClassa
{
	public CMyClassa(int i)
	{
		Var =i;
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