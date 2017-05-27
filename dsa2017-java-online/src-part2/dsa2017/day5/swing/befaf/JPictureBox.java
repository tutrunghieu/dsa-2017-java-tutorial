package dsa2017.day5.swing.befaf;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class JPictureBox extends JComponent 
{
	public JPictureBox()
	{
		this.setSize(800, 800);
		this.setPreferredSize(new Dimension(800, 800));
		this.setBackground(nextColor());
	}

	private static Color nextColor() 
	{
		int x1 = (int)Math.floor(256 * Math.random());
		int x2 = (int)Math.floor(256 * Math.random());
		int x3 = (int)Math.floor(256 * Math.random());
		return new Color(x1, x2, x3);
	}

	@Override
	protected void paintComponent(Graphics g) 
	{
	    g.setColor(this.getBackground());
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    
	    g.setColor(Color.black);
	    g.drawString("Scroll to see A ", 20, 20);
	    g.drawString("Scroll to see B ", 400, 400);
	    g.drawString("Scroll to see C ", 750, 750);
	}
}
