package dsa2017.swing.frames;

import javax.swing.JFrame;

import dsa2017.swing.SwingMainFrame;
import dsa2017.utils.Res;

@SuppressWarnings("serial")
public class PictureFrame extends SwingMainFrame 
{
	protected MyCanvas mainView;
	
	public PictureFrame() 
	{
		this.setLocation(50, 50);
		this.setSize(800, 600);
		this.setTitle("Before/After");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add( mainView = new MyCanvas() );
		
		try { mainView.setImage(Res.getDesktopFile("input.png")); }
		catch(Exception xp) { xp.printStackTrace(); }
	}

	public static void main(String[] args) 
	{
		PictureFrame f = new PictureFrame();
		f.setVisible(true);

	}

}
