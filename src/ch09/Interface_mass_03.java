package ch09;
import java.lang.*;

public class Interface_mass_03
{
	public static void main(String[] args)
	{
		CCircle5 obj = new CCircle5(5.0);
		obj.computeArea();
		obj.show();
		obj.draw(1);
	}
}

interface ICircle2  //定義介面
{
	public static final double pi =3.14;   //宣告成員變數
	public abstract void show();   //宣告成員函式
	public abstract void computeArea(); //宣告成員函式
}

interface IColor  //定義介面
{
	
	
	public abstract void draw(int i); 
}

class CShape1
{
	protected double area;
	public void show()
	{
		System.out.println("area="+area);
	}
}
class CCircle5 extends CShape1 implements ICircle2 ,IColor //實作兩個介面
{
	
	protected double radius;
	public CCircle5(double i){radius = i;}
	
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
}