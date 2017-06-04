package dsa2017.probing8_graph;

import dsa2017.probing7_graph.MyNode;

public class DijkNode {

	public MyNode original;
	public MyNode parent;
	public double distance;
	public boolean visited = false;

	@Override
	public String toString() {
		return "DijkNode ["
		+ code(parent) + "---" + (int)distance + "---" + code(original)
		+ ", visited=" + visited
		+ "]";
	}

	private String code(MyNode n) 
	{
		return n==null ? "#NULL" : n.data;
	}


	public DijkNode(MyNode gk, double dk) 
	{
		original = gk;
		parent = null;
		distance = dk;
	}

}
