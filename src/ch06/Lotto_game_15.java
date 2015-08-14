package ch06;

import java.lang.*;
import java.util.Arrays;


public class Lotto_game_15 {

	public static void main(String[] args) {

		int lotto[] = new int[6];
		int special;


		special = generate_lotto(lotto);
		System.out.println("樂透號碼如下....");
		for (int i = 1; i < lotto.length; i++)
			System.out.print(lotto[i] + "\t");
		System.out.println();
		System.out.println("特別號" + special);

	}

	public static int generate_lotto(int arr[]) {
		int generateNum;
		for (int i = 1; i < arr.length; i++) {
			generateNum = (int) ((Math.random() * 49) + 1);

			while (seqSearch(generateNum, arr) != -1) {
				generateNum = (int) ((Math.random() * 49) + 1);
			}
			arr[i] = generateNum;
		}
		generateNum = (int) ((Math.random() * 49) + 1);
		while (seqSearch(generateNum, arr) != -1) {
			generateNum = (int) ((Math.random() * 49) + 1);
		}
		return generateNum;
	}

	public static int seqSearch(int target ,int arr [])

	{
		for (int i = 0; i < arr.length; i++) {
			if (target == arr[i]) {
				return i;
			}
			
		}
		return -1;
	}

}
