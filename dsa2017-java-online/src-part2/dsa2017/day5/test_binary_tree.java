package dsa2017.day5;

public class test_binary_tree {

	public static void main(String[] args) 
	{
		BinTree t = new BinTree();
		
		BinNode b = t.add(new BinNode("Book"), null);
		BinNode c1 = t.add(new BinNode("Chapter 1"), b);
			t.add(new BinNode("Section 1.1"), c1);
			t.add(new BinNode("Section 1.2"), c1);
		
		BinNode c2 = t.add(new BinNode("Chapter 2"), b);
			t.add(new BinNode("Section 2.1"), c2);
		
		//t.dump();
		t.dumpWithQueue();
		
	}

}
