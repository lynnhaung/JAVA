package ch06;

import java.lang.*;


public class Random1_to_49_08 {

	public static void main(String[] args) {

		int lotto[] =new int[6];
		for(int i=1;i<=6;i++)
		{
			lotto[i-1]=(int)((Math.random()*49)+1);
			System.out.println("第"+i+"個隨機亂數為"+lotto[i-1]);

		}

}
	}