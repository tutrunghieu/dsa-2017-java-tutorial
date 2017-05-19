package dsa2017.day3.back_tracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class to_enumerate_permutations {

	public static void main(String[] args) 
	{
		Set<String> avail = new HashSet<String>(
				Arrays.asList(
						"Amy", "Frank", "Dave"));
		
		enumerate(avail);
	}
	
	private static void enumerate(Set<String> avail) 
	{
		String[] conf = new String[avail.size()]; 
		enumerate(0, conf, avail);		
	}

	private static void enumerate(int n, String[] conf, 
			Set<String> avail) 
	{
		for(String ak: avail) 
		{
			conf[n] = ak;
			
			if(n+1==conf.length) {
				System.out.println(Arrays.asList(conf));
			}
			else {
				Set<String> avail1 = remove(avail, ak);
				enumerate(n+1, conf, avail1);
			}
		}
		
		return;
	}

	private static Set<String> remove(Set<String> avail, String ak) 
	{
		Set<String> res = new LinkedHashSet<String>();
		res.addAll(avail);
		res.remove(ak);
		return res;
	}

}
