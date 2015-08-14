package ch14;
import java.lang.*;
import java.io.*;
import java.util.*;  //使用Collections Framwork 的類別需載入

public class TreeSet_04 {
	
	public static void main(String[] args)
	{
		TreeSet<Integer> objTS1 = new TreeSet<Integer>();
		
		objTS1.add(15); objTS1.add(18); objTS1.add(14); 
		objTS1.add(37); objTS1.add(20); objTS1.add(6); 
		System.out.println("加入15是否成功："+objTS1.add(15));  //會失敗(重複)
		
		System.out.println("集合1目前長度為:"+objTS1.size());
		System.out.println("集合1目前內容為:"+objTS1);
		
		System.out.println("第一個元素為"+objTS1.first());
		System.out.println("第一個元素為"+objTS1.last());
		System.out.println("比15大的最小元素為"+objTS1.higher(15));
		System.out.println("比15小的最大元素為"+objTS1.lower(15));
		System.out.print("介於15(含)~20(不含)的子集合為：");
		System.out.println(objTS1.subSet(15,20));
		
		System.out.println("-------------------------");
		System.out.println("移除最小元素"+objTS1.pollFirst());
		System.out.println("移除最大元素"+objTS1.pollLast());
		System.out.println("集合1目前長度為:"+objTS1.size());
		System.out.println("集合1目前內容為:"+objTS1);
	}
}
