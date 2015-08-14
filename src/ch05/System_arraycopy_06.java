package ch05;

import java.lang.*;
import java.util.Arrays;

public class System_arraycopy_06 {

	public static void main(String[] args) {

		char []  ary1= { 'T', 'h', 'e', 'J', 'a', 'v','a','2' };
		char []  ary2= { 'H', 'e', 'l', 'l', 'o',' ','T','i','m','e','!' };

		System.arraycopy(ary1,3,ary2,6,4);
		
		for(int i=0;i<ary2.length;i++)
		System.out.print(ary2[i]);
		

	}
}