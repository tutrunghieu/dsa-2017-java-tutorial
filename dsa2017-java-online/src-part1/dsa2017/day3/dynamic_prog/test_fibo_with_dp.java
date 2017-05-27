package dsa2017.day3.dynamic_prog;

import java.util.Map;
import java.util.TreeMap;

public class test_fibo_with_dp 
{
	//bảng quy hoạch động để lưu giá trị
	private static Map<Long, Long> dpt = new TreeMap<Long, Long>(); 

	public static void main(String[] args) 
	{
		fibo(10);
	}

	private static long fibo(long n) 
	{
		Long res = dpt.get(n); 
		if(res != null) return res;
		
		System.out.println("computing " + n);
		if(n<2) return put(n, n);
		else return put(n, fibo(n-1) + fibo(n-2));
	}

	private static long put(long n, long fn) 
	{
		dpt.put(n, fn);
		return fn;
	}

}
