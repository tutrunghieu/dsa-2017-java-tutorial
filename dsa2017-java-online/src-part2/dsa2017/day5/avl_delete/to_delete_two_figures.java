package dsa2017.day5.avl_delete;

import dsa2017.day5.avl.AvlTree;
import dsa2017.day5.swing.AvlTreeUtils;
import dsa2017.day5.swing.TypedAction;
import dsa2017.day5.swing.befaf.Figures;
import dsa2017.utils.Res;

public class to_delete_two_figures
{
	//https://docs.google.com/document/d/1q-AwBOF_wFUZMTz0gRVCGNY_Fge3hwIW_s6IX01z-IE/edit
	public static void main(String[] args) 
	{
		if(Res.IGNORE)
		run(new int[]{ 5, 1, 10, 7, 12, 11 },
				x -> x.rotate_R2_R1(x.getRoot()));
		
		if(Res.IGNORE)
		run(new int[]{ 5, 2, 10, 7, 6, 12, 11 },
				x -> x.rotate_R2_B(x.getRoot()));
		
		run(new int[]{ 5, 2, 1, 12, 10, 19, 8, 11, 18, 9 },
				x -> x.rotate_R2_L1_L1(x.getRoot()));
	}

	public static void run(int[] a, TypedAction<AvlTree> lf) 
	{
		{ AvlTree tree1 = new AvlTree(a);
		Figures.show(640, 480, 
				x -> AvlTreeUtils.draw(x, 
						tree1.getLevelTable())); }					
		
		{ AvlTree tree2 = new AvlTree(a);
		lf.invokeAction(tree2);		
		Figures.show(640, 480, 
				x -> AvlTreeUtils.draw(x, 
						tree2.getLevelTable())); }					
	}
	
}
