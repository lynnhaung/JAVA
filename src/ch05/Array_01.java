package ch05;
import java.lang.*;
import java.util.Scanner;

public  class Array_01{
	
	public static void main (String[] args)
	{
		int sum =0;
		double average;
		
		Scanner scanner = new Scanner(System.in);
		
		int[] trade = new int[5];
		
		for(int i=1; i<trade.length;i++)
		{
			System.out.println("第"+i+"季的營業額？");
			trade[i] = scanner.nextInt();
			sum=sum+trade[i];
		}
		average =  (double)sum/ (double)12;
		System.out.println("==========");
		System.out.println("年度營業額＝"+ sum);
		System.out.println("平均各月營業額："+ average);

	}
}