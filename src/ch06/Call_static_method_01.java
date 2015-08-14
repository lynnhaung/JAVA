package ch06;
import java.lang.*;
import java.lang.Math;

public class Call_static_method_01{
	
	public static void main(String[] args)
	{
		double i=7.0,j=4.0;
		double powNum,longNum;
		
		powNum = Math.pow(i,j);
		System.out.println(i+"的"+j+"次方="+powNum);
		longNum =Math.log10(powNum);
		System.out.println(powNum+"取10的對數 ＝"+longNum);
	}
}