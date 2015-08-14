package ch11;
import java.lang.*;

public class Wrapper_autoboxing_10 {

	public static void main(String[] args)
	{
		Double myDouble = 5.0;  //自動裝箱
		double D1 = myDouble;   //自動拆箱
		//int I1 = myDouble;    //自動拆箱失敗
		int I1 = myDouble.intValue();  //拆箱
		System.out.println("D1=" +D1);
		System.out.println("I1=" +I1);
	}
}
