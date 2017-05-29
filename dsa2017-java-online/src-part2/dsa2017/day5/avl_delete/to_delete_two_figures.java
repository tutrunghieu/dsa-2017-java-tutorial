package dsa2017.day5.avl_delete;

import dsa2017.day5.avl.AvlTree;
import dsa2017.day5.swing.AvlTreeUtils;
import dsa2017.day5.swing.befaf.Figures;

public class to_delete_two_figures
{

	public static void main(String[] args) 
	{
		run(new int[]{ 4, 1, 10, 7, 5, 12 });
	}

	public static void run(int[] a) 
	{
		{ AvlTree tree1 = new AvlTree(a);
		Figures.show(640, 480, 
				x -> AvlTreeUtils.draw(x, 
						tree1.getLevelTable())); }					
		
		{ AvlTree tree2 = new AvlTree(a);
		tree2.rotate_R2_L1(tree2.getRoot());		
		Figures.show(640, 480, 
				x -> AvlTreeUtils.draw(x, 
						tree2.getLevelTable())); }					
	}
	
}
