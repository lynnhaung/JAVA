package ch13;
import java.lang.*;

public class Thread_sychronized_08
{
	public static void main(String args[])
	{
		COperation2 atmObj = new COperation2();
		COperation2 counterObj =new COperation2();
		
		atmObj.start();
		counterObj.start();
	}
}

class CAccount2
{ 
	static int balance = 10000; //帳戶餘額
	static int accountNo = 8529; //帳號
	
	public synchronized static void withdraw(int m)
	{
		int temp;
		temp = balance;
		//sleep 模擬其他因素導致Thread被暫停
		try{Thread.sleep((long)(1000*Math.random()));}
		catch(InterruptedException e){}
		temp = temp-m;
		try{Thread.sleep((long)(1000*Math.random()));}
		catch(InterruptedException e){}
		balance = temp; //寫入 balance
		System.out.println(Thread.currentThread().getName()+"：請收取"+m+"元");
		checkBalance();
	}
	public static void checkBalance()
	{
		int temp = balance;
		//sleep 模擬其他因素導致Thread被暫停
		try{Thread.sleep((long)(1000*Math.random()));}
		catch(InterruptedException e){}
		System.out.print(Thread.currentThread().getName()+"執行中:");
		System.out.println("帳戶"+accountNo+"內有"+temp+"元");
	}
}
//
class COperation2 extends Thread //多執行緒類別
{
	public void run()
	{
		CAccount2.withdraw(1000);
	}
}