package ch04;
import java.lang.*;
import java.util.Scanner;

public class ch4_ex8 {
	
	public static void main(String[] args)
	{
		int n, m = 1, i=1;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter a number ");
		n = sc.nextInt();
		if(n<0)
		{
			System.out.println("please enter a number above or equal to 0");
		}
		else
		{
			do {
				m*=i;
				
				if(Integer.MAX_VALUE / m > 1)
				{
					
				}
				else
				{
					 System.out.println("Integer overflow") ; 
				     break ; 
				}
				i++;
			} while (i<=n);
			//System.out.println(Integer.MAX_VALUE / m);
			
			if(Integer.MAX_VALUE / m > 1)
			System.out.println(n + "! = " + m);

			}
		}
	

}