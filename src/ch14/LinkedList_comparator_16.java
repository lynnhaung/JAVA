package ch14;

import java.lang.*;
import java.io.*;
import java.util.*; //使用Collections Framework的類別需載入

public class LinkedList_comparator_16 {
	public static void main(String[] args) {

		LinkedList<CStu1> objLList1 = new LinkedList<CStu1>();

		CStu1 obj1 = new CStu1(98007, "李小清", 85);
		CStu1 obj2 = new CStu1(98004, "陳大華", 87);
		CStu1 obj3 = new CStu1(98002, "黃大維", 75);
		CStu1 obj4 = new CStu1(98006, "林大勇", 92);

		objLList1.add(obj1);
		objLList1.add(obj2);
		objLList1.add(obj3);
		objLList1.add(obj4);

		CMyComparator1 objComp1 = new CMyComparator1(); // 排序依據1
		Collections.sort(objLList1, objComp1); // 使用排序依據1進行排序

		ListIterator<CStu1> objListItr1 = objLList1.listIterator();

		System.out.println("學號遞增顯示：");
		while (objListItr1.hasNext()) {
			objListItr1.next().showData();
		}
		
		CMyComparator2 objComp2 = new CMyComparator2(); // 排序依據2
		Collections.sort(objLList1, objComp2); // 使用排序依據2進行排序

		ListIterator<CStu1> objListItr2 = objLList1.listIterator();

		System.out.println("學號遞增顯示：");
		while (objListItr2.hasNext()) {
			objListItr2.next().showData();
		}
	}
}

class CMyComparator1 implements Comparator {  //實作 Comparator 介面
	public int compare(Object o1, Object o2) {
		if (o1 instanceof CStu1 && o2 instanceof CStu1) {
			if (((CStu1) o1).id < ((CStu1) o2).id)
				return -1;
			else if (((CStu1) o1).id == ((CStu1) o2).id)
				return 0;
			else if (((CStu1) o1).id > ((CStu1) o2).id)
				return 1;
		}
		return 0;
	}
}

class CMyComparator2 implements Comparator {  //實作 Comparator 介面
	public int compare(Object o1, Object o2) {
		if (o1 instanceof CStu1 && o2 instanceof CStu1) {
			if (((CStu1) o1).score < ((CStu1) o2).score)
				return -1;
			else if (((CStu1) o1).score == ((CStu1) o2).score)
				return 0;
			else if (((CStu1) o1).score > ((CStu1) o2).score)
				return 1;
		}
		return 0;

	}
}

class CStu1 {
	int id;
	String name;
	int score;

	public CStu1(int i, String j, int k) {
		id = i;
		name = j;
		score = k;
	}

	public void showData() {
		System.out.print("學號：" + id);
		System.out.print("\t姓名：" + name);
		System.out.println("\t成績：" + score);
	}
}