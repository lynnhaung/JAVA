package ch05;

import java.lang.*;


public class Two＿Dimensional_Array_03 
{

	public static void main(String[] args) 
	{
		int m[][] = new int[9][9];
		
		for(int i=1;i<=9;i++)
			for(int j=1;j<=9;j++)
				m[i-1][j-1]=i*j;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
				System.out.print(i+"*"+j+"="+m[i-1][j-1]+"\t");
			System.out.println();
		}
	}
	
}