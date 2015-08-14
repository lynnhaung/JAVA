package ch05;

public class Array_Colne_05{
	
	public static void main(String[] args)
	{
		
		int score[][] ={{85,78,65},{75},{63,95},{94,92,88}};
		
		int ary[];
		
		ary =score[3].clone();
		
		for(int i=0;i<ary.length;i++)
		{
			System.out.print(ary[i]+"\t");
		}
	}
}