package ch09;
import java.lang.*;

public class Object_array_10
{
	public static void main(String[] args)
	{
		int[][] ary1 = new int [][]{{1,2,3},{4,5,6}}; //二維陣列實體
		Object obj1;
		obj1 = (Object)ary1;  //型態轉換
		System.out.println("ary1執行toString="+ary1.toString());
		System.out.println("obj1執行toString="+obj1.toString());
		
		int[][] ary2 = (int[][]) obj1; //宣告二維陣列參考並進行型態轉換
		System.out.println("ary1[1][1]="+ary1[1][1]);
		System.out.println("ary2[1][1]="+ary2[1][1]);
	}
}