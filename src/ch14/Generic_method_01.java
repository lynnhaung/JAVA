package ch14;

public class Generic_method_01 {

	public static void main(String [] args)
	{
		CMyclass obj1 = new CMyclass();
		System.out.println("最後一個為"+obj1.last(2.7D,3.3D));
		System.out.println("最後一個為"+obj1.last(2,3,7));
		System.out.println("最後一個為"+obj1.last("Good","morning","sir"));
	}
}

class CMyclass
{
	public <M> M last(M a,M b)
	{
		return b;
	}
	public <N> N last(N a,N b,N c)
	{
		return c; 
	}
}