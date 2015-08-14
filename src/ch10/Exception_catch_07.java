package ch10;
import java.lang.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception_catch_07
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int lottoSize =0;
		int lottoAry[];
		
		while(true)
		{
			try
			{
				System.out.println("請輸入陣列大小");
				lottoSize = scan.nextInt();
				lottoAry = new int [lottoSize];
				break;  //跳出while迴圈
			}
			catch(InputMismatchException e)
			{
				System.out.println("陣列大小請輸入數字");
			}
			catch(Exception e)
			{
				System.out.println("有非未考慮到的例外發生了");
			}
			finally
			{
				
			}
		}
		System.out.println("程式正確執行中..");
	}
}