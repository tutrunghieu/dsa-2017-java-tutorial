package dsa2017.day7;

import dsa2017.day5.swing.befaf.Figures;

public class to_test_graph {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		AbcGraph g = new AbcGraph();
		
		AbcNode a = g.add(new AbcNode("a")); 
		AbcNode b = g.add(new AbcNode("b")); 
		AbcNode c = g.add(new AbcNode("c")); 
		AbcLink ab = g.add(new AbcLink(a, b)); 
		AbcLink bc = g.add(new AbcLink(b, c)); 
		
		AbcNode d = g.add(new AbcNode("d")); 
		AbcNode e = g.add(new AbcNode("e")); 
		AbcNode f = g.add(new AbcNode("f")); 
		AbcLink de = g.add(new AbcLink(d, e)); 
		AbcLink df = g.add(new AbcLink(d, f)); 
		
		AbcNode x = g.add(new AbcNode("x")); 
		AbcNode y = g.add(new AbcNode("y")); 
		AbcLink xb = g.add(new AbcLink(x, b)); 
		AbcLink xc = g.add(new AbcLink(x, c)); 
		AbcLink xy = g.add(new AbcLink(x, y)); 
		
		g.dump();
		
		placeAndDraw(g);		
		//placeRandomAndDraw(g);		
	}

	protected static void placeRandomAndDraw(AbcGraph g) 
	{
		for(AbcNode nk: g.getNodes()) 
		{
			int x = (int)(Math.random() * 300);
			int y = (int)(Math.random() * 300);
			nk.tag = new AbcTag(x, y, 20, 30);
		}
		
		Figures.show(640, 480, x -> g.draw(x));
	}
	
	protected static void placeAndDraw(AbcGraph g) 
	{
		g.find("a").tag = new AbcTag(10, 70, 20, 30);
		g.find("b").tag = new AbcTag(70, 120, 20, 30);
		g.find("c").tag = new AbcTag(140, 100, 20, 30);
		
		g.find("d").tag = new AbcTag(230, 27, 20, 30);
		g.find("e").tag = new AbcTag(130, 200, 20, 30);
		g.find("f").tag = new AbcTag(290, 170, 20, 30);
		g.find("x").tag = new AbcTag(60, 10, 20, 30);
		g.find("y").tag = new AbcTag(170, 15, 20, 30);
		
		Figures.show(640, 480, x -> { x.translate(30, 30); g.draw(x); });
	}

}
