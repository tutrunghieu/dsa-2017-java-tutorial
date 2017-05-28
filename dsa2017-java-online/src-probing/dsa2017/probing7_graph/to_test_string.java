package dsa2017.probing7_graph;

public class to_test_string {

	public static void main(String[] args) 
	{
		String s = "abcd";
		System.out.println("before: " + s);
		modify(s);
		System.out.println("after: " + s);
	}

	private static void modify(String s) 
	{
		s = s + " 1234";
		System.out.println("inside: " + s);
	}

}
