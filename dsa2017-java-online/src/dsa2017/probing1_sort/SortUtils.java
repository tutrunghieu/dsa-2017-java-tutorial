package dsa2017.probing1_sort;

public class SortUtils 
{
	public static<T1> void swap(T1[] a, int x, int y) 
	{
		T1 t = a[x];
		a[x] = a[y];
		a[y] = t;
	}

}
