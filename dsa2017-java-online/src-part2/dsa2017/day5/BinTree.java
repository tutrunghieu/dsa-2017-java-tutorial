package dsa2017.day5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import dsa2017.utils.Res;

public class BinTree {
	public BinNode root;

	public BinNode add(BinNode n, BinNode p) 
	{
		if(root == null) root = n;
		
		if(p != null) 
		{
			n.parent = p;
			if(p.left == null) p.left = n;
			else if(p.right == null) p.right = n;
		}
		
		return n;
	}

	public void dump() 
	{
		Stack<BinNode> todo = new Stack<BinNode>();
		if(root != null) todo.push(root);
		
		while(!todo.isEmpty())
		{
			BinNode cur = todo.pop();
			
			System.out.println(cur.hashCode()
					+ "| data=" + cur.data
					+ "| parent=" + Res.code(cur.parent) );
			
			if(cur.right != null) todo.push(cur.right);
			if(cur.left != null) todo.push(cur.left);
		}
		
		return;
	}

	public void dumpWithQueue() 
	{
		Queue<BinNode> todo = new LinkedList<BinNode>();
		if(root != null) todo.add(root);
		
		while(!todo.isEmpty())
		{
			BinNode cur = todo.remove();
			
			System.out.println(cur.hashCode()
					+ "| data=" + cur.data
					+ "| parent=" + Res.code(cur.parent) );
			
			if(cur.left != null) todo.add(cur.left);
			if(cur.right != null) todo.add(cur.right);
		}
		
		return;
		
	}

}
