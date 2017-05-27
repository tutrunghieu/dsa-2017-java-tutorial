package dsa2017.probing6_buffered;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dsa2017.day5.swing.TreeUtils;

public class to_test_buffered_frame {

	public static void main(String[] args) 
	{
		TreeUtils.showImage(1024, 768, g -> drawLeft(g), g -> drawRight(g));		
	}

	private static void draw() 
	{
		BufferedImage img = TreeUtils.newImage(1024, 768, g -> drawLeft(g), g -> drawRight(g));
		
		int W = img.getWidth(), H = img.getHeight();
		
		Graphics g = img.createGraphics();
		g.clipRect(0, 0, W/2, H); 
		drawLeft(g); 
		g.dispose();
		
		g = img.createGraphics();
		g.clipRect(W/2, 0, W, H); 
		g.translate(W/2, 0); 
		drawRight(g);
		g.dispose();
		
		TreeUtils.figure(img);
	}

	private static void drawRight(Graphics g) 
	{
		g.setColor(Color.blue);
		g.drawRect(0, 0, 320, 200);
		
		g.setColor(Color.black);
		g.drawString("This is test", 0, 10);
	}

	private static void drawLeft(Graphics g) 
	{
		g.setColor(Color.red);
		g.drawRect(0, 0, 320, 200);
		
		g.setColor(Color.black);
		g.drawString("This is test", 0, 10);
	}

}
