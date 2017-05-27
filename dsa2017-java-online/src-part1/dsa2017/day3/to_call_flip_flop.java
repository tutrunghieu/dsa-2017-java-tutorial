package dsa2017.day3;

public class to_call_flip_flop {

	public static void main(String[] args) 
	{
		flip(3);
	}

	private static void flip(int n) 
	{
		if(n<=0) return;
		System.out.println("flip " + n);
		flop(n);
	}
	private static void flop(int n) 
	{
		if(n<=0) return;
		System.out.println("flop " +n);
		flip(n-1);
	}

}
