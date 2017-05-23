package dsa2017.day5.bst;

import java.util.TreeSet;

public class to_flattern_the_tree {

	public static void main(String[] args)
	{
		SearchTreeDsw t = new SearchTreeDsw();
		//t.addMany(15, 4, 1, 20, 17, 19, 18, 5);
		
		System.out.println( t.collect(new TreeSet<Integer>()) );
		t.flatten();
		System.out.println( t.collect(new TreeSet<Integer>()) );
	}



}
