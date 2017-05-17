package dsa2017.day4.sorted_structures;

import java.util.Map;
import java.util.TreeMap;

public class test_TreeMap {

	public static void main(String[] args)
	{
		Map<String, Integer> m
		= new TreeMap<String, Integer>();
		
		m.put("Anh", 10);
		m.put("Cuong", 3);
		m.put("Dung", 7);
		m.put("An", 5);

		System.out.println(m);
	}

}
