package ch10;
import java.lang.*;
import java.util.Scanner;

public class Exception_diy_05
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("請輸入陣列大小");
		int lottoSize = 0;
		
		try
		{
			lottoSize = scan.nextInt();
			if((lottoSize>48)||(lottoSize<6))
				throw new CmyException1();
		}
		catch(CmyException1 e)
		{
			e.showMessage();
			lottoSize = e.changeSize();
		}
		finally
		{
			System.out.println("樂透開獎球數為:"+lottoSize);
		}
		int lottoAry[] = new int [lottoSize];
		System.out.println("存放樂透開獎的陣列實體產生完畢");
	}
}

class CmyException1 extends Exception
{
	public CmyException1() //建構子
	{
		super();
	}
	public void showMessage()
	{
		System.out.println("例外訊息:陣列大小錯誤");
	}
	public int changeSize()
	{
		System.out.println("例外訊息:陣列大小將被重設為6");
		return 6;
	}
}