package dsa2017.day6;

public class to_get_numbers_from_string {

	public static void main(String[] args) 
	{
		String s = "abc 123 xyz 456";
		
		// \\D mean one single non-digit
		// \\D+ mean one segments non-digits
		
		s = s.replaceAll("\\D+", " ");
		System.out.println("after replace:" + s);
	}

}
