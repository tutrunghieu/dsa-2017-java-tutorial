package dsa2017.probing4_expr_tree;

import dsa2017.probing4_bt.BinaryNode;
import dsa2017.probing4_bt.BinaryTree;

public class to_test_expr_tree {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		BinaryTree t = new BinaryTree();
		
		BinaryNode n = t.add(new BinaryNode("+"));

		BinaryNode n1 = t.add(new BinaryNode("-"), n, true);
		BinaryNode n2 = t.add(new BinaryNode(5), n, false);
		
		BinaryNode n11 = t.add(new BinaryNode(2), n1, true);
		BinaryNode n12 = t.add(new BinaryNode("*"), n1, false);
		
		t.add(new BinaryNode(3), n12, true);
		t.add(new BinaryNode(4), n12, false);
		
		t.dumpWithDash();
		
		Object v = eval(n);
		System.out.println("final: " + v);
	}

	private static Object eval(BinaryNode n) 
	{
		Object v = n.info;
		
		if(v instanceof Integer) {
			return n.info;
		}
		
		else if(v.toString().equals("+"))
		{
			Integer left = (Integer)eval(n.left);
			Integer right = (Integer)eval(n.right);
			return left + right;
		}
		
		else if(v.toString().equals("-"))
		{
			Integer left = (Integer)eval(n.left);
			Integer right = (Integer)eval(n.right);
			return left - right;
		}
		
		else if(v.toString().equals("*"))
		{
			Integer left = (Integer)eval(n.left);
			Integer right = (Integer)eval(n.right);
			return left * right;
		}
		
		return null;
	}

}
