package dsa2017.day1.part4_double;

public class MyList2<E> 
{
	protected MyListNode2<E> head;
	protected MyListNode2<E> tail;
	private int counter = 0;

	public MyList2()
	{
		head = tail = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	public void add(E x)
	{
		MyListNode2<E> q = new MyListNode2<E>(x);
		
		if(head == null) {
			head = tail = q;
		}
		else {
			q.prev = tail;
			tail.next = q;
			tail = q;
		}
		
		counter++;
	}

	public MyListNode2<E> first()
	{
		return head;
	}

	public void dump() 
	{
		for(MyListNode2<E> 
		h = head;
				h != null; h = h.next)
		{
			System.out.println(h);			
		}		
	}
	
	public void removeByName(String s) 
	{
		for(MyListNode2<E> 
		h = head; h != null; h = h.next)
		{
			if(s.equals(h.infor)) 
			{ remove(h); break; }
		}						
	}
	
	public void removeByNameMany(String s) 
	{
		for(MyListNode2<E> 
		h = head; h != null; h = h.next)
		{
			if(s.equals(h.infor)) 
			{ remove(h);  }
		}						
	}
	
	public void remove(int n)
	{
		int k = 0;
		for(MyListNode2<E> 
		h = head; h != null; h = h.next)
		{
			if(k==n) { remove(h); break; }
			k++;
		}		
		
	}
		
	public void remove(MyListNode2<E> q)
	{
		MyListNode2<E> hq = q.prev;
		MyListNode2<E> tq = q.next;
		
		if(tq != null) tq.prev = hq;
		if(hq != null) hq.next = tq;
		
		if(q==head) head = tq;
		if(q==tail) tail = hq;
		
		counter--;
	}

	public int size() 
	{
		return counter;
	}

	
}
