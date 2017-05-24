package dsa2017.day5.bst_dsw;

import dsa2017.day5.bst.SearchNode;

public class to_build_tree_from_array {

	public static void main(String[] args) 
	{
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		
		SearchNode n = buildTree(a, 0, a.length, null);
		SearchTreeDsw t = new SearchTreeDsw(n);
		t.dump(true);
	}

	private static SearchNode buildTree(int[] a, int left, int right, SearchNode p) 
	{
		if(left>=right) return null;
		
		SearchNode n = new SearchNode();
		
		int mid = (left+right)/2;
		n.data = a[mid];
		n.left = buildTree(a, left, mid, n);
		n.right = buildTree(a, mid+1, right, n);
		n.parent = p;
		
		return n;
	}

}
