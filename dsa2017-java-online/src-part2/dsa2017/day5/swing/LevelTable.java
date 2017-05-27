package dsa2017.day5.swing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LevelTable<T> 
{
	protected Map<Integer, List<T>> levels = new TreeMap<Integer, List<T>>(); 
	protected Map<Integer, LevelMetag<T>> metags = new TreeMap<Integer, LevelMetag<T>>();
	protected Integer max; 

	public void add(int l, int loc, T p) 
	{
		List<T> g = levels.get(l);
		if(g==null) levels.put(l, g = new ArrayList<T>());
		g.add(p);		
		
		metags.put(p.hashCode(), new LevelMetag<T>(l, loc, p));
	}

	public void dump(PrintAction<T> lf) 
	{
		for(int k: levels.keySet())
		{
			System.out.println("=== level " + k);
			for(T ik: levels.get(k)) lf.invokeAction(ik);
		}
		
	}

	public LevelMetag<T> getMetag(T x) 
	{
		return metags.get(x.hashCode());
	}

	public Set<Integer> keySet() 
	{
		return levels.keySet();
	}

	public List<T> getLevelNodes(Integer lk)
	{
		return levels.get(lk);
	}

	public Integer maxLevel() 
	{
		if(max != null) return max;
		for(Integer sk: levels.keySet()) max = Math.max(max==null ? 0 : max, sk);
		return max;
	}

	public int maxWidth() 
	{
		return (int)Math.pow(2, maxLevel());
	}

}
