package dsa2017.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class to_sort_on_SinhVien {

	public static void main(String[] args) 
	{
		List<SinhVien> L = new ArrayList<SinhVien>();
		
		L.add(new SinhVien("Anh", 10));
		L.add(new SinhVien("Lam", 3));
		L.add(new SinhVien("Tuan", 7));
		L.add(new SinhVien("Nam", 4));
		
		System.out.println("before: " + L);
		
		//Sắp xếp theo điểm giảm dần
//		Collections.sort(L, 
//				(x, y) -> -(x.diem - y.diem));
		//Sắp xếp theo tên A tới Z
		Collections.sort(L, 
		(x, y) -> x.ten.compareTo(y.ten) );
		
		System.out.println("after: " + L);		
	}


}
