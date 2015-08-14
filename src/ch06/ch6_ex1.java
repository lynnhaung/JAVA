package ch06;
import java.lang.*;


public class ch6_ex1{
	
	public static void main(String[] args)
	{
		
		String myString ; 
		myString = copyStr(3,"Java");
		System.out.print(myString);
		
	}
	
	public static String copyStr(int n ,String str1)
	{
		String str ="";
		for(int i=0;i<n;i++)
		{
			str+=str1;
			
		}
		return str;	
		
	}
}