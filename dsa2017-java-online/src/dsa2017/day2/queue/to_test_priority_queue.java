package dsa2017.day2.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class to_test_priority_queue {

	public static void main(String[] args) 
	{
		Queue<String> q = new PriorityQueue<String>(
				10, Collections.reverseOrder());
		
		q.add("Anh");
		q.add("Lam");
		q.add("Tuan");
		q.add("Nam");

		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}

}
