package dsa2017.probing8_spanning;

import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import dsa2017.probing7_graph.MyGraph;
import dsa2017.probing7_graph.MyLink;
import dsa2017.probing7_graph.MyNode;
import dsa2017.probing8_graph.DijkCase2;

public class to_test_kruskal {

	public static void main(String[] args) 
	{
		MyGraph g = DijkCase2.create();		
		DijkCase2.placeAndDraw(g);
		
		MyGraph g1 = kruskalMethod(g);
		DijkCase2.placeAndDraw(g1);
	}

	private static MyGraph kruskalMethod(MyGraph g) 
	{
		MyGraph res = new MyGraph();
		for(MyNode nk: g.getNodes()) res.add(nk);
				
		Queue<MyLink> E = new PriorityQueue<MyLink>((x, y) -> (int)Math.signum(x.linkDist - y.linkDist) );
		for(MyLink lk: g.getLinks()) E.add(lk);
		
		Set<MyNode> used = new LinkedHashSet<MyNode>();
		
		while(!E.isEmpty())
		{
			MyLink ek = E.remove();
			if(used.contains(ek.linkFrom) && used.contains(ek.linkTo)) continue;
			used.add(ek.linkFrom);
			used.add(ek.linkTo);
			
			res.add(ek);
		}
		
		return res;
	}


}
