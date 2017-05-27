package dsa2017.day2.stack_on_linklist;

public class MyStack2<T> 
{
	protected MyStackNode2<T> head;
	protected int counter = 0;
	
	public boolean isEmpty()
	{
		return counter == 0;
	}

	public void push(T x) 
	{
		MyStackNode2<T> q = new MyStackNode2<T>();
		q.infor = x;
		q.prev = head;
		head = q;
		counter++;
	}
	
	public T pop() throws Exception
	{
		if(counter==0) throw new StackEmptyException();
		counter--;
		MyStackNode2<T> q = head;
		head = head.prev;
		return q.infor;		
	}

}
