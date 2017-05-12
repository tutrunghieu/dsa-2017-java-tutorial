package dsa2017.day1.part4_double;

public class MyListNode2<E> 
{
	@Override
	public String toString() {
		return "item#"+this.hashCode()+" [infor=" + infor
				+ ", next=" + code(next)
				+ ", prev=" + code(prev) + "]";
	}

	private int code(Object src) 
	{
		return src==null ? 0 : src.hashCode();
	}

	public E infor;
	public MyListNode2<E> next;
	public MyListNode2<E> prev;

	public MyListNode2(E x) 
	{
		infor = x;
	}
}
