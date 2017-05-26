package dsa2017.day5.swing;

import java.util.Arrays;
import java.util.List;

import dsa2017.day5.avl.AvlNode;
import dsa2017.day5.avl.AvlTree;
import dsa2017.utils.Res;

public class to_test_node_table 
{
	public static void main(String[] args) 
	{
		TabularTree t = new TabularTree();
		
		AvlTree tree = new AvlTree();
		tree.addMany(1, 2, 3, 4, 5);
		
		t.add(tree.getRoot(), x -> process(x));
		t.dump(AvlNode.class, x -> System.out.println(
				"data=" + x.data 
				+ " left=" + Res.code(x.left) 
				+ " right=" + Res.code(x.right) 
				) );
	}

	private static List<AvlNode> process(AvlNode x) 
	{
		return Arrays.asList(x.left, x.right);
	}

}
