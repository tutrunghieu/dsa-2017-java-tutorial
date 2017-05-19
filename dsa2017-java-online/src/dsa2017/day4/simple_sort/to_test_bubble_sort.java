package dsa2017.day4.simple_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class to_test_bubble_sort {

	public static void main(String[] args)
	{
		List<Integer> L = new ArrayList<Integer>(
				Arrays.asList(23, 9, 25, 11, 2)); 

		System.out.println("before: " + L);
		bubbleSort(L);
		//System.out.println("after: " + L);
	}

	private static void bubbleSort(List<Integer> x) 
	{
		for(int h=x.size(); h>=2; h--)
		{
			for(int j=0; j<h-1; j++)
				if(x.get(j) > x.get(j+1)) {
					swap(x, j, j+1);
//					System.out.println("step " + h + "/" + j + ":" + x);
				}
			System.out.println("step " + h + ":" + x);
		}		
	}

	private static void swap(
			List<Integer> x, int a, int b) 
	{
		Integer t = x.get(a);
		x.set(a, x.get(b));
		x.set(b, t);		
	}


}
