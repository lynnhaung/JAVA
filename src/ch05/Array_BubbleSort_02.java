package ch05;

import java.lang.*;


public class Array_BubbleSort_02 
{

	public static void main(String[] args) 
	{
		int x[] = { 25, 10, 39, 40, 12 };
		int spec = 11;
		int k, times, temp;

		k = x.length-1;

		while (k != 0)
{
			times = 0;
			for (int i = 0; i <= k-1; i++) 
			{
				if (x[i] > x[i + 1]) 
				{
					temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
					times = i;
				
			}
			}
			k = times;
}
		
		for (int i = 0; i < x.length; i++)	
			System.out.print(x[i] + "\t");
		
		System.out.print("\n特別號\t" + spec);
	}
}