package dsa2017.day2.queue;

public class to_test_queue_over_linklist {

	public static void main(String[] args) throws Exception
	{
		MyQueue2<String> q = new MyQueue2<String>();
		q.add("Anh"); 
		q.add("Binh");
		q.add("Cuong");
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}

}
