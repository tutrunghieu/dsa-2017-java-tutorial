package dsa2017.day5.avl_delete;

import java.awt.Color;
import java.awt.Graphics;

import dsa2017.day5.avl.AvlTree;
import dsa2017.day5.swing.AvlTreeUtils;
import dsa2017.day5.swing.TreeUtils;
import dsa2017.day5.swing.TypedAction;

public class to_test_avl_deletion {

	public static void main(String[] args) 
	{
		int[] a = new int[]{ 4, 3, 10, 12, 8, 14, 11 };
		TypedAction<AvlTree> action = x -> x.rotate_R2_R1(x.getRoot() );
		
		TreeUtils.showImage(1424, 768, g -> drawLeft(g, a), g -> drawRight(g, a, action));		
	}

	private static void drawLeft(Graphics g, int[] a) 
	{
		AvlTree tree = new AvlTree(a);
		
		g.setColor(new Color(228, 250, 228));
		g.fillRect(0, 0, 1000, 1000);
		g.translate(0, 50);
		AvlTreeUtils.draw(g, tree.getLevelTable());
	}
	
	private static void drawRight(Graphics g, int[] a, TypedAction<AvlTree> action)
	{
		AvlTree tree = new AvlTree(a);
		action.invokeAction(tree);
		
		g.setColor(new Color(228, 228, 250));
		g.fillRect(0, 0, 1000, 1000);
		g.translate(0, 50);
		AvlTreeUtils.draw(g, tree.getLevelTable());
	}


}
