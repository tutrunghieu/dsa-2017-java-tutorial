package dsa2017.day3.back_tracking;

public class to_enumerate_queens {

	public static void main(String[] args) 
	{
		enumerate(4);
	}
	
	private static void enumerate(int n) 
	{
		int[] conf = new int[n]; 
		for(int k=0; k<n; k++) conf[k] = -1;
		
		enumerate(0, conf);		
	}

	private static void enumerate(int c, int[] conf) 
	{
		LocationSet board = new LocationSet(conf);
		//set.dump();
		
		for(int r=0; r<board.size(); r++)
		if(board.avail(r, c))
		{
			// System.out.println("Putting " + c + " at row " + r);
			conf[c] = r;
			
			if(c+1==conf.length) print(conf);
			else enumerate(c+1, conf);
			
			conf[c] = -1;
		}
		
		return;
	}

	private static int s = 1;
	private static void print(int[] conf) 
	{
		System.out.println("==== solution " + s++);
		
		for(int c=0; c<conf.length; c++)
		{
			for(int r=0; r<conf.length; r++)
			{
				System.out.print(conf[c]==r ? "Q" : "|");						
			}			
			System.out.println();
		}
		
		return;
	}


}
