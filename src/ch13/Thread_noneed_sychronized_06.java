package ch13;
import java.lang.*;
import java.io.*;

public class Thread_noneed_sychronized_06
{
	public static void main(String args[])
	{
		COperation atmObj = new COperation();
		COperation counterObj =new COperation();
		
		atmObj.start();
		counterObj.start();
	}
}

class CAccount
{ 
	static int balance = 10000; //帳戶餘額
	static int accountNo = 8529; //帳號
	
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

class COperation extends Thread //多執行緒類別
{
	public void run()
	{
		CAccount.checkBalance();
	}
}