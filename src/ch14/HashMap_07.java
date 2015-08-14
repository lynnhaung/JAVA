package ch14;
import java.lang.*;
import java.io.*;
import java.util.*; //使用Collections Framework的類別需載入

public class HashMap_07 {

	public static void main(String[] args)
	{
		HashMap<Integer,String>objHM1 = new HashMap<Integer,String>();
		
		System.out.print("Map目前為空:"+objHM1.isEmpty());
		System.out.println("Map目前共有:"+objHM1.size()+"個成對元素");
		
		System.out.println("加入key=98002:"+objHM1.put(98002,"李小清"));
		System.out.println("加入key=98001:"+objHM1.put(98001,"陳大華"));
		System.out.println("加入key=98003:"+objHM1.put(98002,"黃大雄"));
		
		System.out.print("Map目前共有:"+objHM1.size()+"個成對元素");
		System.out.println("目前內容為:"+objHM1);
		
		//覆蓋舊值
		System.out.println("加入key=98002:"+objHM1.put(98002,"林大勇"));
		
		System.out.print("Map目前共有:"+objHM1.size()+"個成對元素");
		System.out.println("目前內容為:"+objHM1);
		
		System.out.print("關鍵值 key=98003的對應值為：");
		System.out.println(objHM1.get(98003));
		System.out.print("Ｍap 中是否包含關鍵值 key=98004的元素：");
		System.out.println(objHM1.containsKey(98004));
		System.out.print("Ｍap 中是否包含關鍵值 key=98002的元素：");
		System.out.println(objHM1.containsKey(98002));
		System.out.print("Ｍap 中是否包含關鍵值 value=陳大華的元素：");
		System.out.println(objHM1.containsValue("陳大華"));
		
		//覆蓋舊值
		System.out.println("加入key=98001:"+objHM1.put(98001,"黃大雄"));
		System.out.print("Map目前共有:"+objHM1.size()+"個成對元素");
		System.out.println("目前內容為:"+objHM1);
		
		Set<Integer> objSet = objHM1.keySet();
		System.out.println("學號集合內容為"+objSet);
		Collection<String>objCol = objHM1.values();
		System.out.println("姓名集合內容為"+objCol);
		
		System.out.println("移除key=98003:"+objHM1.remove(98003));
		System.out.print("Map目前共有:"+objHM1.size()+"個成對元素");
		System.out.println("目前內容為:"+objHM1);
		
		
		
		
		
	}
}
