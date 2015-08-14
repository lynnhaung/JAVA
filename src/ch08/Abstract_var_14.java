package ch08;
import java.lang.*;

public class Abstract_var_14
{
	public static void main(String[] args)
	{
		CShape objArr[] = new CShape[4];  //抽象型態的變數陣列
		objArr[0] = new CRect(10.0, 20.0); //變數參考子類別物件實體
		objArr[1] = new CRect(5.0, 15.0);
		objArr[2] = new CCircle(3.0);
		objArr[3] = new CCircle(6.0);

		for (int i = 0; i < objArr.length; i++) {

			objArr[i].computeArea();  //執行子類別改寫的計算面積公式
		}
		System.out.println("物件的面積如下");
		CShape.show(objArr);    //顯示面積
		CShape.sortByArea(objArr);
		System.out.println("物件依面積排序後如下");
		CShape.show(objArr);	//顯示面積
	}
	}



abstract class CShape3
{
	protected double area;

	public static void show(CShape objArr[]) {
		for (int i = 0; i < objArr.length; i++) 
			System.out.print(objArr[i].area + "\t");
		System.out.println();
		
	}

	public static void sortByArea(CShape objArr[]) {
		int k, times;
		CShape temp;
		k = objArr.length - 1;
		while (k != 0) {
			times = 0;
			for (int i = 0; i <= k - 1; i++) {
				if (objArr[i].area > objArr[i + 1].area) {
					temp = objArr[i];
					objArr[i] = objArr[i + 1];
					objArr[i + 1] = temp;
					times = i;
				}
			}
			k = times;
		}
	}
	
	public abstract void computeArea();
}

class CRect4 extends CShape3 // 類別CRect繼承自類別CShape
{
	protected double length, width;

	public CRect4(double i, double j) {
		length = i;
		width = j;
	}

	public void computeArea() {

		area = length * width;
	}
}

class CCircle4 extends CShape3 // 類別CCircle繼承自類別CShape
{
	protected double radius;
	protected final double pi = 3.14;

	public CCircle4(double i) {
		radius = i;
	}

	public void computeArea() {
		area = radius * radius * pi;
	}
}