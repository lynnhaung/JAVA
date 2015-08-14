package ch06;
import java.lang.*;

public class Recursion_Fib_19{
	
	public static void main(String[] args)
	{
		System.out.print("費式數列如下:....");
		for(int i=0;i<=25;i++)
		{
			if(i%8==0)
				System.out.println();
			System.out.print(Fib(i)+"\t");
		}
		System.out.println("......");
	}
	
	public static int Fib(int n)
	{
		if((n==1)||(n==0))
			return n;
		else
			return Fib(n-1)+Fib(n-2);
	}
}