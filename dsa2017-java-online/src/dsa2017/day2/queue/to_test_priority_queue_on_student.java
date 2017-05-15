package dsa2017.day2.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class to_test_priority_queue_on_student {

	public static void main(String[] args) 
	{
		Queue<SinhVien> q = new PriorityQueue<SinhVien>(
				20, (x, y) -> (x.diem - y.diem));
		
		q.add(new SinhVien("Anh", 10));
		q.add(new SinhVien("Lam", 3));
		q.add(new SinhVien("Tuan", 7));
		q.add(new SinhVien("Nam", 4));

		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
	}

	private static int sosanh(SinhVien x, SinhVien y) {
		return x.diem - y.diem;
	}

}
