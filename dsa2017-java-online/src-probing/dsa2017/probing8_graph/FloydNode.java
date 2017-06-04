package dsa2017.probing8_graph;

import dsa2017.probing7_graph.MyNode;

public class FloydNode 
{
	public MyNode parent;
	public double weight;
	
	@Override
	public String toString() {
		if(weight==Double.POSITIVE_INFINITY) return "(---, ---)";
		else return "(p=" + code(parent) + ", w=" + (int)weight + ")";
	}
	
	private String code(MyNode p) 
	{
		return p==null ? "###" : p.data;
	}

}
