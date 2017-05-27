package dsa2017.day3;

public class to_test_inner_calls {

	public static void main(String[] args) 
	{
		inner(3);
	}

	private static void inner(int n) 
	{
		System.out.println("before " + n);
		if(n==0) System.out.println("over");
		else inner(n-1);
		System.out.println("after " + n);
	}

}
