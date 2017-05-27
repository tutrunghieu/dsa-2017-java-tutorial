package dsa2017.day3.dynamic_prog;

public class test_fibo_without_dp {

	public static void main(String[] args) 
	{
		fibo(10);
	}

	private static long fibo(long n) 
	{
		System.out.println("computing " + n);
		if(n<2) return n;
		else return fibo(n-1) + fibo(n-2);
	}

}
