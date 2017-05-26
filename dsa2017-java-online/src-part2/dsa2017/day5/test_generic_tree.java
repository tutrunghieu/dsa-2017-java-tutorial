package dsa2017.day5;

public class test_generic_tree {

	public static void main(String[] args) 
	{
		GenericTree t = new GenericTree();
		GenericNode b = t.add(new GenericNode("book"), null);
		
		GenericNode c1 = t.add(new GenericNode("Chapter 1"), b);
		t.add(new GenericNode("Section 1.1"), c1);
		t.add(new GenericNode("Section 1.2"), c1);
		t.add(new GenericNode("Section 1.3"), c1);
		
		GenericNode c2 = t.add(new GenericNode("Chapter 2"), b);
		t.add(new GenericNode("Section 2.A"), c2);
		t.add(new GenericNode("Section 2.B"), c2);
		
		GenericNode c3 = t.add(new GenericNode("Chapter 3"), b);
		t.add(new GenericNode("Section 3.1"), c3);
		
		t.dump();
	}

}
