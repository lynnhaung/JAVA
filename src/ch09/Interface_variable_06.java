package ch09;
import java.lang.*;

public class Interface_variable_06
{
	public static void main(String[] args)
	{
		int i;
		IA obj = new CA();  //介面型態變數參考實作類別物件實體
		obj.show1();        //可執行介面宣告的方法(由子類別改寫的method)
		i = obj.varA;
		//obj.varB = 10;  //不可存取新稱的成員變數
		//obj.show2(); //不可實行新增的method
	}
}

interface IA
{
	public static final int varA = 5;
	public abstract void show1();
}

class CA implements IA
{
	public int varB;
	public void show1()
	{
		System.out.println("實作類別改寫的show1()執行中");
	}
	public void show2()
	{
		System.out.println("實作類別改寫的show2()執行中");
	}
}