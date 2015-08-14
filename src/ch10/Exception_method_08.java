package ch10;
import java.lang.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_method_08
{
	public static void main(String[] args)
	{
		CmyClass obj = new CmyClass();
		
		try
		{
			obj.setValue();
			obj.printValue();
		}
		catch(InputMismatchException e)
		{
			System.out.print("例外產生：請輸入數字");
		}
		catch(ArithmeticException e)
		{
			System.out.print("例外產生：分母為0");
		}
		catch(Exception e)
		{
			System.out.print("有非未考慮到的例外發生了");
		}
		finally
		{
			
		}
	}
}

class CmyClass
{
	private int numerator,denominator;
	public Scanner scan = new Scanner(System.in);
	
	public void setValue() throws InputMismatchException
	{
		System.out.print("輸入分子");
		numerator= scan.nextInt();
		System.out.print("輸入分母");
		denominator=scan.nextInt();
		System.out.println("資料輸入完畢");
	}
	
	public void printValue() throws ArithmeticException
	{
		
		System.out.println("除法結果為"+numerator/denominator);
		System.out.print("除法執行完畢");
	}
	
}