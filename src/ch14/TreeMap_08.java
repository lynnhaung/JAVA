package ch14;
import java.lang.*;
import java.io.*;
import java.util.*; //使用Collections Framework的類別需載入

public class TreeMap_08 {
	

	public static void main(String[] args)
	{
		TreeMap<Integer,String> objTM1 = new TreeMap<Integer,String>();
		
		System.out.print("TreeMap目前為空:"+objTM1.isEmpty());
		
		objTM1.put(98007, "李小清");
		objTM1.put(98004, "陳大華");
		objTM1.put(98002, "黃大雄");
		objTM1.put(98006, "林大勇");
		
		System.out.println("TreeMap目前共有:"+objTM1.size()+"個成對元素");
		System.out.println("目前內容為:"+objTM1);
		
		System.out.print("第一個元素為 "+objTM1.firstKey());
		System.out.println(""+objTM1.get(objTM1.firstKey()));
		System.out.print("最後一個元素為 "+objTM1.lastKey());
		System.out.println(""+objTM1.get(objTM1.lastKey()));
		System.out.print("比98005大的最小關鍵值為 ");
		System.out.println(objTM1.higherKey(98005));
		System.out.print("比98005小的最大關鍵值為 ");
		System.out.println(objTM1.lowerKey(98005));
		System.out.print("介於98004(含)~98007(不含)的子TreeMap為:");
		System.out.println(objTM1.subMap(98004,98007));
		
	}

}
