package dsa2017.day5.bst;

import java.util.TreeSet;

import dsa2017.day5.bst_dsw.SearchTreeDsw;

public class to_test_remove_and_dump {

	public static void main(String[] args)
	{
		SearchTreeDsw t = new SearchTreeDsw();
		t.addMany(4, 2, 1, 3, 6, 5, 7);
		t.dump(true);
		
		System.out.println( t.collect(new TreeSet<Integer>()) );
		t.remove(15);
		System.out.println( t.collect(new TreeSet<Integer>()) );
		
//		t.remove(4); 
		t.remove(15); 
//		t.remove(16); 
//		t.remove(19); 
//		t.remove(20); 
//		t.remove(17); 
		//t.dump(true);
	}

}
