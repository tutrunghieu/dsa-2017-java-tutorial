package dsa2017.day5.avl;

public class AvlNode {
	public int data;
	public AvlNode left;
	public AvlNode right;
	public AvlNode parent;

	public AvlNode(int x) 
	{
		data = x;
		left = null;
		right = null;
		parent = null;
	}

}
