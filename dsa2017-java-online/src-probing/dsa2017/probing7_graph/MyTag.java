package dsa2017.probing7_graph;

import java.awt.Point;

public class MyTag {

	public MyTag(int a, int b, int c, int d) 
	{
		x = a;
		y = b;
		width = c;
		height = d;
	}
	
	public int x;
	public int y;
	public int width;
	public int height;
	
	public Point getCenter() 
	{
		return new Point(x + width/2, y + height/2);
	}

}
