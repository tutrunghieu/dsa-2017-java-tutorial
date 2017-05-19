package dsa2017.day4.simple_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class to_test_insertion_sort {

	public static void main(String[] args)
	{
		List<Integer> L = new ArrayList<Integer>(
				Arrays.asList(11, 9, 5, 23)); 

		System.out.println("before: " + L);
		insertionSort(L);
		//System.out.println("after: " + L);
	}

	private static void insertionSort(List<Integer> x) 
	{
		for(int h=1; h<x.size(); h++)
		{
			Integer t = x.get(h);
			int j=h; 
			for(; j>0 && x.get(j-1)>t; j--) x.set(j, x.get(j-1));
			x.set(j, t);
			System.out.println("step " + h + ":" + x);
		}		
	}


}
