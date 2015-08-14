package ch06;
import java.lang.*;

public class For_Fib_20{
	
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
		int n1=0,n2=0,sum=1;
		
		if((n==1)||(n==1))
			return n;
		else
		{
			for(int i=2;i<=n;i++)
			{
				n1=sum;
				sum=sum+n2;
				n2=n1;
			}
			return sum;
		}
	}
}