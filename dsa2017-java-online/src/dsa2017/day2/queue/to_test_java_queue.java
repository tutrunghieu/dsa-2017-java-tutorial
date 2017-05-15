package dsa2017.day2.queue;

import java.util.LinkedList;
import java.util.Queue;

public class to_test_java_queue {

	public static void main(String[] args)
	{
		Queue<String> q = new LinkedList<String>();
		q.add("Anh");
		q.add("Binh");
		q.add("Cuong");
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}

}
