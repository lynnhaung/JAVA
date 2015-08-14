package ch12;
import java.lang.*;
import java.io.*;

public class Buffered_IO_Stream_09 {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileInputStream fi = new FileInputStream("/Users/Lynn/Desktop/text1.txt");
		FileOutputStream fo = new FileOutputStream("/Users/Lynn/Desktop/text5.txt");
		BufferedInputStream bufIn = new BufferedInputStream(fi);
		BufferedOutputStream bufOut = new BufferedOutputStream(fo);
		int fileSize = fi.available();
		byte byteData[] = new byte[fileSize];
		bufIn.read(byteData,0,fileSize);
		bufOut.write(byteData,0,fileSize);
		String str1 = new String(byteData);  //轉換位元組陣列為字串
		bufOut.flush();  //記得要flush,否則串流內資料不會寫入檔案中
		System.out.println("檔案複製完畢,內容如下");
		System.out.println(str1);
		fi.close(); 	//關檔
		fo.close();     //關檔
	}
}
