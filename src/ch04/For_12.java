package ch04;

import java.lang.*;
import java.util.Scanner;

public class For_12 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int sum = 0, n;

		System.out.println("請輸入N值：");
		n = scanner.nextInt();

		for (int i = 1; i <= n; i = i + 2) 
			sum += i;

			if ((n % 2) == 1)

				System.out.println("1+3+...+n=" + sum);
			else
				System.out.println("1+3+...+n-1=" + sum);

		}
	}


