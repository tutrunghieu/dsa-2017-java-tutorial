package dsa2017.day5.swing.befaf;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

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

	private static int CNT_FIGURE = 1;
	public static void show(int W, int H, PaintListener g)
	{
		JFrame f = new JFrame();
		
		f.setTitle("figure " + CNT_FIGURE);
		f.setSize(W, H);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPictureBox b = new JPictureBox();
		b.paintAction = g;
		b.setPreferredSize(new Dimension(1000, 1000));
		
		JScrollPane outer = new JScrollPane(b);
		
		f.add(outer);
		f.setVisible(true);
	}

}
