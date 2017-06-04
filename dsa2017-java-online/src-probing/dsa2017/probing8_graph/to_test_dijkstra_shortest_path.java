package dsa2017.probing8_graph;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import dsa2017.day5.swing.befaf.Figures;
import dsa2017.probing7_graph.MyGraph;
import dsa2017.probing7_graph.MyLink;
import dsa2017.probing7_graph.MyNode;
import dsa2017.probing7_graph.MyTag;

public class to_test_dijkstra_shortest_path 
{

	public static void main(String[] args) 
	{
		MyGraph g = new MyGraph();
		
		MyNode n1 = g.add(new MyNode("1")); 
		
		MyNode n6 = g.add(new MyNode("6")); 
		MyNode n3 = g.add(new MyNode("3")); 
		MyNode n2 = g.add(new MyNode("2")); 

		MyNode n5 = g.add(new MyNode("5")); 
		MyNode n4 = g.add(new MyNode("4")); 
		
		g.add(new MyLink(n1, n6, 14)); 
		g.add(new MyLink(n1, n3, 9)); 
		g.add(new MyLink(n1, n2, 7));
		
		g.add(new MyLink(n2, n3, 10)); 
		g.add(new MyLink(n2, n4, 15)); 
		
		g.add(new MyLink(n3, n6, 2)); 
		g.add(new MyLink(n3, n4, 11)); 
		
		g.add(new MyLink(n6, n5, 9)); 
		g.add(new MyLink(n5, n4, 6)); 
		
		placeAndDraw(g);
		
		shortestPath(g, g.find("1"));
	}
	
	private static void shortestPath(MyGraph g, MyNode src) 
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

	protected static void placeAndDraw(MyGraph g) 
	{
		g.dump();
		
		g.find("1").tag = new MyTag(10, 120, 20, 30);

		g.find("6").tag = new MyTag(140, 30, 20, 30);
		g.find("3").tag = new MyTag(150, 130, 20, 30);
		g.find("2").tag = new MyTag(140, 200, 20, 30);
		
		g.find("5").tag = new MyTag(300, 70, 20, 30);
		g.find("4").tag = new MyTag(330, 200, 20, 30);
		
		Figures.show(640, 480, x -> { x.translate(30, 30); g.draw(x); });
	}
}
