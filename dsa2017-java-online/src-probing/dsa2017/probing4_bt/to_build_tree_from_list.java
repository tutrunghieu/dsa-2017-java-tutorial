package dsa2017.probing4_bt;

public class to_build_tree_from_list {

	public static void main(String[] args) 
	{
		BinaryTree t = new BinaryTree();
		BinaryNode n = t.add(new BinaryNode(5));
		n = t.add(new BinaryNode(10), n, false);
		n = t.add(new BinaryNode(15), n, false);
		n = t.add(new BinaryNode(20), n, false);
		n = t.add(new BinaryNode(23), n, false);
		n = t.add(new BinaryNode(25), n, false);
		n = t.add(new BinaryNode(28), n, false);
		n = t.add(new BinaryNode(30), n, false);
		n = t.add(new BinaryNode(40), n, false);
		
		t.dumpWithDash();
		t = treeFromList(t);
		t.dumpWithDash();
		
	}

	private static BinaryTree treeFromList(BinaryTree tree) 
	{
		BinaryNode n = tree.getRoot();
		
		while(n.right != null) 
		{
			BinaryNode n1 = n.right;
			//System.out.println(n1);
			
			n1.left = n;
			n.parent = n1;
			
			n = n1;
		}
		
		tree.root = n;
		return tree;
	}

}
