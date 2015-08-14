package ch07;
import java.lang.*;

public class This_10
{
	public static void main(String [] args)
	{
		CMyClassd X = new CMyClassd();
		X.show();
	}
	
}


class CMyClassd
{
	public int var = 10;
	public void show()
	{
		int var = 20;
		System.out.println("區域變數 var="+var);
		System.out.println("成員變數 var="+this.var);
	}
}
