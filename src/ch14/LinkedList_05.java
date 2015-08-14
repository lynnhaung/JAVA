package ch14;
import java.lang.*;
import java.io.*;
import java.util.*;  //使用Collections Framwork 的類別需載入

public class LinkedList_05 {

		public static void main(String [] args)
		{
			LinkedList<Integer> objLList1 = new LinkedList<Integer>();
			objLList1.add(25); objLList1.add(18); objLList1.add(41); 
			objLList1.add(18); objLList1.add(30); objLList1.add(12); 
			
			showList(objLList1);
			System.out.println("第一個12的索引值為："+objLList1.indexOf(12));
			System.out.println("第一個元素為："+objLList1.getFirst());  //getFirst()可替換為peekFirst()
			System.out.println("最後一個元素為："+objLList1.getLast()); //getLast()可替換為peekLast()
			System.out.print("成功刪除前方第一個18：");
			System.out.println(objLList1.removeFirstOccurrence(18));
			System.out.print("成功刪除前方第一個12：");
			System.out.println(objLList1.removeFirstOccurrence(12));
			showList(objLList1);
			System.out.println("刪除第一個元素為："+objLList1.pollFirst());
			showList(objLList1);
			System.out.println("第一個12的索引值為："+objLList1.indexOf(12));
			
		}
		
		public static void showList(LinkedList objLList1)
		{
			System.out.print("LinkedList 目前長度為："+objLList1.size());
			System.out.print(" 串列目前為：");
				for(int i=0;i<objLList1.size();i++)
					System.out.print(objLList1.get(i)+" ");
				System.out.println();
		}
}

