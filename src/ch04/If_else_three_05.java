package ch04;

import java.lang.*;
import java.util.Scanner;

public class If_else_three_05 {

	public static void main(String[] args) {

		String str1 = new String("恭喜猜到,獎品一包乖乖");
		Scanner in = new Scanner(System.in);
		int Ans = 38, Guess;

		System.out.println("請猜1~99");

		Guess = in.nextInt();

		if (Guess != Ans)
			str1 = (Guess > Ans) ? "您猜得太大了" : "您猜得太小了";

		System.out.println(str1);

	}
}