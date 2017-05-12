package dsa2017.day2;

import java.util.Stack;

public class to_check_open_close {

	public static void main(String[] args)
	{
		String s = "[] { )[] (())) }";
		int v = checkOpenClose(s);
		System.out.println("error=" + v);
	}

	private static int checkOpenClose(String s) 
	{
		s = s.replaceAll("\\s+", "");
		
		Stack<Character> used = new Stack<Character> ();
		
		int error = -1;
		for(int k=0; k<s.length(); k++)
		{
			char ck = s.charAt(k);
			if(ck=='[') used.push(']');
			else if(ck=='(') used.push(')');
			else if(ck=='{') used.push('}');
			else if(ck==']') 
			{
				if(ck==used.pop()) System.out.println("matched");
				else { error = k; break; }
			}
			else if(ck==')') 
			{
				if(ck==used.pop()) System.out.println("matched");
				else { error = k; break; }
			}
			else if(ck=='}') 
			{
				if(ck==used.pop()) System.out.println("matched");
				else { error = k; break; }
			}
		}
	
		return error;
	}

}
