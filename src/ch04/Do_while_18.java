package ch04;

import java.util.Scanner;

public class Do_while_18 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char inputChar;
		String inputStr = new String();

		System.out.println("Game over..");

		do {
			System.out.println("Play again?");
			inputStr = scanner.nextLine();
			inputChar = inputStr.charAt(0);
		} while ((inputChar != 'y') && (inputChar != 'n'));
		{

		}

	}
}
