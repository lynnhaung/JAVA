package ch08;
import java.lang.*;

public class Abstract_inherit_13
{
	public static void main(String[] args)
	{
		CMyRect obj = new CMyRect(5.0,15.0);
		obj.computeArea();  //計算面積
		obj.show();
	}
}

abstract class CShape2  //定義抽象類別
{
	protected double area;
	public abstract void show();   //宣告抽象函式
	public abstract void computeArea(); //宣告抽象函式
}

abstract class CRect3 extends CShape
{//類別CRect3繼承自類別CShape,未完全實作全部的抽象函式,故仍為抽象類別
	protected double length,width;
	public CRect3(double i ,double j){length=i; width=j;}
	public void computeArea()  //Override ,實作 computeArea() method
	{
		area = length*length;
	}
}

class CMyRect extends CRect
{
	public CMyRect(double i,double j)
	{
		super(i,j);
	}
	public void show()  //Override ,實作 computeArea() method
	{
		System.out.println("矩形 area="+area);
	}
}