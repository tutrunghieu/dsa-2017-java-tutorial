package dsa2017.day3.back_tracking;

public class LocationSet 
{
	private int counter;
	private boolean[] dim_r;
	private boolean[] dim_c;
	private boolean[] dim_p;
	private boolean[] dim_m;

	public LocationSet(int n) 
	{
		counter = n;
		
		dim_r = new boolean[n];
		dim_c = new boolean[n];
		dim_p = new boolean[2*n];
		dim_m = new boolean[2*n];
	}
	
	public LocationSet(int[] conf) 
	{
		int n = conf.length;
		counter = n;
		
		dim_r = new boolean[n];
		dim_c = new boolean[n];
		dim_p = new boolean[2*n];
		dim_m = new boolean[2*n];
		
		for(int c=0; c<conf.length; c++) 
		{
			int r = conf[c];
			if(r >= 0) place(r, c);
		}
	}

	public int size() 
	{
		return counter;
	}


	public void place(int r, int c) 
	{
		dim_r[r] = true;
		dim_c[c] = true;
		dim_p[r+c] = true;
		dim_m[r-c+counter] = true;
	}

	public void clear(int r, int c) 
	{
		dim_r[r] = false;
		dim_c[c] = false;
		dim_p[r+c] = false;
		dim_m[r-c+counter] = false;
	}
	

	public boolean avail(int r, int c) 
	{
		return !dim_r[r] && !dim_c[c]
				&& !dim_p[r+c] && !dim_m[r-c+counter];
	}

	public void dump() 
	{
		int n = counter;
		for(int r=0; r<n; r++)
		{
			for(int c=0; c<n; c++) System.out.print(avail(r, c) ? "." : "x");
			System.out.println("");			
		}
	}



}
