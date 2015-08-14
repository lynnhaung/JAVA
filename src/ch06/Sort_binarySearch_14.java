package ch06;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;


public class Sort_binarySearch_14 {

	public static void main(String[] args) {

		int workArr[] ={43,23,67,27,39,15,39,37,57,26,14};
		int findNum,location;
		Scanner a = new Scanner(System.in);
		
		Arrays.sort(workArr);
		System.out.print("請輸入要找的值");
		findNum = a.nextInt();
		location =Arrays.binarySearch(workArr,findNum);
		if(location<0)
			System.out.print("在陣列中找不到值");
		else
			System.out.print("數值"+findNum+"位於work["+location+"]");
		
	
}
	
	}
	