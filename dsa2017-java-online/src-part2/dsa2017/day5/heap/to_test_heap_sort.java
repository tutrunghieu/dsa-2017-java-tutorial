package dsa2017.day5.heap;

import java.util.ArrayList;
import java.util.List;

public class to_test_heap_sort 
{
	public static void main(String[] args) throws Exception
	{
		int[] a = { 3, 7, 8, 9, 4, 11 };
		
		HeapQueue h = heapFromArray(a);
		for(int k=a.length-1; k>=1; k--)
		{
			int t = h.remove();
			a[k] = t;
		}
		
		print(a);
	}

	private static void print(int[] a) 
	{
		for(int k=0; k<a.length; k++)
		{
			System.out.print(a[k] + " ");
		}
		
		System.out.println();		
	}

	private static HeapQueue heapFromArray(int[] a) throws Exception
	{
		HeapQueue h = new HeapQueue(a.length);
		for(int ak: a) h.add(ak);
		return h;
	}

}
