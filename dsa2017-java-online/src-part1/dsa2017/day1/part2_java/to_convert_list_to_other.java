package dsa2017.day1.part2_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class to_convert_list_to_other {

	public static void main(String[] args) 
	{
		List<String> items 
		  = new ArrayList<String>();
		
		items.add("Anh");
		items.add("Bình");		
		items.add("Anh");		
		items.add("Cường");		
		
		//convert list into set
		Set<String> s = new TreeSet(items);
		System.out.println(s);
		
		//convert list into set
		String[] a = items.toArray(new String[] {});
		for(int k=0; k<a.length; k++)
			System.out.println(a[k]);
	}

}
