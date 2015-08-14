package ch08;
import java.lang.*;

public class Final_08
{
	public static void main(String[] args)
	{
		final String str = new String("final修飾字的示範");
		//str = new String("......"); //str參考已被設定過,不可指向其他物件實體
		System.out.println(str);
		CB5 obj = new CB5();
		obj.add();
		obj.show();
	}
}

class CA5
{
	public final int var1;
	public int var2;
	
	public CA5()
	{
		var1 = 10;
		var2 = 10;
	}
	
	public void add()
	{
		//var1++;  //因為public "final" int var1; 
		var2++;
	}
	
	public final void show()  //不可被改寫的method
	{
		System.out.println("var1="+var1+"\tvar2="+var2);
	}
}
class CB5 extends CA5
{
	public void add()
	{
		//var1= var1+10; //因為public "final" int var1; 
		var2 = var1+var2;
	}
	//public void show(){}  //因為public "final" void show()
}

final class CC     //類別不可以被繼承
{
	public int var3;
}

//class CD extends CC{}  //因為 "final" class CC  