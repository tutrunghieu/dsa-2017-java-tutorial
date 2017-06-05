package dsa2017.day7.dijkstra;

import java.util.LinkedHashSet;
import java.util.Set;

import dsa2017.probing7_graph.MyNode;

public class MyComp 
{
	public Set<MyNode> nodes = new LinkedHashSet<MyNode>();
	
	public MyComp(MyNode nj)
	{
		nodes.add(nj);
	}

}
