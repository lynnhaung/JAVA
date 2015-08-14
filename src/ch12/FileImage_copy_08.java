package ch12;
import java.lang.*;
import java.io.*;

public class FileImage_copy_08 {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		byte byteData[] = new byte[1];
		FileInputStream fi = new FileInputStream("/Users/Lynn/Desktop/pic1.png");
		FileOutputStream fo = new FileOutputStream("/Users/Lynn/Desktop/pic2.png");
		int fileSize = fi.available();
		int num;
		while((num = fi.read(byteData)) !=-1) //使用迴圈逐一複製每一個位元組
			fo.write(byteData);
		System.out.println("檔案大小 ＝"+fileSize+"位元組複製完畢");
		fi.close(); //關檔
		fo.close(); //關檔
		
	}
}
