package dsa2017.day6.tries.sort_LSD;

import java.util.Arrays;

public class to_test_countsort {

	public static void main(String[] args) 
	{
		String[] a = { "BEG", "ABC", "DCA", 
				"CDB", "ADC", "BCD", "BEF" };
		
		a = radixSort(a, 2); System.out.println(Arrays.asList(a));
		a = radixSort(a, 1); System.out.println(Arrays.asList(a));
		a = radixSort(a, 0); System.out.println(Arrays.asList(a));
	}

	private static String[] radixSort(String[] a, int d) 
	{
		int[] C = new int['G'-'A' + 1];
		int[] S = new int['G'-'A' + 1];
		
		for(String ak: a) { int j = radix(ak, d); C[j]++; }
		for(int j=1; j<C.length; j++) S[j] = S[j-1] + C[j-1];
		
		String[] aux = new String[a.length];
		for(String ak: a) { int j = radix(ak, d); aux[ S[j]++ ] = ak; }
		
		return aux;
	}

	private static int radix(String ak, int d)
	{
		return ak.charAt(d) - 'A';
	}

}
