package dsa2017.probing8_spanning;

import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

import dsa2017.day5.swing.befaf.Figures;
import dsa2017.probing7_graph.MyGraph;
import dsa2017.probing7_graph.MyLink;
import dsa2017.probing7_graph.MyNode;
import dsa2017.probing8_graph.DijkCase2;

public class to_test_kruskal {

	public static void main(String[] args) 
	{
		MyGraph g = DijkCase2.create();		
		DijkCase2.placeAndDraw(g);
		
		MyGraph g1 = primMethod(g);
		Figures.show(640, 480, x -> { x.translate(30, 30); g1.draw(x); });
	}

	private static MyGraph primMethod(MyGraph g) 
	{
		Queue<MyLink> E = new PriorityQueue<MyLink>((x, y) -> (int)Math.signum(x.linkDist - y.linkDist) );
		for(MyLink lk: g.getLinks()) E.add(lk);
		
		MyGraph res = new MyGraph();
		
		Set<MyNode> used = new LinkedHashSet<MyNode>();
		Set<MyNode> avail = new LinkedHashSet<MyNode>();
		
		for(MyNode nk: g.getNodes()) avail.add(nk);
		
		while(true)
		{
			if(used.size()==0) {
				MyLink lk = E.remove();
				used.add(lk.linkFrom);
				used.add(lk.linkTo);
				
				res.add(lk.linkFrom);
				res.add(lk);
			}
			
			if(E.size()==0) break;
		}
				
		return res;
	}

	protected static MyGraph kruskalMethod(MyGraph g) 
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
