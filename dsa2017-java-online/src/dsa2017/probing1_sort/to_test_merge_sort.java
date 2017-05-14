package dsa2017.probing1_sort;

import java.util.Arrays;

public class to_test_merge_sort {

	public static void main(String[] args) 
	{
		String[] a = {
				"Anh", "Nam", "Binh", "Duc", "Cuong", "Hai", "Tuan", "Mai", 
				"Duc2", "Cuong2"				
		};
		
		mergeSort(a);
		System.out.println("final: " + Arrays.asList(a));
	}

	public static void mergeSort(String[] a) 
	{
		mergeSort(a, 0, a.length);
	}

	private static String[] mergeSort(String[] a, int left, int right) 
	{
		if(left >= right) return a;
		
		int mid = (left+right)/2;
		String[] a1 = mergeSort(a, left, mid);
		String[] a2 = mergeSort(a, mid+1, right);	
		
		return merge(a, left, right, left, mid, mid+1, right);
	}

	private static String[] merge(String[] a, int left, int right, 
			int left1, int right1, int left2, int right2) 
	{
//		int left = 0, left1 = 0, left2 = 0, right1 = a1.length, right2 = a2.length;
//		String[] a = new String[right1 + right2];
		String[] a1 = a, a2 = a;
		
		for(; left1<right1 && left2<right2; )
		{
			if(a1[left1].compareTo(a2[left2]) <= 0) a[left++] = a1[left1++];
			else a[left++] = a2[left2++];
		}
		
		for(; left1<right1; ) a[left++] = a1[left1++];
		for(; left2<right2; ) a[left++] = a2[left2++];
		
		return a;
	}

	

}
