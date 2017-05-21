package dsa2017.probing4_gen;

public class to_build_and_dump {

	public static void main(String[] args) 
	{
		GenTree t = new GenTree();
		
		GenTreeNode n = t.add(new GenTreeNode("book"), null);
		GenTreeNode n1 = t.add(new GenTreeNode("chapter 1"), n);
		t.add(new GenTreeNode("section 1.1"), n1);
		t.add(new GenTreeNode("section 1.2"), n1);
		t.add(new GenTreeNode("section 1.3"), n1);
		
		GenTreeNode n2 = t.add(new GenTreeNode("chapter 2"), n);
		t.add(new GenTreeNode("section 2.1"), n2);
		t.add(new GenTreeNode("section 2.2"), n2);
		
		GenTreeNode n3 = t.add(new GenTreeNode("chapter 3"), n);
		t.add(new GenTreeNode("section 3.A"), n3);
		t.add(new GenTreeNode("section 3.B"), n3);
		t.add(new GenTreeNode("section 3.C"), n3);

		t.dump();
	}

}
