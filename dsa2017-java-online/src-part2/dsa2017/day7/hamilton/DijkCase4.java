package dsa2017.day7.hamilton;

import dsa2017.day5.swing.befaf.Figures;
import dsa2017.probing7_graph.MyGraph;
import dsa2017.probing7_graph.MyLink;
import dsa2017.probing7_graph.MyNode;
import dsa2017.probing7_graph.MyTag;

public class DijkCase4 {

	public static MyGraph create() {
		MyGraph g = new MyGraph();

		MyNode n1 = g.add(new MyNode("1"));
		MyNode n2 = g.add(new MyNode("2"));

		MyNode n3 = g.add(new MyNode("3"));
		MyNode n4 = g.add(new MyNode("4"));

		MyNode n5 = g.add(new MyNode("5"));

		g.add(new MyLink(n1, n2, 1));
		g.add(new MyLink(n2, n3, 1));
		g.add(new MyLink(n2, n5, 1));
		
		g.add(new MyLink(n5, n3, 1));
		g.add(new MyLink(n5, n4, 1));

		g.add(new MyLink(n3, n4, 1));
		g.add(new MyLink(n1, n4, 1));
		
		return g;
	}

	public static void placeAndDraw(MyGraph g) {
		g.dump();

		g.find("1").tag = new MyTag(10, 100, 20, 30);
		g.find("5").tag = new MyTag(100, 100, 20, 30);
		g.find("3").tag = new MyTag(200, 100, 20, 30);

		g.find("2").tag = new MyTag(100, 10, 20, 30);
		g.find("4").tag = new MyTag(100, 200, 20, 30);

		Figures.show(640, 480, x -> {
			x.translate(30, 30);
			g.draw(x);
		});
	}

}
