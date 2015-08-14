package ch04;

import java.lang.*;

public class ch4_ex2 {

	public static void main(String[] args) {

		int sum, count = 0;
		for (int i = 1; i <= 1000; i++) {
			sum = 0;
			for (int j = 1; j <= i; j++) { // 迴圈由1跑到自己
				if (i % j == 0)// 若可整除累加計數器
					sum++;
			}
			if (sum == 2) // 1與自己必然整除，所以只有2個可整除的即為質數
			{
				System.out.print(i + "  ");
				count++;
				if (count % 5 == 0)
					System.out.println();
			}
		}
	}
}
