package ch14;

public class Generic_class_02 {

		public static void main(String[] args)
		{
			CMyclass1<String> obj1 = new CMyclass1<String>();
			CMyclass1<Integer> obj2 = new CMyclass1<Integer>();
			System.out.println("第一個為"+obj1.first("Hello","World"));
			System.out.println("最後一個為"+obj1.last("Hello","World"));
			System.out.println("第一個為"+obj2.first(7,5));
			System.out.println("最後一個為"+obj2.last(7,5));
		}
}

class CMyclass1<N>
{
	public N first(N a, N b)
	{
		return a;
	}
	public N last(N a,N b)
	{
		return b;
	}
}