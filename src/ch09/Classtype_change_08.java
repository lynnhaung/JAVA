package ch09;
import java.lang.*;

public class Classtype_change_08
{
	public static void main(String[] args)
	{
		CA1 obj1;   //宣告父類別型態變數
		
		obj1 = new CB();  //obj1指向子類別CB物件實體
		//obj1.show1();    	//未轉型不能執行父類別為宣告的show1()
		((CB)obj1).show1();  //轉型後可執行show2()
		obj1.show2();   //可執行父類別宣告的show2()
		//obj1.show3();  //未轉型不能執行父類別為宣告的show3()
		((CB)obj1).show3();  //轉型後可執行show3()
		System.out.println("--------------");
		CB obj2;     	//宣告子類別型態變數
		obj2 = (CB) obj1;  //obj2指向obj1所指物件(須轉型,不能直接指定)
		obj2.show1();
		obj2.show2();
		obj2.show3();
	}

}

interface IA1  //定義介面
{
	public abstract void show1();
}

abstract class CA1
{
	public void show2()
	{
		System.out.println("This is CA's show2()");
	}
}

class CB extends CA1 implements IA1
{
	public void show1()
	{
		System.out.println("This is CB'show1()");
	}
	public void show3()
	{
		System.out.println("This is CB'show3()");
	}
}