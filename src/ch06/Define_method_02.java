package ch06;
import java.lang.*;
import java.util.Scanner;

public class Define_method_02{
	
	public static void main(String[] args)
	{
		int k;
		double Ans;
		
		System.out.print("3.5的k次方？輸入k值");
		Scanner c =new Scanner(System.in);
		k =c.nextInt();
		Ans= power(3.5,k);
		System.out.print("3.5的"+k+"次方="+Ans);
	}
	
	public static double power(double x , int n)
	{
		int i;
		double powerXn = 1;
		
		for(i=1;i<=n;i++)
			powerXn=powerXn*x;
		return powerXn;
	}
}