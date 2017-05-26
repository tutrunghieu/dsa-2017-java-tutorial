package dsa2017.day5.avl;

public class to_insert_into_avl {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		AvlTree tree = new AvlTree();
		AvlNode n13 = tree.add(13);
		tree.add(25);
		AvlNode n5 = tree.add(5);
//		tree.add(7);
		tree.add(27);
		tree.add(29);
		tree.add(24);
		
		tree.dump();
		tree.rotate_p2_q1(n13);
		tree.dump();
//		System.out.println( tree.height(n13) );
//		System.out.println( tree.height(n5) );
	}

}
