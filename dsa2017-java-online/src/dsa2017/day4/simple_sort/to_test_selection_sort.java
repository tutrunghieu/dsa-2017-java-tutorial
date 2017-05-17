package dsa2017.day4.simple_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class to_test_selection_sort {

	public static void main(String[] args)
	{
		List<Integer> L = new ArrayList<Integer>(
				Arrays.asList(10, 7, 3, 8, 2, 4, 6, 9, 1, 5)); 

		System.out.println("before: " + L);
		selectionSort(L);
		//System.out.println("after: " + L);
	}

	private static void selectionSort(List<Integer> L) 
	{
		for(int h=0; h<L.size(); h++) 
		{
			int m = maxIndex(L, h);
			System.out.println("L("+m+")=" + L.get(m));
			
			if(m != h) swap(L, h, m);
			System.out.println(L);
		}
	}

	private static int maxIndex(List<Integer> L, int h) 
	{
		int m = h;
		
		for(int j=h; j<L.size(); j++)
		{
			if(L.get(m) > L.get(j)) m = j;
		}
		
		return m;
	}

	private static void swap(List<Integer> L, int x, int y) 
	{
		Integer t=L.get(x);
		L.set(x, L.get(y));
		L.set(y, t);
	}

}
