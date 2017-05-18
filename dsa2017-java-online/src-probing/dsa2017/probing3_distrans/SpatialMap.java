package dsa2017.probing3_distrans;

public class SpatialMap<T> 
{
	public static<T1> SpatialMap<T1> fromArray(T1[][] arr) 
	{
		SpatialMap<T1> m = new SpatialMap<T1>();
		
		int r = 0;
		for(T1[] aj : arr)
		{
			int c=0;
			for(T1 ajk: aj) m.put(r, c++, ajk);
			r++;
		}
		
		return m;
	}

	public T get(int r, int c) 
	{
		return null;
	}
	
	public void put(int r, int c, T v) 
	{
	}

	public void dump() 
	{
		
	}

}
