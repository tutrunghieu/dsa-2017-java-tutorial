package dsa2017.day5.bst;

import java.util.TreeSet;

public class to_flattern_the_tree {

	public static void main(String[] args)
	{
		SearchTreeDsw t = new SearchTreeDsw();
		t.add(15);
		t.add(4);
		t.add(1);
		t.add(20);
		t.add(17);
		t.add(19);
		t.add(18);
		t.add(5);
		
		System.out.println( t.collect(new TreeSet<Integer>()) );
		t.flatten();
		System.out.println( t.collect(new TreeSet<Integer>()) );
	}



}
