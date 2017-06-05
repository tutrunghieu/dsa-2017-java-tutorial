package dsa2017.day7.dijkstra;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

import dsa2017.probing7_graph.MyGraph;
import dsa2017.probing7_graph.MyLink;
import dsa2017.probing7_graph.MyNode;
import dsa2017.probing8_graph.DijkNode;

public class DijkEngine 
{
	public static void shortestPath(MyGraph g, MyNode src) 
	{
		Map<MyNode, DijkNode> nodes = new LinkedHashMap<MyNode, DijkNode>();
		
		for(MyNode gk: g.getNodes()) 
		{
			double dk = (gk==src ? 0 : Double.POSITIVE_INFINITY);
			nodes.put(gk, new DijkNode(gk, dk));
		}
		
		Queue<DijkNode> todo = new PriorityQueue<DijkNode>( (x, y) -> (int)Math.signum(x.distance - y.distance));
		todo.add( nodes.get(src) );
		
		while(!todo.isEmpty()) 
		{
			DijkNode nk = todo.remove();
			if( nk.visited) continue;
			nk.visited = true;
			
			for(MyLink lj: nk.original.links)
			{
				DijkNode nj = nodes.get( lj.getAdjacent(nk.original) );
				if(nj.visited) continue;
				
				double dj = lj.linkDist + nk.distance;
				if(dj >= nj.distance) continue;
				System.out.println("exporing " + nj.original.data);
				
				nj.distance = dj;
				nj.parent = nk.original;
				todo.add(nj);
			} //there are links to explore
						
		} //there is still active head
		
		print(nodes);
	}

	private static void print(Map<MyNode, DijkNode> nodes)
	{
		for(DijkNode nk: nodes.values())
			System.out.println(nk);		
	}

}
