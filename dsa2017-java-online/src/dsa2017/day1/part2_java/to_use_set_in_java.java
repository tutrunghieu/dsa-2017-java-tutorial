package dsa2017.day1.part2_java;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class to_use_set_in_java {

	public static void main(String[] args) 
	{
		Set<String> items 
		  = new TreeSet<String>();
		
		items.add("Cường");		
		items.add("Anh");		
		items.add("Bình");		
		items.add("Anh");		
		
		for(String ik: items)
			System.out.println(ik);
	}

}
