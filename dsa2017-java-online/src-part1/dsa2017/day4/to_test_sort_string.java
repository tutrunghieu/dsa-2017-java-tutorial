package dsa2017.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class to_test_sort_string {

	public static void main(String[] args) 
	{
		List<String> L = new ArrayList<String>(); 
		L.add("a");
		L.add("bac");
		L.add("an");
		L.add("2");
		L.add("20");
		L.add("ba");
		L.add("100");
		L.add("200");
		L.add("bang");
		L.add("anh");
		L.add("1");
		L.add("10");
		L.add("aa");
		L.add("An");
		L.add("Ba");
		L.add("A");
		L.add("AN");
		
		System.out.println("before: " + L);
//		Collections.sort(L);
		Collections.sort(L, (x, y) -> x.compareTo(y));
		System.out.println("after: " + L);
	}

}
