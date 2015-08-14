package ch06;

import java.lang.*;

public class Final_array_18
{
	public static void main(String args[])
	{
		int OrgArr[] = new int[3];
		for(int i=0; i<OrgArr.length; i++)
			OrgArr[i]=i;
		func1(OrgArr);
		for(int i=0;i<OrgArr.length;i++)
			System.out.println("OrgArr["+i+"]="+OrgArr[i]);
	}
	
	public static void func1(final int[] arr1)
	{
		int arr2[] ={5,10,15};
		for(int i=0;i<arr2.length;i++)
			arr1[i]=arr1[i]*arr1[i];
		//arr1=arr2;
	}
}