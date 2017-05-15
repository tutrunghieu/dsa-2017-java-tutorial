package dsa2017.day2.queue;

public class MyQueue<T> 
{
	protected Object[] a;
	protected int head = 0;
	protected int tail = 0;
	protected int counter = 0;

	public MyQueue(int n) 
	{
		a = new Object[n];
	}
	
	public boolean isEmpty()
	{
		return head==tail;
	}

	public void add(T x) throws Exception
	{
		if(tail+a.length==head) throw new QueueFullException();
		int h = head++;
		counter++;
		a[h%a.length] = x;
	}

	@SuppressWarnings("unchecked")
	public T remove() throws Exception
	{
		if(isEmpty()) throw new QueueEmptyException();
		int t = tail++;
		counter--;
		return (T)a[t%a.length];
	}

}
