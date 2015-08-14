package ch03;
import java.lang.*;
import java.io.*;

public class BufferedReader_01
{

	public static void main(String args[])throws IOException
	{
		BufferedReader buf;
		String str1,str2;
		
		System.out.println("請輸入第一串字串");
		buf=new BufferedReader(new InputStreamReader(System.in));
		str1=buf.readLine();
		System.out.println("請輸入第二串字串");
		str2=buf.readLine();
		
		System.out.println("您所輸入的字串如下：");
		System.out.println(str1);
		System.out.println(str2);
	}
}
