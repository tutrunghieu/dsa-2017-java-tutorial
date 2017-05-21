package dsa2017.probing4_bt;

public class to_build_tree_from_array {

	public static void main(String[] args) 
	{
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		BinaryNode r = buildTree(a, 0, a.length, null);
		
		BinaryTree t = new BinaryTree(r);
		t.dumpWithDash();		
	}

	private static BinaryNode buildTree(int[] a, int left, int right, BinaryNode p) 
	{
		if(left+1>=right) return null;
		
		int m = (left+right)/2;
		
		BinaryNode n = new BinaryNode(a[m]);
		n.parent = p;
		n.left = buildTree(a, left, m, n);
		n.right = buildTree(a, m+1, right, n);
		
		return n;
	}

}
