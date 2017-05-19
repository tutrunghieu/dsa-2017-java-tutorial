package dsa2017.day4.effective_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class to_test_radix_sort {

	public static void main(String[] args) 
	{
		List<String> a 
		  = new ArrayList<String>(Arrays.asList(
				  "a2b", "a1b", "bc2", 
				  "bc1", "de1", "df2"));
		
		radixSort(a);
	}

	private static void radixSort(List<String> a)
	{
		Map<Character, List<String>> m = stepFirst(a, 0);
		m = stepFollow(m, 1);
		m = stepFollow(m, 2);		
	}

	private static Map<Character, List<String>> stepFirst(List<String> a, int d) 
	{
		Map<Character, List<String>> m = new TreeMap<>();
		
		for(String ak: a) 
		{
			char c0 = ak.charAt(d);
			List<String> l0 = m.get(c0);
			
			if(l0==null) 
				m.put(c0, l0 = new ArrayList<String>());
						
			l0.add(ak);
		}
		
		System.out.println(m);		
		return m;
	}

	private static Map<Character, List<String>> stepFollow(Map<Character, List<String>> m1, int d) 
	{
		Map<Character, List<String>> m = new LinkedHashMap<>();
		
		for(Character t: m1.keySet()) 
		for(String ak: m1.get(t)) 
		{
			char c0 = ak.charAt(d);
			List<String> l0 = m.get(c0);
			
			if(l0==null) 
				m.put(c0, l0 = new ArrayList<String>());
						
			l0.add(ak);
		}
		
		System.out.println(m);
		return m;
	}

}
