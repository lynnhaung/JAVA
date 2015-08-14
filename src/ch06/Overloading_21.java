package ch06;
import java.lang.*;

public class Overloading_21{
	
	public static void main(String[] args)
	{
		printHello();
		System.out.println("----------");
		printHello(2);
		System.out.println("----------");
		printHello("three");
		//printHello(2.1);
		
	}
	
	public static void printHello()
	{
		System.out.println("Hello Jave");
	}
	
	public static void printHello(int n)
	{
		if(n>3)
		{
			System.out.println("Sorry ,more than 3");
		}
		else if(n<0)
		{
			System.out.println("Sorry ,bad command!");
		}
		else 
			for(int i=0;i<n;i++)
				printHello();
	}
	public static void printHello(String str1)
	{
		if(str1=="one")printHello(1);
		else if (str1=="two")printHello(2);
		else if (str1=="three")printHello(3);
		else
			System.out.println("Sorry ,more than 3 or bad command!");
	}
}