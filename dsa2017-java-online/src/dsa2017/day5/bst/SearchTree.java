package dsa2017.day5.bst;

import java.util.Stack;

public class SearchTree 
{
	public SearchNode root = null;
	
	public void dump() 
	{
		dump(false);
	}
	
	public void dump(boolean dash) 
	{
		System.out.println("======= tree ");
		if(root == null) System.out.println("Empty tree");
		
		Stack<SearchNode> todo = new Stack<SearchNode>();
		if(root != null) todo.push(root);
		
		while(!todo.isEmpty())
		{
			SearchNode cur = todo.pop();
			
			if(dash) for(int k=0; k<cur.getLevel(); k++) System.out.print("-- ");
			System.out.println(cur);
			
			if(cur.right != null) todo.push(cur.right);
			if(cur.left != null) todo.push(cur.left);
		}
		
		return;
	}	

	
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
		return search(x, root) != null;
	}

	private SearchNode search(int x, SearchNode n) 
	{
		if(x==n.data) return n;
		if(x<n.data && n.left != null) return search(x, n.left);
		else if(x>n.data && n.right != null) return search(x, n.right);
		else return null;
	}


	public void remove(int x) 
	{
		if(root == null) return;
		SearchNode p = search(x, root);
		if(p != null) remove(p, p.parent);
	}

	private void remove(SearchNode n, SearchNode p) 
	{
		//if n has only one child c, and p.left==n,then p.left = c
		//if n has only one child c, and p.right==n,then p.right = c
		if(n.left == null || n.right == null) 
		{
			SearchNode c = (n.left==null ? n.right : n.left);
			
			if(p==null) {
				root = c;
			} 
			
			else {
				if(p.left==n) p.left = c; 
				else if(p.right==n) p.right = c;				
			}
			
			if(c != null) c.parent = p;
		} 
		
		//if n has both child
		else {
			SearchNode t = n.left;
			while(t.left != null) t = t.left;
			t.parent.left = null;
			n.data = t.data;
		}
	}


}
