package ch08;
import java.lang.*;

public class ToString_11
{
	public static void main(String[] args)
	{
	CRect1 X = new CRect1();
	CCircle1 Y = new CCircle1();
	String str = new String();
	str = X.toString();
	System.out.println("CRect1類別物件執行toString:\t"+str);
	str = Y.toString();
	System.out.println("CCircle1類別物件執行toString:\t"+str);
	}
}

class CRect1
{
	private int length,width;
	
}

class CCircle1
{
	private int radius;
	public String toString()
	{
		return "CCircle1 類別是用來存放圖形";
	}
	
}