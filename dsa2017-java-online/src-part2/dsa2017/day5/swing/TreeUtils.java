package dsa2017.day5.swing;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TreeUtils 
{
	@SuppressWarnings("serial")
	public static void figure(BufferedImage img)
	{
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("figure");
		f.setSize(img.getWidth() + 100, img.getHeight() + 100);
		f.setLocationRelativeTo(null);
		
		f.add(new JPanel() 
		{
		  @Override
		  protected void paintComponent(Graphics g) {
			  g.drawImage(img, 0, 0, this);
			  
//			  g.setColor(Color.blue);
//			  g.drawString("This is test", +5, +30);
		  }			
		});
		
		f.setVisible(true);		
	}
	
	@SuppressWarnings("serial")
	public static void figure(int W, int H, PaintAction lf) 
	{
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("figure");
		f.setSize(W, H);
		f.setLocationRelativeTo(null);
		
		f.add(new JPanel() 
		{
		  @Override
		  protected void paintComponent(Graphics g) { lf.paintComponent(g); }			
		});
		
		f.setVisible(true);
	}

	public static int maxWidth(int h) 
	{
		return (int)Math.pow(2, h-1);
	}

	public static BufferedImage newImage(int W, int H) 
	{
		return new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
	}

	public static BufferedImage newImage(int W, int H, PaintAction drawLeft, PaintAction drawRight) 
	{
		BufferedImage img = new BufferedImage(W, H, BufferedImage.TYPE_INT_ARGB);
		
		Graphics g = img.createGraphics();
		g.clipRect(0, 0, W/2, H); 
		drawLeft.paintComponent(g); 
		g.dispose();
		
		g = img.createGraphics();
		g.clipRect(W/2, 0, W, H); 
		g.translate(W/2, 0); 
		drawRight.paintComponent(g);
		g.dispose();
		
		return img;
	}

	public static void showImage(int W, int H, PaintAction left, PaintAction right) 
	{
		BufferedImage img = TreeUtils.newImage(W, H, left, right); 
		TreeUtils.figure(img);		
	}



}
