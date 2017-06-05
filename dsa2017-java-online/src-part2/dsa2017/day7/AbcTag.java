package dsa2017.day7;

import java.awt.Point;

public class AbcTag {

	public AbcTag(int a, int b, int c, int d) 
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
