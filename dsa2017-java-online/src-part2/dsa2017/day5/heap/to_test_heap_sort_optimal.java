package dsa2017.day5.heap;

import java.util.ArrayList;
import java.util.List;

public class to_test_heap_sort_optimal {

	public static void main(String[] args) throws Exception
	{
		int[] a = { 3, 7, 8, 9, 4, 11 };
		
		//create heap with top-down method
		HeapQueue h = new HeapQueue(a.length);
		for(int ak: a) {
			h.add(ak);
		}
		
		//remove element and add to new list
		List<Integer> s = new ArrayList<Integer>();
		while(!h.empty()) 
		{
			Integer sk = h.remove();
			s.add(0, sk);
		}
		
		System.out.println(s);
	}

}
