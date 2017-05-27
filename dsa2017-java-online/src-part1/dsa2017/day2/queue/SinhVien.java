package dsa2017.day2.queue;

public class SinhVien  {

	public String ten;
	public int diem;

	public SinhVien(String t, int n) 
	{
		ten = t;
		diem = n;
	}

	@Override
	public String toString() {
		return "SinhVien [ten=" + ten 
				+ ", diem=" + diem + "]";
	}

}
