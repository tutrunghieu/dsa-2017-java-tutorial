package dsa2017.day5.bst;

import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class SearchTreeDsw extends SearchTree 
{
	public void flatten() 
	{
		SearchNode x1 = root;
		
		this.dumpWithDash();

		while(x1 != null) 
		{
			System.out.println();
			System.out.println("processing " + x1);
			if(x1.left != null) System.out.println("processing " + x1.left.data);
			if(x1.right != null) System.out.println("processing " + x1.right.data);
			x1 = rotateLeft(x1);
			this.dumpWithDash();
			
			x1 = x1.right;
		}
		
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
			
			System.out.println("rotating " + x1);
			System.out.println("rotating " + x2);
			
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

}
