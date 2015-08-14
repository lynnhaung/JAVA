package ch03;

import java.lang.*;
import java.util.Scanner;

public class Scanner_01b {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String inputPW =in.nextLine();

		System.out.println("您輸入的密碼如下：");
		System.out.println(inputPW);
	}
}