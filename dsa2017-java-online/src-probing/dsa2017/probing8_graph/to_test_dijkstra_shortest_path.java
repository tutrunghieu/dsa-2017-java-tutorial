package dsa2017.probing8_graph;

import dsa2017.probing7_graph.MyGraph;

public class to_test_dijkstra_shortest_path 
{

	public static void main(String[] args) 
	{
		MyGraph g = DijkCase1.create();		
		DijkCase1.placeAndDraw(g);
		
		DijkEngine.shortestPath(g, g.find("1"));
	}
	
}
