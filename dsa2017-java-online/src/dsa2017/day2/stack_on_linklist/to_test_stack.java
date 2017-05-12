package dsa2017.day2.stack_on_linklist;

public class to_test_stack {

	public static void main(String[] args) throws Exception
	{
		MyStack2<String> s = new MyStack2<String>();
		s.push("a");
		s.push("b");
		s.push("c");
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
	}

}
