package dsa2017.day5.swing.befaf;

import java.awt.GridLayout;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class LeftRightFrame extends JFrame
{
	protected JScrollPane leftPane;
	protected JComponent leftView;
	protected JScrollPane rightPane;
	protected JComponent rightView;

	public LeftRightFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("menu frame");
		this.setSize(640, 480);
		this.setLocationRelativeTo(null);
		
		this.createInnerContent();
	}
	
	public void setImage(BufferedImage img, boolean left)
	{
		JPictureBox t = (JPictureBox)(left ? leftView : rightView);
		t.setImage(img, 100, 100);		
	}

	protected void createInnerContent() 
	{
		leftPane = new JScrollPane(leftView = new JPictureBox());
		//show(leftPane);
		rightPane = new JScrollPane(rightView = new JPictureBox());
		//show(rightPane);
		
		setImage(Figures.newRandImage(600, 400), true);
		setImage(Figures.newRandImage(400, 600), false);
		
		this.setLayout(new GridLayout(1, 2));
		this.add(leftPane);
		this.add(rightPane);
		
	}

	protected void show(JScrollPane p) 
	{
		p.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		p.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 		
			
	}

}
