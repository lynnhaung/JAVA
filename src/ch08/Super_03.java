package ch08;
import java.lang.*;

public class Super_03
{
	public static void main(String[] args)
	{
	CB2 objB = new CB2(10);
	objB.show();
	}
}

class CA2
{
	public int varX;
	public CA2()
	{
		System.out.println("父類別建構子執行中...");
	}
	public CA2(int i)
	{
	
		varX = i;
	}
}

class CB2 extends CA2
{
	public int varX; //新增的成員變數 ,與父類別成員同名
	public CB2(){}
	public CB2(int i)
	{
		super(i);//呼叫父類別建構子 public CA(int i),必須放在第一行
		varX = 100;
	}
	
	public void show()
	{
		super.varX++;
		System.out.println("子類別varX ="+varX);
		System.out.println("父類別varX="+super.varX);
	}
}