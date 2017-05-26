package dsa2017.day5.swing;

import java.awt.Color;
import java.awt.Graphics;

public class to_show_tree {

	public static void main(String[] args) 
	{
		TreeUtils.figure(800, 600, (g) -> drawFullTree(g));
	}

	private static void drawFullTree(Graphics g) 
	{
		int H = 4;
		int W = TreeUtils.maxWidth(H);
		int dH = 90, dW = 70;
		
		int x0 = 20, y0 = 30;
		
		g.setColor(Color.red);
		
		int dx = dH, wj = W;
		for(int h=H; h>=1; h--)
		{			
			int xpad = dx/2;
			for(int x=0; x<wj; x++) 
			{
				g.fillOval(x0 + xpad + x*dx, y0 + h*dH, 10, 10);
			}
			
			dx *= 2;
			wj /= 2;
		}
				
		//g.fillRect(10, 10, 320, 200); 
	}

}
