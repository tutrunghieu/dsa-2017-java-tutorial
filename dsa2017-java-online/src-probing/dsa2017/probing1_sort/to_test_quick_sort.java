package dsa2017.probing1_sort;

import java.util.Arrays;

public class to_test_quick_sort {

	public static void main(String[] args) 
	{
		String[] a = {
				"Anh", "Nam", "Binh", "Duc", "Cuong", "Hai", "Tuan", "Mai", 
				"Duc2", "Cuong2"				
		};
		
		quickSort(a);
		System.out.println("final: " + Arrays.asList(a));
	}

	public static void quickSort(String[] a) 
	{
		quickSort(a, 0, a.length);
	}

	private static void quickSort(String[] a, int left, int right) 
	{
		if(left+1>=right) return;
		
		int mid = partition(a, left, right);
		System.out.println("part "+left+"->"+(right-1)+": " +
		Arrays.asList(Arrays.copyOfRange(a, left, right)) );
		
		quickSort(a, left, mid);
		quickSort(a, mid+1, right);		
	}

	private static int partition(String[] a, int left, int right) 
	{
		 String pivot = a[right-1];
	
		 int i=left-1;
		 
		 for(int j=left; j<right-1; j++) 
		 if(a[j].compareTo(pivot) <= 0) 
		 {
			 i++;
			 SortUtils.swap(a, i, j);
		 }
		 
		SortUtils.swap(a, i+1, right-1);
	    return i + 1;
	}

	

}
