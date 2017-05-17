package dsa2017.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class to_sort_on_SinhVien_compound {

	public static void main(String[] args) 
	{
		List<SinhVien> L = new ArrayList<SinhVien>();
		
		L.add(new SinhVien("Anh", 10));
		L.add(new SinhVien("Nam", 8));
		L.add(new SinhVien("Lam", 3));
		L.add(new SinhVien("Nam", 7));
		L.add(new SinhVien("Nam", 4));
		
		System.out.println("before: " + L);
		
		//Sắp xếp theo tên A-Z điểm 9-1
		Collections.sort(L, 
		(x, y) -> ten_sd_diem(x, y, +1, -1));
		
		System.out.println("after: " + L);		
	}

	private static int ten_sd_diem(SinhVien x, SinhVien y, int tenAZ, int diemAZ) 
	{
		int d = tenAZ * x.ten.compareTo(y.ten);
		if(d==0) d = diemAZ * (x.diem - y.diem);
		return d;
	}


}
