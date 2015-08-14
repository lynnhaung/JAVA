package ch12;
import java.lang.*;
import java.io.*;

public class Writer_append_04 {

	public static void main(String[] args) throws IOException
	{
		String str1 = "費式數列是一個無限數列";
		FileWriter fw = new FileWriter("/Users/Lynn/Desktop/text2.txt",true);

		fw.write('\r'); fw.write('\n');  //寫入換行字元(寫入單一字元兩次)
		fw.write(str1);
		
		fw.close(); //關檔
	}
}
