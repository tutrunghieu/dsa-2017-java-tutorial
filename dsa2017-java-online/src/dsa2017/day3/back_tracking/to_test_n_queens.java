package dsa2017.day3.back_tracking;

public class to_test_n_queens {

	public static void main(String[] args) 
	{
		Chessboard b = new Chessboard(4);
//		b.put(0, 0);
//		b.put(1, 1);
//		b.put(2, 2);
//		b.put(3, 3);
//		b.put(0, 3);
		
		place(b, 0);
	}

	private static int counter = 0;
	private static boolean place(Chessboard b, int n)
	{
		if(n >= 2) 
		{
			System.out.println("==== solution " + counter++);
			b.dump();
			return true;
		}
		
		for(int r=0; r<b.size(); r++)
		{
			b.put(r, n);
			System.out.println("==== put " + n);
			b.dump();
				
			place(b, n+1);
			b.clear(r, n);
		}
		
		return false;
	}
}
