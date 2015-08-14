package ch09;
import java.lang.*;

public class Interface_parents_04
{
	public static void main(String[] args)
	{
		CCircle6 obj = new CCircle6(5.0);
		obj.computeArea();
		obj.show();
		obj.draw(2,1);
	}
}

interface ICircle3  //定義介面
{
	public static final double pi =3.14;   //宣告成員變數
	
	public abstract void computeArea(); //宣告成員函式
}

interface IColor1  //定義介面
{
	
	
	public abstract void draw(int i); 
}

interface IColorCircle extends IColor1,ICircle //繼承兩個父介面
{
	public abstract void show();
	public abstract void draw(int i);//無意義的宣告,與IColor1父介面相同
	//public abstract int draw(int i); //錯誤的宣告 在IColor1已繼承 void draw(int i)
	public abstract void draw(int i,int j); //新增的方法宣告
}

class CShape2
{
	protected double area;
	public void show()
	{
		System.out.println("area="+area);
	}
}
class CCircle6 extends CShape2 implements IColorCircle //實作三個介面 IColorCircle,ICircle,IColor
{
	
	protected double radius;
	public CCircle6(double i){radius = i;}
	
	public void computeArea()
	{
		area = radius*radius*pi;
	}
	public void draw(int i)
	{
		if(i==0) System.out.println("圖形為藍色圓形");
		else if(i==1) System.out.println("圖形為紅色圓形");
		else if(i==2) System.out.println("圖形為綠色圓形");
		else  System.out.println("顏色錯誤");
	}
	public void draw(int i, int j)
	{
		draw(i);
		if(j==0) System.out.println("圖形為空心");
		else if(j==0) System.out.println("圖形為實心");
		else System.out.println("填入錯誤");
		
		
	}
}