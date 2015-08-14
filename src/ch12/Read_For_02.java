package ch12;
import java.lang.*;
import java.io.*;

public class Read_For_02 {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		char cbuf[] = new char[16];
		FileReader fr = new FileReader("/Users/Lynn/Desktop/text1.txt");
		int num;
		String str1;
		while((num = fr.read(cbuf))!= -1) //使用迴圈讀取文字檔的全部內容
		{
			str1 = new String(cbuf,0,num);
			System.out.println("總共讀取"+num+"個字元數");
			System.out.println(str1);
			System.out.println("--------------------");
		}
		fr.close(); //關檔
	}
	
}
