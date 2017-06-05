package dsa2017.day7.dijkstra;

import dsa2017.day5.swing.befaf.Figures;
import dsa2017.probing7_graph.MyGraph;
import dsa2017.probing7_graph.MyLink;
import dsa2017.probing7_graph.MyNode;
import dsa2017.probing7_graph.MyTag;

public class DijkCase3 {

	public static MyGraph create() {
		MyGraph g = new MyGraph();

		MyNode A = g.add(new MyNode("A"));
		MyNode B = g.add(new MyNode("B"));

		MyNode C = g.add(new MyNode("C"));
		MyNode D = g.add(new MyNode("D"));

		MyNode E = g.add(new MyNode("E"));

		g.add(new MyLink(A, B, 1));
		g.add(new MyLink(A, C, 2));
		
		g.add(new MyLink(B, C, 5));
		g.add(new MyLink(B, D, 2));

		g.add(new MyLink(C, D, 4));
		g.add(new MyLink(C, E, 1));
		g.add(new MyLink(D, E, 3));
		
		return g;
	}

	public static void placeAndDraw(MyGraph g) {
		g.dump();

		g.find("A").tag = new MyTag(10, 10, 20, 30);
		g.find("B").tag = new MyTag(100, 10, 20, 30);

		g.find("C").tag = new MyTag(10, 100, 20, 30);
		g.find("D").tag = new MyTag(100, 100, 20, 30);

		g.find("E").tag = new MyTag(50, 170, 20, 30);

		Figures.show(640, 480, x -> {
			x.translate(30, 30);
			g.draw(x);
		});
	}

}
