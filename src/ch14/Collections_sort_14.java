package ch14;
import java.lang.*;
import java.io.*;
import java.util.*; //使用Collections Framework的類別需載入

public class Collections_sort_14 {
	public static void main(String[] args) 
	{
		LinkedList<Integer> objLList1 = new LinkedList<Integer>();
		
		objLList1.add(24);objLList1.add(17);objLList1.add(41);
		objLList1.add(18);objLList1.add(30);objLList1.add(12);
		
		System.out.println("除特別號之外,大樂透開獎號碼是："+objLList1);
		
		Collections.sort(objLList1); //對元素排序
		System.out.println("	由小到大排序的號碼是："+objLList1);
	}
}
