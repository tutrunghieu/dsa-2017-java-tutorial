package dsa2017.day5.bst;

import java.util.Stack;

import dsa2017.utils.Res;

public class SearchTree 
{
	public SearchNode root = null;
	
	public void add(Integer x) 
	{
		SearchNode n = new SearchNode();
		n.data = x;
		
		if(root == null) root = n;
		else add(n, root);
	}

	private void add(SearchNode n, SearchNode p) 
	{
		if(n.data < p.data)
		{
			if(p.left == null) { p.left = n; n.parent = p; }
			else add(n, p.left);
		}
		if(n.data > p.data)
		{
			if(p.right == null)
			{ p.right = n; n.parent = p; }
			else add(n, p.right);
		}
	}

	public boolean search(int x) 
	{
		if(root==null) return false;
		return search(x, root);
	}

	private boolean search(int x, SearchNode n) 
	{
		if(x==n.data) return true;
		if(x<n.data && n.left != null) return search(x, n.left);
		else if(x>n.data && n.right != null) return search(x, n.right);
		else return false;
	}

	public void dump() 
	{
		Stack<SearchNode> todo = new Stack<SearchNode>();
		if(root != null) todo.push(root);
		
		while(!todo.isEmpty())
		{
			SearchNode cur = todo.pop();
			
			System.out.println(cur.hashCode()
					+ "| data=" + cur.data
					+ "| parent=" + Res.code(cur.parent) );
			
			if(cur.right != null) todo.push(cur.right);
			if(cur.left != null) todo.push(cur.left);
		}
		
		return;
	}


}
