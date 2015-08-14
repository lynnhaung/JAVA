package ch12;
import java.lang.*;
import java.io.*;

public class Read_charStream_01 {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		char cbuf[] = new char[256];
		FileReader fr = new FileReader("/Users/Lynn/Desktop/text1.txt");
		
		int num = fr.read(cbuf); //讀取最多256個字元到cbuf中
		String str1 = new String(cbuf,0,num); //字元陣列轉換為字串
		System.out.println("總共讀取"+num+"個字元數");
		System.out.println("檔案內容如下");
		System.out.println(str1);
		fr.close(); //關檔
		
	}
}
