package ch09;
import java.lang.*;

public class Inherit_class_02
{
	public static void main(String[] args)
	{
		CCircle4 obj = new CCircle4(5.0);
		obj.computeArea();
		obj.show();
	}

}

interface ICircle1  //定義介面
{
	double pi =3.14;   //宣告成員變數
	void show();   //宣告成員函式
	void computeArea(); //宣告成員函式
}
class CShape
{
	protected double area;
	public void show()
	{
		System.out.println("area="+area);
	}
}
class CCircle4 extends CShape implements ICircle  //實作介面
{
	protected double area;
	protected double radius;
	public CCircle4(double i){radius = i;}
	public void show()
	{
		System.out.println("area="+area);
	}
	public void computeArea()
	{
		area = radius*radius*pi;
	}
}