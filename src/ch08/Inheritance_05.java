package ch08;
import java.lang.*;

public class Inheritance_05
{
	public static void main(String [] args)
	{
		CC4 objC1 = new CC4();
		CC4 objC2 = new CC4(10);
		CC4 objC3 = new CC4(3,5);
		objC1.show();
		objC2.show();
		objC3.show();
	}
}

class CA4
{
	protected int varA;
	public CA4(){varA = 1;}
	public CA4(int i){varA = i;}

}

class CB4 extends CA4
{
	protected int varB;
	public CB4(){varB = 1;}
	public CB4(int i)
	{
		super(i);
		varB=i;
	}

}

class CC4 extends CB4
{
	protected int varC;
	public CC4() {varC=1 ;}
	public CC4(int i) {varC=i ;}
	public CC4(int i,int j) 
	{
		super(i*j);
		varC = i*j;
	}
	
	public void show()
	{
		
		System.out.print("VarA="+varA+"\t");
		System.out.print("VarB="+varB+"\t");
		System.out.println("VarC="+varC);
	}
}