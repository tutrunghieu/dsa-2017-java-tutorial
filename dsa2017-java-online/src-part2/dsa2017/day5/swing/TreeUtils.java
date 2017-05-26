package dsa2017.day5.swing;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TreeUtils 
{
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


}
