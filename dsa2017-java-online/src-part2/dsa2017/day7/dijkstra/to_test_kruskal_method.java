package dsa2017.day7.dijkstra;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import dsa2017.probing7_graph.MyGraph;
import dsa2017.probing7_graph.MyLink;
import dsa2017.probing7_graph.MyNode;

public class to_test_kruskal_method 
{

	public static void main(String[] args) 
	{
		MyGraph g = DijkCase3.create();		
		DijkCase3.placeAndDraw(g);
		
		kruskalMethod(g);
	}

	private static void kruskalMethod(MyGraph g) 
	{
		List<MyLink> links = g.getLinks();
		Collections.sort(links,
				(x, y) -> MyLink.compareDist(x, y)); 
		for(MyLink lj: links) System.out.println(lj);
		
		Map<MyNode, MyComp> com = new LinkedHashMap<MyNode, MyComp>();
		for(MyNode nj: g.getNodes()) com.put(nj, new MyComp(nj));
		
		for(MyLink lj: links)
		{
			MyNode n1 = lj.linkFrom;
			MyNode n2 = lj.linkTo;
			MyComp c1 = com.get(n1);
			MyComp c2 = com.get(n2);
			
			//merging c2 into c1
			//and set n2 to c1
			c1.nodes.addAll(c2.nodes);
			com.put(n2, c1);

			print(c1);
			
			if( c1.nodes.size() == g.getNodes().size()) 
				break;
		}
	}

	private static void print(MyComp c1)
	{
		for(MyNode nj: c1.nodes)
			System.out.print(nj.data + " ");
		System.out.println();		
	}

}
