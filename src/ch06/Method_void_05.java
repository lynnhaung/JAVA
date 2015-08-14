package ch06;

import java.lang.*;
import java.util.Scanner;

public class Method_void_05 {

	public static void main(String[] args) {

		print99();
	}

	public static void print99() {
		int i, j;
		for (i = 1; i <= 9; i++) {
			for (j = 1; j <= 9; j++)
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			System.out.println();
		}

	}

}