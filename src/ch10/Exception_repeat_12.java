package ch10;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_repeat_12
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int ary[] = new int[]{0,5,10,15,20,25,30,35,40,45};
		int x = 0, num =0;
		
		try //外層 try區塊
		{
		try
		{
			System.out.print("請問要讀取陣列第幾個元素:");
			x = scan.nextInt();
			num = ary[x];
			System.out.println("ary["+x+"]="+num);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("例外發生：存取超過陣列大小範圍");
		}
		catch(InputMismatchException e)
		{
			System.out.println("捕捉到轉型例外,準備交給外層處理");
			throw e;
		}
		
	}catch(InputMismatchException e) //外層catch區塊
	{
		System.out.println("例外發生：索引應為數值!");
		
	}
		System.out.println("...程式即將結束...");
	}

}