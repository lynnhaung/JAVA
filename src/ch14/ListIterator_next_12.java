package ch14;
import java.lang.*;
import java.io.*;
import java.util.*; //使用Collections Framework的類別需載入

public class ListIterator_next_12 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> objLList1 = new LinkedList<Integer>();
		objLList1.add(24);objLList1.add(17);objLList1.add(41);
		objLList1.add(18);objLList1.add(30);objLList1.add(12);
		
		System.out.println("集合目前長度為:" + objLList1.size());
		System.out.println("集合目前內容為:" + objLList1);
		
		ListIterator<Integer> objListItr1 = objLList1.listIterator(2);
		System.out.println("ListItr1 的下一個元素為："+objListItr1.next());
		
		objListItr1.add(40);
		System.out.println("已插入一個元素40");
		System.out.print("集合目前長度為"+objLList1.size());
		System.out.print("集合目前內容為"+objLList1);
		
		objListItr1.next();
		objListItr1.next();
		System.out.println("已往後移動兩個元素");
		objListItr1.set(25);//objListItr1.remove(); //objListItr1.set(25);
		System.out.print("已刪除一個元素");
		
		System.out.println("集合目前長度為:" + objLList1.size());
		System.out.println("集合目前內容為:" + objLList1);
	}
}
