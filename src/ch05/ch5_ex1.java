package ch05;

import java.lang.*;
import java.util.Scanner;

public class ch5_ex1 {

	public static void main(String[] args) {

		String str[][] = { { "大雄", "宜靜", "技安" },
				{ "032125678", "0226713456", "075534321" } };
		// String str2[]={ "032125678","0226713456","075534321"};
		String keyin;
		// int c =0;
		boolean a = true;
		Scanner scan = new Scanner(System.in);

		System.out.print("請輸入要查詢的對象：");
		keyin = scan.nextLine();
		while (a) {
			for (int i = 0; i < 3; i++) {

				if (keyin.equals(str[0][i]))
				{
					System.out.println("電話是：" + str[1][i]);
				a = false;
				}
			}
			/*if(i==2)
			 * {
				System.out.println("查無此人");
				break;

			}
			 * 
			 */
			if (a != false) {
				System.out.println("查無此人");
				break;

			}

		}

	}
}
