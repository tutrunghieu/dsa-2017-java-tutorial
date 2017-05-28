package dsa2017.probing7_graph;

import dsa2017.day5.swing.befaf.Figures;

public class to_test_graph {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		MyGraph g = new MyGraph();
		
		MyNode a = g.add(new MyNode("a")); 
		MyNode b = g.add(new MyNode("b")); 
		MyNode c = g.add(new MyNode("c")); 
		MyLink ab = g.add(new MyLink(a, b)); 
		MyLink bc = g.add(new MyLink(b, c)); 
		
		MyNode d = g.add(new MyNode("d")); 
		MyNode e = g.add(new MyNode("e")); 
		MyLink de = g.add(new MyLink(d, e)); 
		
		g.dump();
		
		placeAndDraw(g);		
	}

	private static void placeAndDraw(MyGraph g) 
	{
		g.find("a").tag = new MyTag(10, 10, 20, 30);
		g.find("b").tag = new MyTag(70, 120, 20, 30);
		g.find("c").tag = new MyTag(140, 35, 20, 30);
		
		g.find("d").tag = new MyTag(230, 27, 20, 30);
		g.find("e").tag = new MyTag(130, 200, 20, 30);
		
		Figures.show(640, 480, x -> g.draw(x));
	}

}
