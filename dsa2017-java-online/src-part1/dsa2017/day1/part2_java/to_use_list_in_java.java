package dsa2017.day1.part2_java;

import java.util.ArrayList;
import java.util.List;

public class to_use_list_in_java {

	public static void main(String[] args) 
	{
		List<Integer> L 
		  = new ArrayList<>();
		L.add(1);
		L.add(2);
		
		List<String> items 
		  = new ArrayList<String>();
		
		items.add("Anh");
		items.add("Bình");		
		items.add("Anh");		
		items.add("Cường");		
		
		for(String ik: items)
			System.out.println(ik);
		
		for(int k=0; k<items.size(); k++)
		{
			System.out.println(k + ": " + items.get(k));
		}
	}

}
