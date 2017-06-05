package dsa2017.probing7_graph;

import java.awt.Point;

import dsa2017.probing8_graph.DijkNode;

public class MyLink {

	@Override
	public String toString() {
		return "(" + linkFrom.data 
				+"---" +(int)linkDist
				+ "---" + linkTo.data + ")";
	}

	public MyNode linkFrom;
	public MyNode linkTo;
	public boolean linkDir;
	public double linkDist;

	public MyLink(MyNode a, MyNode b) 
	{
		linkFrom = a;
		linkTo = b;
		linkDir = true; 
	}

	public MyLink(MyNode a, MyNode b, double d) 
	{
		linkFrom = a;
		linkTo = b;
		linkDir = true; 
		linkDist = d;
	}

	public Point getMidPoint() 
	{
		Point t1 = linkFrom.tag.getCenter();
		Point t2 = linkTo.tag.getCenter();
		
		return new Point((t1.x+t2.x)/2, (t1.y+t2.y)/2);
	}

	public MyNode getAdjacent(MyNode t) 
	{
		if(linkFrom==t) return linkTo;
		else if(linkTo==t) return linkFrom;
		else return null;
	}

	public static int compareDist(MyLink x, MyLink y)
	{
		return (int)Math.signum(x.linkDist - y.linkDist);
	}

}
