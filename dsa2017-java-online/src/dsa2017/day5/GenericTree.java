package dsa2017.day5;

import java.util.Stack;

import dsa2017.utils.Res;

public class GenericTree 
{
	public GenericNode root;

	public GenericNode add(GenericNode n, GenericNode p) 
	{
		if(root == null) root = n;
		
		if(p != null) 
		{
			n.parent = p;
			p.children.add(n);
		}
		
		return n;
	}

	public void dump() 
	{
		Stack<GenericNode> todo = new Stack<GenericNode>();
		if(root != null) todo.push(root);
		
		while(!todo.isEmpty())
		{
			GenericNode cur = todo.pop();
			
			System.out.println(cur.hashCode()
					+ "| data=" + cur.data
					+ "| parent=" + Res.code(cur.parent) );
			
			for(GenericNode ck: cur.getChildrenRev())
				todo.push(ck);
		}
		
		return;
	}

}
