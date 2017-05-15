package dsa2017.swing.frames;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import dsa2017.swing.SwingMainFrame;
import dsa2017.utils.Res;

@SuppressWarnings("serial")
public class BeforeAfterFrame extends SwingMainFrame 
{
	protected BeforeAfterView mainView;
	protected JScrollPane mainOuter;
	
	public BeforeAfterFrame() 
	{
		this.setLocation(50, 50);
		this.setSize(800, 600);
		this.setTitle("Before/After");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add(mainOuter = new JScrollPane(mainView = new BeforeAfterView()));
		
		mainView.setBefore(Res.getDesktopFile("input.png"));
		mainView.setAfter(Res.getDesktopFile("output.png"));
		mainView.setParentFrame(this);
	}

	public static void main(String[] args) 
	{
		BeforeAfterFrame f = new BeforeAfterFrame();
		f.setVisible(true);

	}

}
