package dsa2017.swing.frames;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import dsa2017.probing2_frame.BucketView;

@SuppressWarnings("serial")
public class BeforeAfterView extends JPanel 
{
	private BucketView leftView;
	private BucketView rightView;
	private JFrame parentFrame;

	public BeforeAfterView()
	{
		this.setLayout(new GridLayout(1, 2));
		this.add(leftView = new BucketView());
		this.add(rightView = new BucketView());
	}

	public void setBefore(Object f) 
	{
		try { leftView.setImage(f);	}
		catch(Exception xp) { xp.printStackTrace(); }
	}

	public void setAfter(Object f) 
	{
		try { rightView.setImage(f);	}
		catch(Exception xp) { xp.printStackTrace(); }
	}

	public void setParentFrame(JFrame p) 
	{
		parentFrame = p;
	}
}
