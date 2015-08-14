package ch14;
import java.lang.*;
import java.io.*;
import java.util.*; //使用Collections Framework的類別需載入

public class ListIterator_11 {

	public static void main(String[] args)
	{
		LinkedList<Integer> objLList1 = new LinkedList<Integer>();
		objLList1.add(24);objLList1.add(17);objLList1.add(41);
		objLList1.add(18);objLList1.add(30);objLList1.add(12);
		
		int len = objLList1.size();
		System.out.println("集合目前長度為:" + objLList1.size());
		System.out.println("集合目前內容為:" + objLList1);
		
		ListIterator<Integer> objListltr1 = objLList1.listIterator();
		ListIterator<Integer> objListltr2 = objLList1.listIterator(len);
		
		System.out.print("正向走訪");
		while(objListltr1.hasNext())
		{
			System.out.print(objListltr1.next()+" ");
		}
		System.out.println();
		
		System.out.print("反向走訪");
		while(objListltr2.hasPrevious())
		{
			System.out.print(objListltr2.previous()+" ");
		}
		System.out.println();
	}
}
