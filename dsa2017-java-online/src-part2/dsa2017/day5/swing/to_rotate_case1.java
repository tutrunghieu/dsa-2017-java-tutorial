package dsa2017.day5.swing;

import dsa2017.day5.avl.AvlNode;
import dsa2017.day5.avl.AvlTree;

public class to_rotate_case1
{

	public static void main(String[] args) 
	{
		int[] a = {4, 3, 10, 12, 8, 7 };
		
		LevelTable<AvlNode> left = before(a);
		LevelTable<AvlNode> right = after(a);
		
		AvlTreeUtils.figureLR(800, 600, 
				x -> AvlTreeUtils.draw(x, left), 
				x -> AvlTreeUtils.draw(x, right));			
	}

	private static LevelTable<AvlNode> before(int[] a) 
	{
		AvlTree tree1 = new AvlTree(a);
		
		System.out.println("====== before rotation");
		tree1.dump();
		
		return tree1.getLevelTable();
	}
	
	private static LevelTable<AvlNode> after(int[] a) 
	{
		AvlTree tree = new AvlTree(a);
		tree.rotate_pA2_qB1( tree.search(4) );
		
		System.out.println("\n====== after rotation");
		tree.dump();
		
		return tree.getLevelTable();
	}
	

	
}
