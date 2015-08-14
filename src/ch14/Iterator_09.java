package ch14;
import java.lang.*;
import java.io.*;
import java.util.*; //使用Collections Framework的類別需載入

public class Iterator_09 {
	
	public static void main(String[] args)
	{
		TreeSet<Integer> objTS1 = new TreeSet<Integer>();
		
		objTS1.add(15);objTS1.add(18);objTS1.add(14);
		objTS1.add(37);objTS1.add(20);objTS1.add(6);
		
		System.out.println("集合目前長度為:"+objTS1.size());
		System.out.println("集合目前內容為:"+objTS1);
		
		Iterator<Integer> objltr1 = objTS1.iterator(); //設定相同泛形 Integer
		while(objltr1.hasNext())
		{
			System.out.print(objltr1.next()+ "");
		}
		System.out.println();
		objltr1.remove();
		
		System.out.println("集合目前長度為:"+objTS1.size());
		System.out.println("集合目前內容為:"+objTS1);
	}
}
