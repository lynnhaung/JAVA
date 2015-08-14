package ch13;
import java.lang.*;

public class Thread_implements_02
{
	public static void main(String[] args)
	{
		CCar1 obj1 = new CCar1("Ford");
		CCar1 obj2 = new CCar1("Toyota");
		obj1.start();  //啟動執行緒
		obj2.start();  //啟動執行緒
	}
}

class CCar1 extends Thread  //繼承 Thread可實現多執行緒
{
	String manufacturer;
	public CCar1(String str){manufacturer =str;}
	public void run()  //JVM自動執行
	{
		for(int i=1;i<=3;i++)
		{
			for(int t=1;t<100000000;t++)
			;//空迴圈,可延長第30行執行兩次之前的時間
			System.out.println(manufacturer+"is running");
		}
	}
}