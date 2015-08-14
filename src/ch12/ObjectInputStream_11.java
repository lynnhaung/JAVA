package ch12;
import java.lang.*;
import java.io.*;

public class ObjectInputStream_11 {

	public static void main(String[] args) throws IOException,ClassNotFoundException
	{
		FileInputStream fi = new FileInputStream("/Users/Lynn/Desktop/file6.tmp");
		ObjectInputStream ois = new ObjectInputStream(fi);
		CMyStudent obj1;
		
		obj1 = (CMyStudent)ois.readObject();
		obj1.printSum();
		obj1 = (CMyStudent)ois.readObject();
		obj1.printSum();
		obj1 = (CMyStudent)ois.readObject();
		obj1.printSum();
		
		ois.close();
		fi.close();  //關檔
	}
}
class CMyStudent implements Serializable   //CMyStudent 實作 Serializable介面
{
	private String id;
	private String name;
	private int scoreComputer;
	private int scoreMath;
	private int scoreEnglish;
	private int scoreSum;
	
	public CMyStudent(String str1,String str2,int i,int j,int k)
	{
		id = str1;
		name = str2;
		scoreComputer = i;
		scoreMath = j;
		scoreEnglish = k;
		computeSum();
		
	}
	public void computeSum()
	{
		scoreSum = scoreComputer+scoreMath+scoreEnglish;
	}
	public void printSum()   //修改函式內容,但函式不可或缺
	{
		System.out.println(id+" "+name+"總分 ="+scoreSum);
	}
}