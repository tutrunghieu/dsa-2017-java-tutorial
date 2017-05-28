package dsa2017.probing7_countsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class to_test_countsort_msd {

	public static void main(String[] args) 
	{
		List<String> a = Arrays.asList("BEG", "ABC", "DCA", "CDB", "ADC", "BCD", "BEF");
		
		a = radixSortMsd(a, 0, 3); 
		
		System.out.println("====== after");
		System.out.println(a);
	}

	private static List<String> radixSortMsd(List<String> a, int d, int nd) 
	{
		Map<Character, List<String>> G = new TreeMap<Character, List<String>>();
		
		for(String ak: a)
		{
			char j = ak.charAt(d);
			put(G, j, ak);
		}
		
		System.out.println("====== " + d);
		for(Character nk: G.keySet()) 
		{
			System.out.println("d="+d+" key="+nk+" sub=" + G.get(nk));
		}
		
		List<String> res = new ArrayList<String>();
		
		for(Character nk: G.keySet()) 
		{
			List<String> gk = G.get(nk);
			if(d+1<nd && gk.size() > 1) gk = radixSortMsd(gk, d+1, nd);
			//System.out.println("adding " + nk + ": " + gk);
			
			res.addAll( G.get(nk) );			
		}
		
		return res;
	}

	private static void put(Map<Character, List<String>> g, Character nk, String xk) 
	{
		List<String> gk = g.get(nk);
		if(gk == null) g.put(nk, gk = new ArrayList<String>());
		gk.add(xk);
	}

}
