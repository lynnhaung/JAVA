package ch04;

import java.lang.*;
import java.util.Scanner;

public class While_17 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x,y,temp,gcd;

		System.out.println("請輸入x值：");
		x = scanner.nextInt();
		System.out.println("請輸入y值：");
		y = scanner.nextInt();
		System.out.print("("+x+","+y+")=");
		if(x<y)
		{
			temp=x; x=y; y=temp;
		}
			while(x%y!=0)
			{
				x=x%y;
				if(x!=0)
				{
					temp=x; x=y; y=temp;
				}
			}
			gcd=y;
			System.out.println(gcd);
		}
	}


