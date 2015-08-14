package ch05;
import java.lang.*;
public class BubbleSort {
	public static void main(String[]arg){
		System.out.println("本期樂透開獎為:");
		int bubble[]=new int[6];
		int value;
		int time=0,temp;
		int i=0;
		int number=0;
		/*
		for(i=0;i<6;i++){
			value=(int)(Math.random()*42+1); //1~42
			bubble[i]=value;
			System.out.print(bubble[i] + "\t");
		}*/
		boolean b;
		for(i=0;i<6;i++)
		{
			b = true;
			while(b) 
			{
				b = false;
				number = (int)(Math.random()*42+1);
				for(int j=0;j<6;j++) {
					if(bubble[j]==number) {
						b = true;
					}
				}
			}
			
			bubble[i] = number;
			System.out.print(bubble[i] + "\t");
		}
		
		while(time<6){
		for(int j=0;j<5;j++){
			if(bubble[j]>bubble[j+1]){
				temp=bubble[j];
				bubble[j]=bubble[j+1];
				bubble[j+1]=temp;	
			}					
		}
		time++;
		}
		System.out.println("");
		System.out.println("bubble sort後的排序為:");
		for(i=0;i<6;i++){
			System.out.print(bubble[i] + "\t");
		}
		
	}
}