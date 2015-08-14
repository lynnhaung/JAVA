package ch09;
import java.lang.*;

public class Instanceof_11
{
	public static void main (String[] args)
	{
		CA2 objA = new CA2(); //objA為CA2類別的物件
		CB1 objB = new CB1(); //objB為CB1類別的物件
		CC objC = new CC(); //objC為CC類別的物件
		
		if(objA instanceof CA2)
			System.out.println("objA擁有一份CA類別的實體");
		if(objB instanceof CA2)
			System.out.println("objB擁有一份CA類別的實體");
		if(objC instanceof CA2)
			System.out.println("objC擁有一份CA類別的實體");
		if(objA instanceof CC)   //為flase
			System.out.println("objA擁有一份CA類別的實體");
		if(objB instanceof IA2)
			System.out.println("objB擁有一份IA1介面的實作實體");
		
	}
}

interface IA2
{
	public static final int var1=5;
}

class CA2 implements IA2
{
	public int var2;
}

class CB1 extends CA2
{
	public int var3;
}

class CC extends CB1
{
	public int var4;
}