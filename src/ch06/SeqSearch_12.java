package ch06;

import java.lang.*;
import java.util.Scanner;


public class SeqSearch_12 {

	public static void main(String[] args) {

		int workArr[] ={43,23,67,27,39,15,39,37,57,26,14};
		int findNum,location;
		Scanner a = new Scanner(System.in);
		System.out.print("請輸入要找的值");
		findNum = a.nextInt();
		location =seqSearch(findNum,workArr);
		if(location==-1)
			System.out.print("在陣列中找不到值");
		else
			System.out.print("數值"+findNum+"位於work["+location+"]");
		
	
}
	public static int seqSearch(int target,int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			if(target==arr[i])
				return i;
			return -1;
			
		}
	}
	