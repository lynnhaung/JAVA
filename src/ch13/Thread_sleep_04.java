package ch13;
import java.lang.*;

public class Thread_sleep_04
{
	public static void main(String[] args)
	{
		CCar3 obj1 = new CCar3("Ford");
		CCar3 obj2 = new CCar3("Toyota");
		obj1.start(); 
		obj2.start();
	}
}



class CCar3 extends Thread  //繼承 Thread可實現多執行緒
{
	String manufacturer;
	public CCar3(String str){manufacturer =str;}
	
	public void run()  
	{
		for(int i=1;i<=3;i++)
		{
			try  //sleep會丟出例外,所以要包在try.catch內
			{
				sleep((long)(1000*Math.random())); //休眠0~1秒鐘
			}
			catch(InterruptedException e){}
			
			System.out.println(manufacturer+"is running");
		}
	}
}