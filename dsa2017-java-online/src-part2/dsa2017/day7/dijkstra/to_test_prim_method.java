package dsa2017.day7.dijkstra;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dsa2017.probing7_graph.MyGraph;
import dsa2017.probing7_graph.MyLink;
import dsa2017.probing7_graph.MyNode;

public class to_test_prim_method 
{

	public static void main(String[] args) 
	{
		MyGraph g = DijkCase3.create();		
		//DijkCase3.placeAndDraw(g);
		
		primMethod(g);
	}

	private static void primMethod(MyGraph g) 
	{
		//MyNode n0 = g.find("C");
		MyNode n0 = g.getNodes().get(0);
		
		
		//inside contains only node C
		Set<MyNode> inside = new LinkedHashSet<MyNode>();
		inside.add(n0);

		//outside contains other nodes except for C
		Set<MyNode> outside = new LinkedHashSet<MyNode>();
		outside.addAll(g.getNodes());
		outside.remove(n0);

		List<MyLink> links = g.getLinks();
		Collections.sort(links,
				(x, y) -> MyLink.compareDist(x, y)); 
		
		while(outside.size() > 0)
		{
			double v = Double.MAX_VALUE;
			MyLink f = null;
			for(MyLink lj: links) 
			if(check(lj, inside, outside) )
			{
				if(lj.linkDist < v)
				{ f = lj; v = lj.linkDist; }
			}
			
			if(f != null) 
			{
				System.out.println("found: " + f);
			  //  links.remove(f);
				if(inside.contains(f.linkFrom)) {
					inside.add(f.linkTo);
					outside.remove(f.linkTo);
				} else {
					inside.add(f.linkFrom);
					outside.remove(f.linkFrom);					
				}
			}			
			
			print(inside);
		}
		
	}

	private static boolean check(MyLink lj, Set<MyNode> inside, Set<MyNode> outside) {
		return
		( inside.contains(lj.linkFrom)
		   && outside.contains(lj.linkTo) )
		|| ( inside.contains(lj.linkTo)
		&& outside.contains(lj.linkFrom) );
	}

	private static void print(Set<MyNode> c1)
	{
		for(MyNode nj: c1)
			System.out.print(nj.data + " ");
		System.out.println();		
	}

}
