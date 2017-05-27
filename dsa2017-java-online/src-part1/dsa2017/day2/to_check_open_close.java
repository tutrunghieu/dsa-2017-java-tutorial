package dsa2017.day2;

import java.util.Stack;

public class to_check_open_close {

	public static void main(String[] args)
	{
//		String s = "[] { )[] (())) }";
//		String s = "({[";
		String s = ")))";
		int v = checkOpenClose(s);
		System.out.println("error=" + v);
	}

	private static int checkOpenClose(String s) 
	{
		s = s.replaceAll("\\s+", "");
		
		Stack<Character> stack = new Stack<Character> ();
		
		int error = -1;
		for(int k=0; k<s.length(); k++)
		{
			if(stack.isEmpty()) { error = s.length() + 1; break; }
			
			char ck = s.charAt(k);
			if(ck=='[') stack.push(']');
			else if(ck=='(') stack.push(')');
			else if(ck=='{') stack.push('}');
			else if(ck==']') 
			{
				if(ck==stack.pop()) System.out.println("matched");
				else { error = k; break; }
			}
			else if(ck==')') 
			{
				if(ck==stack.pop()) System.out.println("matched");
				else { error = k; break; }
			}
			else if(ck=='}') 
			{
				if(ck==stack.pop()) System.out.println("matched");
				else { error = k; break; }
			}
		}
	
		if(!stack.isEmpty()) return s.length() + 1;
		return error;
	}

}
