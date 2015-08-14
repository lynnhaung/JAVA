package ch06;

import java.lang.*;


public class PassByVauleOf_Reference_10 {

	public static void main(String[] args) {

		int lotto[] =new int[6];
		generate_lotto(lotto);
		System.out.println("樂透號碼如下......");
		for(int i=1;i<=6;i++)
		{
			
			System.out.print(lotto[i-1]+"\t");

		}

	
}
	public static void generate_lotto(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1]=(int)((Math.random()*49)+1);
			System.out.println("第"+i+"個隨機亂數為"+arr[i-1]);
		}
	}
	}