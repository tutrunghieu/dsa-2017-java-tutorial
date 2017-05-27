package dsa2017.day1.part3_single;

public class MyListNode<E> 
{
	public MyListNode(E x) 
	{
		infor = x;
	}
	public E infor;
	public MyListNode<E> next;
	public MyListNode<E> next() {
		return next;
	}
}
