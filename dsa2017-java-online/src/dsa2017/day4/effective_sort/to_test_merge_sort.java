package dsa2017.day4.effective_sort;

import java.util.Arrays;

import dsa2017.probing1_sort.SortUtils;

public class to_test_merge_sort 
{

	public static void main(String[] args) 
	{
		String[] a = {
				"Nam", "Anh", "Binh", "Duc", 
				"Cuong", "Hai", 
//				"Tuan", "Mai", 
//				"Duc2", "Cuong2", "Lam"				
		};
		
		System.out.println("before: " + Arrays.asList(a));
		a = mergeSort(a, 0, a.length);
		System.out.println("after: " + Arrays.asList(a));
	}

	public static String[] mergeSort(
			String[] a, int left, int right) 
	{
		if(right-left > 2) 
		{
			int mid = (left+right+1)/2;
			String[] a1 = mergeSort(a, left, mid);
			String[] a2 = mergeSort(a, mid, right);	
			
			String[] t = merge(a1, a2);
			System.out.println("a1: " + Arrays.asList(a1));
			System.out.println("a2: " + Arrays.asList(a2));
			System.out.println("ghep 12: " + Arrays.asList(t));
			
			return t;
		}
		
		else 
		{
			a = Arrays.copyOfRange(a, left, right);
			if(a.length==2 && a[0].compareTo(a[1]) > 0)
				SortUtils.swap(a, 0, 1);
			return a;
		}
				
	}

	private static String[] merge(String[] a1, String[] a2) 
	{
		int left = 0, left1 = 0, left2 = 0, right1 = a1.length, right2 = a2.length;
		String[] a = new String[right1 + right2];
		
		for(; left1<right1 && left2<right2; )
		{
			if(a1[left1].compareTo(a2[left2]) <= 0) 
				a[left++] = a1[left1++];
			else 
				a[left++] = a2[left2++];
		}
		
		for(; left1<right1; ) a[left++] = a1[left1++];
		for(; left2<right2; ) a[left++] = a2[left2++];
		
		return a;
	}

	

}
