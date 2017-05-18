package org.CompanyName.project1;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BucketView extends JPanel 
{
    protected BufferedImage img;
	
	public void paintComponent(Graphics g)
    {
        if(img != null) g.drawImage(img, 0, 0, null);
    }
	
	public void setImage(Object f) throws Exception
	{
		if(f instanceof File) f = ImageIO.read((File)f);
		img = (BufferedImage)f;	
	}    
	
	public BufferedImage getImage() 
	{
		return img;
	}
	



}