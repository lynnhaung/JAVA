package ch07;
import java.lang.*;

public class Object_array_14
{
	public static void main(String [] args)
	{
		CMyClasse X[] = new CMyClasse[3];
		System.out.println("-----------");
		for(int i=0;i<X.length;i++)
			X[i]=new CMyClasse();
	
		CMyClasse Y[] = new CMyClasse[3];
		System.out.println("-----------");
		for(int i=0;i<X.length;i++)
			Y[i]=new CMyClasse(i+10);
	}
	
}


class CMyClasse
{
	public int varA;
	private int varB;
	public CMyClasse()
	{
		System.out.println("無引述建構函式執行中");
	}
	public CMyClasse(int i)
	{
		System.out.println("有引述建構函式執行中,引數為"+i);
	}
}
