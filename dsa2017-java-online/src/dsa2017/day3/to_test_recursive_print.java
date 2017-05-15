package dsa2017.day3;

public class to_test_recursive_print {

	public static void main(String[] args) 
	{
		F(100);

	}

	private static void F(int n) 
	{
		if(n==0) System.out.println("Hết");
		else { System.out.println(n); F(n-1); }
	}

}
