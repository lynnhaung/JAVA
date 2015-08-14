package ch13;
import java.lang.*;

public class Thread_join_05
{
	public static void main(String[] args)
	{
		CCar4 obj1 = new CCar4("Ford");
		CCar4 obj2 = new CCar4("Toyota");
		obj1.start();  
		try
		{
			obj1.join();
			System.out.println("obj1執行緒已完成工作");
			obj2.start();
		}
		catch(InterruptedException e){}
	
	}
}

class CCar4 extends Thread  //繼承 Thread可實現多執行緒
{
	String manufacturer;
	public CCar4(String str){manufacturer =str;}
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