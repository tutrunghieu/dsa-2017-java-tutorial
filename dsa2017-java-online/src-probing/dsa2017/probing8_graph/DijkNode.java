package dsa2017.probing8_graph;

import dsa2017.probing7_graph.MyNode;
import dsa2017.utils.Res;

public class DijkNode {

	@Override
	public String toString() {
		return "DijkNode [original=" + code(original) + ", parent=" + code(parent) + ", distance=" + (int)distance + "]";
	}

	private String code(MyNode n) 
	{
		return n.data;
	}

	public MyNode original;
	public MyNode parent;
	public double distance;

	public DijkNode(MyNode gk, double dk) 
	{
		original = gk;
		parent = gk;
		distance = dk;
	}

}
