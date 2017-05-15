package dsa2017.day3;

public class to_test_inner_calls2 {

	public static void main(String[] args) 
	{
		inner(3);
	}

	private static void inner(int n) 
	{
		if(n==0) 
			System.out.println("over");
		else {
			System.out.println("before " + n);
			inner(n-1);
			System.out.println("after " + n);
		}
	}

}
