package dsa2017.day5.bst_dsw;

import java.util.Set;
import java.util.Stack;

import dsa2017.day5.bst.SearchNode;
import dsa2017.day5.bst.SearchTree;

public class SearchTreeDsw extends SearchTree 
{
	public SearchTreeDsw() 
	{
		
	}
	public SearchTreeDsw(SearchNode n) 
	{
		super(n);
	}

	public void flatten() 
	{
		SearchNode x1 = root;
		
		while(x1 != null) 
		{
			x1 = rotateLeft(x1);
			x1 = x1.right;
		}

		return;
	}

	private SearchNode rotateLeft(SearchNode x1) 
	{
		while(x1.left != null) 
		{
			//this.dumpWithDash();
			
			SearchNode x2 = x1.left;
			SearchNode r2 = x2.right;
			
			x1.left = r2;
			if(r2 != null) r2.parent = x1;
			
			x2.right = x1;
			
			if(x1.parent == null) root = x2;
			else if(x1.parent.left==x1) x1.parent.left = x2;
			else if(x1.parent.right==x1) x1.parent.right = x2;
			
			x2.parent = x1.parent; 
			x1.parent = x2;
			
//			System.out.println("rotating " + x1);
//			System.out.println("rotating " + x2);
			
			x1 = x2;
		}
		
		return x1;
	}

	public Set<Integer> collect(Set<Integer> s) 
	{
		Stack<SearchNode> todo = new Stack<SearchNode>();
		if(root != null) todo.push(root);
		
		while(!todo.isEmpty())
		{
			SearchNode cur = todo.pop();
			s.add(cur.data);
			
			if(cur.right != null) todo.push(cur.right);
			if(cur.left != null) todo.push(cur.left);
		}
		
		return s;
	}

	public void fold(int c) 
	{
		while(true) 
		{
			SearchNode x1 = root;
			
			while(x1 != null) 
			{
				x1 = fold(x1);
				if(root.data == c) break;
			}
			
			if(root.data == c) break;
		}
		
		return;
	}

	private SearchNode fold(SearchNode x1) 
	{
		if(x1==null || x1.right == null) return null;
		System.out.println("folding " + x1);
		
		SearchNode x2 = x1.right;
		SearchNode l2 = x2.left;
		
		x1.right = l2;
		if(l2 != null) l2.parent = x1;
		
		x2.left = x1;
		
		if(x1.parent == null) root = x2;
		else if(x1.parent.left==x1) x1.parent.left = x2;
		else if(x1.parent.right==x1) x1.parent.right = x2;
		
		x2.parent = x1.parent; 
		x1.parent = x2;
		
		x1 = x2.right;
		if(x1 != null) x1 = x1.right;
		
		this.dump(true);
		
		return x2.right;
	}

	public void addMany(int... args)
	{
		for(int ak: args) add(ak);
	}


}
