package dsa2017.day3.back_tracking;

public class Chessboard 
{
	int[] rows;
	int[] cols;
	int[] diag1;
	int[] diag2;

	public Chessboard(int n) 
	{
		rows = new int[n];		
		cols = new int[n];		
		diag1 = new int[2*n];		
		diag2 = new int[2*n];		
	}

	public boolean put(int r, int c) 
	{
		if(rows[r] > 0 || cols[c] > 0) 
			return false;
		
		rows[r] = c + 1;
		cols[c] = r + 1;
		diag1[r+c] = 1;
		diag2[r-c+size()] = 1;
		
		return true;
	}
	
	public void clear(int r, int c) 
	{
		rows[r] = 0;
		cols[c] = 0;
		diag1[r+c] = 0;
		diag2[r-c+size()] = 0;		
	}
	

	public int size() 
	{
		return rows.length;
	}

	public boolean get(int r, int c) 
	{
		return rows[r]==c+1;
	}

	public void dump() 
	{
		
		for(int r=0; r<this.size(); r++)
		{
			for(int c=0; c<this.size(); c++)
			{
				boolean y = this.get(r, c);
				if(y) System.out.print('x');
				else  System.out.print('-');
			}
			
			System.out.println();
		}		
		
	}


}
