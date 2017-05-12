package dsa2017.day2.stack_on_array;

public class MyStack<T> 
{
	protected Object[] arr;
	protected int head = -1;
	
	public MyStack() {
		arr = new Object[10];
	}
	
	public boolean isEmpty()
	{
		return head < 0;
	}

	public void push(T x) throws Exception
	{
		if(head>=10) throw new StackOverlowException();
		arr[++head] = x;		
	}
	
	@SuppressWarnings("unchecked")
	public T pop() throws Exception
	{
		if(head<0) throw new StackEmptyException();
		return (T)arr[head--];		
	}

}
