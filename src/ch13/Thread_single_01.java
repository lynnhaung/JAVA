package ch13;
import java.lang.*;
import java.io.*;
import java.io.*;
public class Thread_single_01
{
	public static void main(String[] args)
	{
		CCar obj1 = new CCar("Ford");
		CCar obj2 = new CCar("Toyota");
		obj1.run();
		obj2.run();
	}
}

class CCar
{
	String manufacturer;
	public CCar(String str){manufacturer = str;}
	public void run()
	{
		for(int i=1; i<=3; i++)
		{
			for(int t=1;t<100000000;t++)
					;//空迴圈,可延長第30行執行兩次之間的時間
				System.out.println(manufacturer+"is running");
			
		}
	}
}