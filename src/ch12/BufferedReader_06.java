package ch12;
import java.lang.*;
import java.io.*;

public class BufferedReader_06 {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		String str1;
		FileReader fr = new FileReader("/Users/Lynn/Desktop/text1.txt");
		BufferedReader bufferIn = new BufferedReader(fr);
		
		while((str1=bufferIn.readLine()) != null)
		{
			System.out.println(str1);
		}
		fr.close(); //關檔
	}
}
