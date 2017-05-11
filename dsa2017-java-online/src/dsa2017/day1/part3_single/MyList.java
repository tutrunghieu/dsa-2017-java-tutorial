package dsa2017.day1.part3_single;

public class MyList<E> 
{
	protected MyListNode<E> head;
	protected MyListNode<E> tail;

	public MyList()
	{
		head = tail = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	public void add(E x)
	{
		MyListNode<E> q = new MyListNode<E>(x);
		
		if(head == null) {
			head = tail = q;
		}
		else {
			tail.next = q;
			tail = q;
		}
	}

	public MyListNode<E> first()
	{
		return head;
	}

	public void dump() 
	{
		for(MyListNode<E> 
		h = head;
				h != null; h = h.next())
		{
			System.out.println(h.infor);			
		}		
	}
	
}
