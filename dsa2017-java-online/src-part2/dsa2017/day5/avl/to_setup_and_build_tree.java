//package dsa2017.day5.avl;
//
//import dsa2017.day5.bst.SearchNode;
//import dsa2017.day5.bst.SearchTree;
//
//public class to_setup_and_build_tree {
//
//	public static void main(String[] args) 
//	{
//		SearchNode P = new SearchNode(10);
//		P.left = new SearchNode(5);
//		SearchNode Q = P.right = new SearchNode(20);
//		P.left.parent = P;
//		P.right.parent = P;
//
//		Q.left = new SearchNode(11);
//		Q.left.parent = Q;
//		Q.right = new SearchNode(25);
//		Q.right.parent = Q;
//		
//		SearchTreeAvl t = new SearchTreeAvl(P);
//		t.dump(true);
//
//		t.rotateRightLeftLonger(P);
//	}
//
//}
