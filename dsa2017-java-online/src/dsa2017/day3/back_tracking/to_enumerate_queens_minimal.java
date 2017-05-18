package dsa2017.day3.back_tracking;

public class to_enumerate_queens_minimal 
{
	public static void main(String[] args) 
	{
		enumerateAll(4);
	}
	
	private static LocationSet board;
	
	private static void enumerateAll(int n) 
	{
		int[] conf = new int[n]; 
		for(int k=0; k<n; k++) conf[k] = -1;
		
		board = new LocationSet(n);
		enumerateAtCol(0, conf);		
	}

	private static void enumerateAtCol(int c, int[] conf) 
	{
		for(int r=0; r<board.size(); r++)
		if(board.avail(r, c))
		{
			// System.out.println("Putting " + c + " at row " + r);
			conf[c] = r;
			board.place(r, c);
			
			if(c+1==conf.length) print(conf);
			else enumerateAtCol(c+1, conf);
			
			conf[c] = -1;
			board.clear(r, c);
		}
		
		return;
	}

	private static int solutionCounter = 1;
	
	private static void print(int[] conf) 
	{
		System.out.println("==== solution " + solutionCounter++);
		
		for(int r=0; r<conf.length; r++)
		{
			for(int c=0; c<conf.length; c++)
			{
				System.out.print(conf[c]==r ? "Q" : "|");						
			}			
			System.out.println();
		}
		
		return;
	}

}
