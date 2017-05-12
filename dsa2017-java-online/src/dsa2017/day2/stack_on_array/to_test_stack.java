package dsa2017.day2.stack_on_array;

public class to_test_stack {

	public static void main(String[] args) throws Exception
	{
		MyStack<String> s = new MyStack<String>();
		s.push("a");
		s.push("b");
		s.push("c");
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}

}
