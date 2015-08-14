package ch12;
import java.lang.*;
import java.io.*;

public class ObjectOutputStream_10 {

	public static void main(String [] args) throws IOException
	{
		FileOutputStream fo = new FileOutputStream("/Users/Lynn/Desktop/file6.tmp");
		ObjectOutputStream oos = new ObjectOutputStream(fo);
		
		oos.writeObject(new CMyStudent("S9703501","王大民",89,84,75));
		oos.writeObject(new CMyStudent("S9703502","郭小志",77,69,87));
		oos.writeObject(new CMyStudent("S9703503","胡小龍",65,68,77));
		
		oos.close();
		fo.close();  //關檔
	}
}	
class CMyStudent1 implements Serializable   //CMyStudent 實作 Serializable介面
{
	private String id;
	private String name;
	private int scoreComputer;
	private int scoreMath;
	private int scoreEnglish;
	private int scoreSum;
	
	public CMyStudent1(String str1,String str2,int i,int j,int k)
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
	public void printSum()
	{
		//空敘述
	}
}

