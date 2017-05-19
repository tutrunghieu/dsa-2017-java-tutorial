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
		List<String> a = new ArrayList<String>(Arrays.asList(
				  "123", "134", "357", 
				  "436", "840", "368"));
		
		radixSort(a);
	}

	private static void radixSort(List<String> a)
	{
		a = step(a, 2); 
		System.out.println("step 0: " + a);
		
		a = step(a, 1);
		System.out.println("step 1: " + a);
		
		a = step(a, 0);
		System.out.println("step 2: " + a);
	}

	private static List<String> step(List<String> a, int d) 
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
		return collect(m);
	}

	private static List<String> collect(Map<Character, List<String>> m) 
	{
		List<String> res = new ArrayList<String>();
		for(Character t: m.keySet()) res.addAll(m.get(t));
		return res;
	}

}
