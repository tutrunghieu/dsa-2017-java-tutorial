package org.CompanyName.project1;

import java.awt.Color;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.Stack;

public class ImageService {

	public static void floodFill(BufferedImage img, Point p0, Color red) 
	{
		int W = img.getWidth(), H = img.getHeight();
		int c0 = img.getRGB((int)p0.getX(), (int)p0.getY());
		
		Stack<Point> todo = new Stack<Point>();
		todo.add(p0);
		
		while(!todo.isEmpty())
		{
			Point fk = todo.pop();
			int xk = (int)fk.getX();
			int yk = (int)fk.getY();
			
			int ck = img.getRGB(xk, yk);			
			if(ck != c0) continue;
			
			img.setRGB(xk, yk, red.getRGB());

			if(xk+1<W) todo.add(new Point(xk+1, yk));
			if(yk+1<H) todo.add(new Point(xk, yk+1));
			if(xk-1>0) todo.add(new Point(xk-1, yk));
			if(yk-1>0) todo.add(new Point(xk, yk-1));
		}
	
		return;
	}

	public static Color nextColor() 
	{
		int r = (int)Math.floor((Math.random() * 256));
		int g = (int)Math.floor((Math.random() * 256));
		int b = (int)Math.floor((Math.random() * 256));
		
		return new Color(r, g, b);
	}
	
}
