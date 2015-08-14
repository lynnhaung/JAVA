package ch04;

import java.lang.*;
import java.util.Scanner;

public class If_else_06 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int Credit, Status;
		double year;

		System.out.println("請輸入信用額度：");

		Credit = in.nextInt();
		System.out.println("繳款是否正常(1:正常 0:不正常)");

		Status = in.nextInt();

		if (Status == 1) {
			System.out.println("請輸入持卡年份：");
			year = in.nextDouble();
			if(year>=0.5)
			{
				if(year<1)
				{
				System.out.println("預借現金餘額為"+(Credit*0.5)+"元");
				}
				else 
				{
					System.out.println("預借現金餘額為"+Credit+"元");
				}
			}
			else
			{
				System.out.println("預借現金餘額為0元");
			}
			
		}else
		{
			System.out.println("預借現金餘額為0元");	
		}
		}

	}
