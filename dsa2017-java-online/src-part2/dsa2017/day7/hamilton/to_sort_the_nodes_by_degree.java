package dsa2017.day7.hamilton;

import java.util.Collections;
import java.util.List;

import dsa2017.probing7_graph.MyGraph;
import dsa2017.probing7_graph.MyNode;
import dsa2017.probing8_graph.DijkCase1;

public class to_sort_the_nodes_by_degree {

	public static void main(String[] args) 
	{
		MyGraph g = DijkCase1.create();		
		List<MyNode> nodes = g.getNodes();
		Collections.sort(nodes, 
				(x, y) -> sortByDeg(x, y));
		
		for(MyNode nk: nodes)
		{
			System.out.println(nk.data + ": " + nk.links.size());
		}
	}

	private static int sortByDeg(MyNode x, MyNode y)
	{
		int dx = x.links.size();
		int dy = y.links.size();
		return dy - dx;
	}

}
