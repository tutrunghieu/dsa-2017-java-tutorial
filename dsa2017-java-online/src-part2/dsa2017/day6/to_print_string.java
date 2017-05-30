package dsa2017.day6;

public class to_print_string {

	public static void main(String[] args) 
	{
		String s = "123";
		s = "abcd" + s;
		for(int k=0; k<s.length(); k++)
		{
			char ck = s.charAt(k);
			System.out.println(ck);
		}
	}

}
