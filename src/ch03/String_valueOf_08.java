package ch03;
import java.lang.*;
import java.util.Scanner;

public class String_valueOf_08 {

	public static void main(String[] args) {

		short a ='a';
		int b =200;
		int c =a+b;
		float d =3.5f;
		double e =4.8d;
		double f =d*e;
		String str1,str2;
		
		//str1 =String.valueOf(a+b)+String.valueOf(a)+String.valueOf(b);
		str2=String.valueOf(f);
		//str2=String.valueOf(e)+String.valueOf(e);
		
		//System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		
//		double a=2,b=6,c=4,d=2,e=3;
//		double x=(b*b-4*a*c)/(d+(3/(2*e)));
//		
//		System.out.println(x);
	}
}