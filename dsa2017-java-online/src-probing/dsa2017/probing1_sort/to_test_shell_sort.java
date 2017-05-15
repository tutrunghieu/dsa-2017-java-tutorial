package dsa2017.probing1_sort;

import java.util.Arrays;

public class to_test_shell_sort {

	public static void main(String[] args) 
	{
		String[] a = {
				"Anh", "Nam", "Binh", "Duc", "Cuong", "Hai", "Tuan", "Mai", 
				"Duc2", "Cuong2", "Lam"				
		};
		
		shellSort(a);
		System.out.println("final: " + Arrays.asList(a));
	}

	private static void shellSort(String[] a) 
	{
		int[] steps = { 5, 3, 1 };
		
		for(int h: steps)
		for(int i=h; i<a.length; i++)
		{
			String t = a[i];
			int j = i-h;
			for(; j>=0 && a[j].compareTo(t) > 0; j -= h) a[j+h] = a[j];		
			a[j+h] = t;
		}
		
		return;
	}
	
}
