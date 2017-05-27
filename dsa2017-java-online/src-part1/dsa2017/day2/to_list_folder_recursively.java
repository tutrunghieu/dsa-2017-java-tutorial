package dsa2017.day2;

import java.io.File;
import java.util.Stack;

public class to_list_folder_recursively 
{
	public static void main(String[] args) 
	{
		File f = new File("C:\\Program Files\\Adobe");
		listAll(f);
	}

	private static void listAll(File f) 
	{
		Stack<File> todo = new Stack<File>();
		todo.add(f);
		
		while(!todo.isEmpty())
		{
			File fk = todo.pop();
			System.out.println(fk);
			
			File[] inner = fk.listFiles();
			if(inner == null) continue;
			
			for(File ik: inner)
			{
				if(ik.isDirectory()) todo.push(ik);
				else System.out.println(ik);
			}
		}
	
		return;
	}

}
