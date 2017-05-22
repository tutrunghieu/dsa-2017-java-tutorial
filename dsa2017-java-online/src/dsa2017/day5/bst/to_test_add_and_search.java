package dsa2017.day5.bst;

public class to_test_add_and_search {

	public static void main(String[] args)
	{
		SearchTree t = new SearchTree();
		t.add(15);
		t.add(4);
		t.add(20);
		t.add(17);
		t.add(19);
		
		t.dump();
		
		boolean r = t.search(17);
		System.out.println("Tim 17: " + r);

		r = t.search(18);
		System.out.println("Tim 18: " + r);
	}

}
