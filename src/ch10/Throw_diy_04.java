package ch10;
import java.lang.*;

public class Throw_diy_04
{
	public static void main(String[] args)throws CmyException
	{
		System.out.println("這一行會被執行");
		int i = -2;
		if(i<0)
			throw new CmyException("陣列大小出現負數");
		int ary[] = new int[i];//這一行不會被執行
		System.out.println("這一行不會被執行");
		
	}
}

class CmyException extends Exception
{
	public CmyException() //建構子
	{
		super();
	}
	public CmyException(String msg) //建構子
	{
		super(msg);
	}
}