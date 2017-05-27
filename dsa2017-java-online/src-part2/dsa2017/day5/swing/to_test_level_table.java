package dsa2017.day5.swing;

import dsa2017.day5.avl.AvlNode;
import dsa2017.day5.avl.AvlTree;

public class to_test_level_table 
{
	public static void main(String[] args) 
	{
		AvlTree tree = new AvlTree();
		tree.addMany(4, 3, 7, 1, 5, 8);
		
		LevelTable<AvlNode> levels = tree.getLevelTable();
		levels.dump(x -> printNode(x, levels));
	}

	private static void printNode(AvlNode x, LevelTable<AvlNode> levels) 
	{
		System.out.print(" data=" + x.data);
		
		LevelMetag<AvlNode> m = levels.getMetag(x);
		System.out.print(" level=" + m.level);
		System.out.print(" loc=" + m.location);
				
		System.out.println();
	}

}
