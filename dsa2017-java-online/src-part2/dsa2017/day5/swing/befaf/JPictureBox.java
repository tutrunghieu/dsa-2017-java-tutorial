package dsa2017.day5.swing.befaf;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class JPictureBox extends JComponent 
{
	public PaintListener paintAction;
	public BufferedImage image;

	public JPictureBox()
	{
		paintAction = x -> this.paintComponentDefault(x);
		
		this.setSize(800, 800);
		this.setPreferredSize(new Dimension(800, 800));
		this.setBackground(Figures.nextColor());
	}


	@Override
	protected void paintComponent(Graphics g) 
	{
		if(image != null) g.drawImage(image, 0, 0, this);
		else paintAction.paintComponent(g);
	}
	
	public void paintComponentDefault(Graphics g) 
	{
	    g.setColor(this.getBackground());
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    
	    g.setColor(Color.black);
	    g.drawString("Scroll to see A ", 20, 20);
	    g.drawString("Scroll to see B ", 400, 400);
	    g.drawString("Scroll to see C ", 750, 750);		
	}

	public void setImage(BufferedImage img, int dx, int dy) 
	{
		image = img;
		dx += img.getWidth();
		dy += img.getHeight();
		
		this.setPreferredSize(new Dimension(dx, dy));
	}
}
