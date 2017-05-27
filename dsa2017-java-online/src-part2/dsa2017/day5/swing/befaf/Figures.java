package dsa2017.day5.swing.befaf;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Figures 
{
	public static Color nextColor() 
	{
		int x1 = (int)Math.floor(256 * Math.random());
		int x2 = (int)Math.floor(256 * Math.random());
		int x3 = (int)Math.floor(256 * Math.random());
		return new Color(x1, x2, x3);
	}

	public static BufferedImage newRandImage(int W, int H) 
	{
		BufferedImage res = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = res.createGraphics();
		g.setColor(Figures.nextColor());
		g.fillRect(0, 0, W, H);
		g.dispose();
		return res;
	}

}
