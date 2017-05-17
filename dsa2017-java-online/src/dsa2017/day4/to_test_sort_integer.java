package dsa2017.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class to_test_sort_integer {

	public static void main(String[] args) 
	{
		List<Integer> L = new ArrayList<Integer>(); 
		L.add(10);
		L.add(7);
		L.add(3);
		L.add(8);
		L.add(2);
		
//		Collections.sort(L);
		Collections.sort(L, (x, y) -> (y - x));
		System.out.println(L);
	}

}
