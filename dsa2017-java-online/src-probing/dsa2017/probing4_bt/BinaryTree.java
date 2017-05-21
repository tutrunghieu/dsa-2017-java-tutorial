package dsa2017.probing4_bt;

import java.util.Stack;

public class BinaryTree
{
	protected BinaryNode root = null;

	public BinaryNode add(BinaryNode n, BinaryNode p, boolean left) 
	{
		if(root == null) root = n;
		
		if(p != null)  
		{
			if(left) p.left = n;
			else p.right = n;
			
		}
		
		n.parent = p;
		
		return n;
	}

	public void dump() 
	{
		if(root == null) return;
		
		Stack<BinaryNode> todo = new Stack<BinaryNode>();
		todo.push(root);
		
		while(!todo.empty())
		{
			BinaryNode cur = todo.pop();
			System.out.println(cur);
			
			if(cur.right != null) todo.push(cur.right);
			if(cur.left != null) todo.push(cur.left);
		}
		
		return;
	}

}
