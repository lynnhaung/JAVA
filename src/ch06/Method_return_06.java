package ch06;

import java.lang.*;
import java.util.Scanner;

public class Method_return_06 {

	public static void main(String[] args) {

		int k;
		
		k =fun1();
		
		System.out.println("k="+k);
	}

	public static int fun1() {
		int a=5, b=7;
		a++;
		
		if(a>0)return a+b;	
		a++;
		if(a>0)return a+b;
		a++;
		return a+b;
		
		

	}

}