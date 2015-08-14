package ch12;
import java.lang.*;
import java.io.*;

public class Writer_charSream_03 {

	public static void main(String[] args) throws IOException
	{
		String str1 = "費式數列如下：";
		char endCh[] = {'C','o','n','t','i','n','u','e','.','.','.'};
		int numF;
		FileWriter fw = new FileWriter("/Users/Lynn/Desktop/text2.txt");
		
		fw.write(str1);
		fw.write('\r'); fw.write('\n');  //寫入換行字元(寫入單一字元兩次)
		
		for(int i=1; i<10;i++)
		{
			numF = Fib(i);
			fw.write(numF+" ");   //int 與字串連結，會自動轉型為字串
		}
		fw.write(endCh);
		fw.close(); //關檔
	}
	public static int Fib(int n)
	{
		if((n==1)|(n==0))
			return n;
		else
			return Fib(n-1)+Fib(n-2);
	}
}
