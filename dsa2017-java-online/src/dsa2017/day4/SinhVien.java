package dsa2017.day4;

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
		return "\r\nSinhVien [ten=" + ten 
				+ ", diem=" + diem + "]";
	}

}
