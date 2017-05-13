package dsa2017.day2;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Stack;

import javax.imageio.ImageIO;

import dsa2017.utils.Res;

public class to_fill_a_region_with_flood_fill {

	public static void main(String[] args) throws Exception
	{
		File input = Res.getDesktopFile("input.png");		
		File output = Res.getDesktopFile("output.png");		
		
		Desktop.getDesktop().open(input);
		floodfill(input, new Point(174, 94), Color.red, output);
		Desktop.getDesktop().open(output);				
	}

	private static void floodfill(File input, Point p0, Color red, File output) throws Exception 
	{
		BufferedImage img = ImageIO.read(input);
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
	
		ImageIO.write(img, "png", output);
	}


}
