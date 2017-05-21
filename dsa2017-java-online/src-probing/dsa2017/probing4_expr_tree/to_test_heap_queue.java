package dsa2017.probing4_expr_tree;

public class to_test_heap_queue {

	public static void main(String[] args) throws Exception
	{
		HeapQueue q = new HeapQueue(32+1);
		q.add(1);
		q.add(10);
		q.add(6);
		q.add(8);
		q.add(3);
		
		System.out.println( q.remove() );
		System.out.println( q.remove() );
		System.out.println( q.remove() );
		System.out.println( q.remove() );
		System.out.println( q.remove() );
		System.out.println( q.remove() );

	}

}
