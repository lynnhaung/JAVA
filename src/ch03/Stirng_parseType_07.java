package ch03;
import java.lang.*;
import java.util.Scanner;

public class Stirng_parseType_07{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String str1;
		double x;
		
		System.out.println("x？");
		str1 = scanner.nextLine();
		x = Double.parseDouble(str1);
		
		System.out.println("x的3次方為："+(x*x*x));
	}
}