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
		
		a.tag = new MyTag(10, 10, 20, 30);
		b.tag = new MyTag(70, 120, 20, 30);
		c.tag = new MyTag(140, 35, 20, 30);
		
		Figures.show(640, 480, x -> {
			x.translate(30, 40);
			g.draw(x);	
		});
	}

}
