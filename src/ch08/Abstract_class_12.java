package ch08;
import java.lang.*;

public class Abstract_class_12
{
	public static void main(String[] args)
	{
		//CShape1 obj = new CShape1();  //error, 抽象類別不能產生物件
		CRect2 obj1 = new CRect2(5.0, 15.0); 
		CCircle2 obj2 = new CCircle2(3.0);
		obj1.computeArea();
		obj2.computeArea();
		System.out.print("矩形");
		obj1.show();
		System.out.print("圓形");
		obj2.show();
		
		
	}
}

abstract class CShape1 {
	protected double area;

	public void show() 
	{
		System.out.println("area="+ area);
		
	}
	

	public abstract void computeArea();  //宣告抽象函式(結尾加分號)
}

class CRect2 extends CShape1 // 類別CRect繼承自類別CShape
{
	protected double length, width;

	public CRect2(double i, double j) {
		length = i;
		width = j;
	}

	public void computeArea() {  //Override ,實作 computeArea() method

		area = length * width;
	}
}

class CCircle2 extends CShape1 // 類別CCircle繼承自類別CShape
{
	protected double radius;
	protected final double pi = 3.14;

	public CCircle2(double i) {
		radius = i;
	}

	public void computeArea() {   //Override ,實作 computeArea() method
		area = radius * radius * pi;
	}
}