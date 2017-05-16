package dsa2017.probing2_frame;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PictureBox extends JPanel implements MouseListener, KeyListener
{
    protected BufferedImage img;      

	public void setImage(Object f) throws Exception
	{
		if(f instanceof File) f = ImageIO.read((File)f);
		img = (BufferedImage)f;	
	}    
	
	public void paintComponent(Graphics g)
    {
        if(img != null) g.drawImage(img, 0, 0, null);
    }

	@Override
    public void mouseClicked(MouseEvent e)
    {		
		int x = e.getX();
		int y = e.getY();
    }

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}