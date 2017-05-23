package dsa2017.day5.bst;

public class to_test_remove_and_dump {

	public static void main(String[] args)
	{
		SearchTree t = new SearchTree();
		t.add(15);
		t.add(4);
		t.add(20);
		t.add(17);
		t.add(19);
		
		t.remove(4); 
		//t.remove(15); 
		t.remove(16); 
		t.remove(19); 
		t.remove(20); 
		//t.remove(17); 
		t.dump();
	}

}
