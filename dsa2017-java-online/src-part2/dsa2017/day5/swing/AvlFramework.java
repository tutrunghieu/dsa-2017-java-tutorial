package dsa2017.day5.swing;

import dsa2017.day5.avl.AvlNode;
import dsa2017.day5.avl.AvlTree;

public class AvlFramework 
{
	protected TypedAction<AvlTree> action;
	protected int[] data;

	public void run(int[] a, TypedAction<AvlTree> lf) 
	{
		action = lf;
		data = a;
		
		LevelTable<AvlNode> left = before(a);
		LevelTable<AvlNode> right = after(a);
		
		AvlTreeUtils.figureLR(800, 600, 
				x -> AvlTreeUtils.draw(x, left), 
				x -> AvlTreeUtils.draw(x, right));					
	}

	private LevelTable<AvlNode> before(int[] a) 
	{
		AvlTree tree1 = new AvlTree(a);
		
		System.out.println("====== before rotation");
		tree1.dump();
		
		return tree1.getLevelTable();
	}
	
	private LevelTable<AvlNode> after(int[] a) 
	{
		AvlTree tree = new AvlTree(a);
		action.invokeAction(tree);
		
		System.out.println("\n====== after rotation");
		tree.dump();
		
		return tree.getLevelTable();
	}	
}
