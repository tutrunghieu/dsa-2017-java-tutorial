package dsa2017.day2.submission_GC00936_Hai_Ly;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.List;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Stack;

import javax.imageio.ImageIO;

public class floodFillImage {
	public static Stack<Point> points = new Stack<Point>();
	public static Stack<Color> colors = new Stack<Color>();
	public static void main(String[] args) throws Exception
	{
		File input = getDesktopFile("input.png");		
		File output = getDesktopFile("output.png");		
		
		Desktop.getDesktop().open(input);
		BufferedImage ii = ImageIO.read(input);
		int x1 = ii.getMinTileX(), y1 = ii.getMinTileY();
		
		int W = 0, H = 0, x2 = 0, y2 = 0;
		Point p2 = null, p3 = null, p4 = null, p5 = null;
		
		
		Point p1 = new Point(x1, y1);
		
		points.add(p1);
		
		
		Color c1 = Color.red;
		Color c2 = Color.gray;
		Color c3 = Color.blue;
		Color c4 = Color.yellow;
		Color c5 = Color.green;
		
		colors.add(c1);
		colors.add(c2);
		colors.add(c3);
		colors.add(c4);
		colors.add(c5);
		
		for (int i = 0; i < colors.size(); i++) {
			if (i == 0) {
				floodfill(input, points.get(i), colors.get(i), output);
			}
			else {
					BufferedImage io = ImageIO.read(output);
					W = io.getWidth();
					H = io.getHeight();
					x2 = io.getMinTileX();
					y2 = io.getMinTileY();
					p2 = new Point(H, y2);
					p3 = new Point(W/2, H/2);
					p4 = new Point(x2, H-1);
					p5 = new Point(W-1, H-1);
					points.add(p2);
					points.add(p3);
					points.add(p4);
					points.add(p5);
				
				floodfill(output, points.get(i), colors.get(i), output);
			}
		}
		
		Desktop.getDesktop().open(output);				
	}
	
	private static void floodfill(File input, Point p0, Color color, File output) throws Exception 
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
			
			img.setRGB(xk, yk, color.getRGB());

			if(xk+1<W) todo.add(new Point(xk+1, yk));
			if(yk+1<H) todo.add(new Point(xk, yk+1));
			if(xk-1>0) todo.add(new Point(xk-1, yk));
			if(yk-1>0) todo.add(new Point(xk, yk-1));
		}
	
		ImageIO.write(img, "png", output);
	}

	private static File getDesktopFile(String name)
	{
		return new File(System.getProperty("user.home") + "/Desktop/" + name);
	}
}
