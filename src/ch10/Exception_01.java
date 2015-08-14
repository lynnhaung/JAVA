package ch10;
import java.lang.*;
import java.util.Scanner;

public class Exception_01
{
	public static void main(String[] args)
	{
		fraction obj = new fraction();
		obj.set_value();
		obj.print_value();
	}
}

class fraction
{
	public fraction(){ scan = new Scanner(System.in);}
	private Scanner scan;
	private int numerator;
	private int denominator;
	public void set_value()
	{
		System.out.print("輸入分子");
		numerator= scan.nextInt();
		System.out.print("輸入分母");
		denominator=scan.nextInt();
	}
	public void print_value()
	{
		System.out.print(numerator+"/"+denominator+"=");
		System.out.println(numerator/denominator);
	}
}