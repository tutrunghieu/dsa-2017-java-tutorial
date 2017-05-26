package dsa2017.day5.heap;

import dsa2017.day2.queue.QueueEmptyException;
import dsa2017.day2.queue.QueueFullException;

public class HeapQueue {

	private int[] data;
	private int count;

	public HeapQueue(int n) 
	{
		data = new int[n];
		count = 0;
	}

	public void add(int x) throws Exception
	{
		if(count == data.length) throw new QueueFullException();
		data[count++] = x;
		
		int c=count-1;
		
		while(c>0) 
		{
			int lr = ( (c%2)==0 ? 2 : 1);
			int p =(c - lr)/2;
			if(data[p] < data[c])
			    { swap(data, p, c); c = p; }
			else break;
		}
		
		//print(data, 0, count);
		return;
	}


	public int remove() throws Exception
	{
		if(count == 0) throw new QueueEmptyException();
		int res = data[0]; count--;
		
		data[0] = data[count];
		for(int p=0; p<count; ) {
			int c = p;
			int c1 = 2*p + 1;
			if(c1 < count && data[c] < data[c1]) c = c1; 
			int c2 = 2*p + 2;
			if(c2 < count && data[c] < data[c2]) c = c2; 
			
			if(c != p ) { swap(data, p, c); p = c; }
			else break;
		}
		
		return res;
	}
	
	private void print(int[] a, int f, int t) 
	{
		for(int k=f; k<t; k++) System.out.print(a[k] + " ");
		System.out.println();
	}

	private void swap(int[] a, int x1, int x2) 
	{
		int t = a[x1];
		a[x1] = a[x2];
		a[x2] = t;		
	}

	public boolean empty()
	{
		return count==0;
	}
	
}
