package dsa2017.day5.lamda;

public class to_test_lamda_expr {

	public static void main(String[] args) 
	{
		MyFunc f = new MyFunc() {

			@Override
			public double invoke(double x) 
			{
				return x * x;
			}
		};
		
		double y = f.invoke(2);
		System.out.println(y);
		
		//gán f bằng hàm mới
		f = (x) -> 20*x + 3;
		y = f.invoke(2);
		System.out.println(y);
		
		//gán f bằng hàm mới
		f = (x) -> Math.cos(x) + 3;
		y = f.invoke(0);
		System.out.println(y);
	}

}
