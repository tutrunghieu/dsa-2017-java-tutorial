package dsa2017.day2.queue;

public class MyQueue2<T> {

	public MyQueueNode2<T> head;
	public MyQueueNode2<T> tail;
	public int counter = 0;
	
	public int size() {
		return counter;
	}
	
	public void add(T x) 
	{
		counter++;
		
		if(head==null) {
			head = tail = new MyQueueNode2<T>(x);
		}
		
		else {
			MyQueueNode2<T> q = new MyQueueNode2<T>(x);
			tail.next = q;
			tail = q;
		}
		
	}

	public T remove() throws Exception
	{
		if(head == null) throw new QueueEmptyException();
		MyQueueNode2<T> q = head;
		head = head.next;
		return q.infor;
	}

}
