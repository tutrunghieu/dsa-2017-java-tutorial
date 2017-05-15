package dsa2017.day2.queue;

public class to_test_queue_on_array {

	public static void main(String[] args) throws Exception
	{
		MyQueue<String> q = new MyQueue<String>(3);
		q.add("Anh");
		q.add("Binh");
		q.add("Cuong");
	//	q.add("Duc");

		System.out.println( q.remove() );
		System.out.println( q.remove() );
		System.out.println( q.remove() );
//		System.out.println( q.remove() );
		
		q.add("Duc");
		q.add("Hai");
		System.out.println( q.remove() );
		System.out.println( q.remove() );
		
	}

}
