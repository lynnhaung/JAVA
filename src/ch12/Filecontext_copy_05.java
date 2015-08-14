package ch12;
import java.lang.*;
import java.io.*;

public class Filecontext_copy_05 {

	public static void main (String[] args) throws IOException,FileNotFoundException
	{
		char cbuf[] = new char[1]; //cbuf的陣列大小為1,故一次複製一個字元
		FileReader fr = new FileReader("/Users/Lynn/Desktop/text1.txt");
		FileWriter fw = new FileWriter("/Users/Lynn/Desktop/text3.txt");
		int num;
		String str1;
		while((num = fr.read(cbuf)) != -1)   //使用迴圈逐一複製文字檔內容
			fw.write(cbuf);
		fr.close(); //關檔
		fw.close();	//關檔
			
		
	}
}
