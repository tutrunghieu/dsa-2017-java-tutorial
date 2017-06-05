package dsa2017.day7.dijkstra;

import dsa2017.probing7_graph.MyGraph;
import dsa2017.probing8_graph.FloydEngine;

public class to_test_floyd_shortest_path 
{

	public static void main(String[] args) 
	{
		MyGraph g = DijkCase2.create();		
		DijkCase2.placeAndDraw(g);
		
		FloydEngine.floydMethod(g);
	}

	
}
