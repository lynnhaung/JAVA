package ch09;
import java.lang.*;

public class Interface_01
{
	public static void main(String[] args)
	{
		CCircle obj = new CCircle(5.0);
		obj.computeArea();
		obj.show();
	}
}

interface ICircle  //定義介面
{
	double pi =3.14;   //宣告成員變數
	void show();   //宣告成員函式
	void computeArea(); //宣告成員函式
}

class CCircle implements ICircle  //實作介面
{
	protected double area;
	protected double radius;
	public CCircle(double i){radius = i;}
	public void show()
	{
		System.out.println("area="+area);
	}
	public void computeArea()
	{
		area = radius*radius*pi;
	}
}