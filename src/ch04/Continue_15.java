package ch04;

import java.lang.*;

public class Continue_15 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if ((i % 2) == 1)
				continue;
			sum = sum + i;

		}
		System.out.println("2+4+8+10=" + sum);
	}
}
