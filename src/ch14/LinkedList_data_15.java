package ch14;
import java.lang.*;
import java.io.*;
import java.util.*; //使用Collections Framework的類別需載入

public class LinkedList_data_15 {
	public static void main(String[] args) 
	{
		LinkedList<CStu> objLList1 = new LinkedList<CStu>();
		
		CStu obj1 = new CStu(98007,"李小清",85);
		CStu obj2 = new CStu(98004,"陳大華",87);
		CStu obj3 = new CStu(98002,"黃大維",75);
		CStu obj4 = new CStu(98006,"林大勇",92);
		
		objLList1.add(obj1);objLList1.add(obj2);
		objLList1.add(obj3);objLList1.add(obj4);
		
		//System.out.println("集合內容為："+objLList1);
		
		ListIterator<CStu> objListItr1 = objLList1.listIterator();
		
		System.out.println("正向走訪");
		while(objListItr1.hasNext())
		{
			objListItr1.next().showData();
		}
		//Collections.sort(objLList1); //無法排序
	}
}

class CStu 
{
	int id;
	String name;
	int score;
	public CStu(int i,String j,int k ){id=i; name=j; score=k;}
	public void showData()
	{
		System.out.print("學號："+id);
		System.out.print("\t姓名："+name);
		System.out.println("\t成績："+score);
	}
}