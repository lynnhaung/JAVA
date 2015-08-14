package ch13;
import java.lang.*;

public class Thread_Runnable_03
{
	public static void main(String[] args)
	{
		CCar2 car1 = new CCar2("Ford");
		CCar2 car2 = new CCar2("Toyota");
		Thread obj1 = new Thread(car1); //必須產生Thread物件
		Thread obj2 = new Thread(car2); //必須產生Thread物件
		obj1.start();  //只有使用Thread物件才能執行start()啟動多執行緒
		obj2.start();  //只有使用Thread物件才能執行start()啟動多執行緒
	}
}



class CWheeledDevices
{
	int wheel;
}

class CCar2 extends CWheeledDevices implements Runnable
{
	String manufacturer;
	public CCar2(String str){manufacturer =str;}
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