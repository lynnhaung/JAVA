package ch11;
import java.lang.*;

public class Wrapper_class_09 {

	public static void main(String args[])
	{
		Long myLongInt = new Long("5");  //裝箱
		Long L1 = myLongInt.longValue();  //拆箱
		int I1 = myLongInt.intValue();  //拆箱
		
		//CRect obj = new CRect(L1,I1);
		CRect obj = new CRect(I1,I1);
		obj.showArea();
		
	}
}
 
class CRect
{
	protected int area;
	protected int len,width;
	public CRect(int i,int j){len = i; width = j;}
	
	public void showArea()
	{
		area = len*width;
		System.out.println("Area="+area);
	}
}