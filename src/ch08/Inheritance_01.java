package ch08;
import java.lang.*;
import java.util.Scanner;

public class Inheritance_01
{
	public static void main(String[] args)
	{
		CA objA = new CA();
		CB objB = new CB();
		System.out.println("輸入CA的objA物件資料");
		
		objA.inputX();
		objA.inputY();
		objA.inputZ();
		System.out.println("類別CA的objA物件:");
		objA.show();
		
		System.out.println("----------------");
		System.out.println("輸入CB的objB物件資料");
		objB.inputX();
		objB.inputY();
		objB.inputZ();
		objB.varX++;
		objB.varY++;
		objB.addOne();
		System.out.println("類別CB的objB物件:");
		objB.show();
	}

}

class CA
{
	Scanner scan = new Scanner(System.in);
	
	public int varX;
	protected int varY;
	private int varZ;
	
	public void inputX()
	{
		System.out.print("varX:");
		varX = scan.nextInt();
	}
	
	public void inputY()
	{
		System.out.print("varY:");
		varY = scan.nextInt();
	}

	public void inputZ()
	{
		System.out.print("varZ:");
		varZ = scan.nextInt();
	}
	
	public void show()
	{
		System.out.println("varX="+varX+"varY="+varY+"varZ="+varZ);
	}
}

class CB extends CA
{
	public int varW;
	public void addOne()
	{
		varX++;
		varY++;
		//varZ++;
		
	}
}