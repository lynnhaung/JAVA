package ch14;
import java.lang.*;
import java.io.*;
import java.util.*;  //使用Collections Framwork 的類別需載入
public class ArrayList_06 {

	public static void main(String[] args)
	{
		ArrayList<Integer> objAryList1 = new ArrayList<Integer>();
		
		System.out.println("\t\t\t目前陣列內容為"+objAryList1);
		objAryList1.add(25); objAryList1.add(18); objAryList1.add(41);
		objAryList1.add(48); objAryList1.add(30); objAryList1.add(12);
		System.out.println("加入元素後,\t\t目前陣列內容為"+objAryList1);
		
		objAryList1.set(3, 10);
		System.out.print("已將索引3的元素設定為10");
		System.out.println("目前陣列內容為"+objAryList1);
		
		objAryList1.remove(2);  //移除索引為2的元素
		System.out.print("已將原始索引2的元素刪除");
		System.out.println("目前陣列內容為"+objAryList1);
		System.out.println("元素30的索引為"+objAryList1.indexOf(30));
	}
}
