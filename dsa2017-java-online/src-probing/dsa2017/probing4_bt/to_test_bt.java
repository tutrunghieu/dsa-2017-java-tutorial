package dsa2017.probing4_bt;

public class to_test_bt {

	public static void main(String[] args) 
	{
		BinaryTree t = new BinaryTree();
		
		BinaryNode n = t.add(new BinaryNode("book"), null, true);
		
		BinaryNode n1 = t.add(new BinaryNode("chapter 1"), n, true);
		t.add(new BinaryNode("section 1.A"), n1, true);
		t.add(new BinaryNode("section 1.B"), n1, false);
		
		BinaryNode n2 = t.add(new BinaryNode("chapter 2"), n, false);
		t.add(new BinaryNode("section 2.C"), n2, true);
		t.add(new BinaryNode("section 2.D"), n2, false);
		
		t.dump();
	}

}
