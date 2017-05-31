package dsa2017.day7;

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
		MyNode f = g.add(new MyNode("f")); 
		MyLink de = g.add(new MyLink(d, e)); 
		MyLink df = g.add(new MyLink(d, f)); 
		
		MyNode x = g.add(new MyNode("x")); 
		MyNode y = g.add(new MyNode("y")); 
		MyLink xb = g.add(new MyLink(x, b)); 
		MyLink xc = g.add(new MyLink(x, c)); 
		MyLink xy = g.add(new MyLink(x, y)); 
		
		g.dump();
		
		placeAndDraw(g);		
		//placeRandomAndDraw(g);		
	}

	protected static void placeRandomAndDraw(MyGraph g) 
	{
		for(MyNode nk: g.getNodes()) 
		{
			int x = (int)(Math.random() * 300);
			int y = (int)(Math.random() * 300);
			nk.tag = new MyTag(x, y, 20, 30);
		}
		
		Figures.show(640, 480, x -> g.draw(x));
	}
	
	protected static void placeAndDraw(MyGraph g) 
	{
		g.find("a").tag = new MyTag(10, 70, 20, 30);
		g.find("b").tag = new MyTag(70, 120, 20, 30);
		g.find("c").tag = new MyTag(140, 100, 20, 30);
		
		g.find("d").tag = new MyTag(230, 27, 20, 30);
		g.find("e").tag = new MyTag(130, 200, 20, 30);
		g.find("f").tag = new MyTag(290, 170, 20, 30);
		g.find("x").tag = new MyTag(60, 10, 20, 30);
		g.find("y").tag = new MyTag(170, 15, 20, 30);
		
		Figures.show(640, 480, x -> { x.translate(30, 30); g.draw(x); });
	}

}
