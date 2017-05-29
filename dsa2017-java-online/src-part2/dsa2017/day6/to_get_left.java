package dsa2017.day6;

public class to_get_left {

	public static void main(String[] args) 
	{
		String s = "Tran Van Anh";
		String[] a = s.split(" ");
		System.out.println("method1=" + a[0]);
		
		int p = s.indexOf(' ');
		String s1 = s.substring(0, p);
		System.out.println("method2=" + s1);
	}

}
