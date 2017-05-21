package dsa2017.probing4_gen;

import java.util.Stack;

public class GenTree {

	private GenTreeNode root;

	public GenTreeNode add(GenTreeNode n, GenTreeNode p) 
	{
		if(root == null) root = n;
		
		if(p != null) p.add(n);
		n.parent = p;
		
		return n;
	}

	public void dump() 
	{
		if(root == null) return;
		
		Stack<GenTreeNode> todo = new Stack<GenTreeNode>();
		todo.push(root);
		
		while(!todo.empty())
		{
			GenTreeNode cur = todo.pop();
			System.out.println(cur);
			
			for(GenTreeNode nk: cur.getChildrenReverse()) todo.push(nk);
		}
		
		return;
		
	}

}
