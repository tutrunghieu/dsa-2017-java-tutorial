package dsa2017.day5.swing.befaf;

import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class LeftRightFrame extends JFrame
{
	protected JScrollPane leftPane;
	protected JComponent leftView;
	protected JScrollPane rightPane;
	protected JPictureBox rightView;

	public LeftRightFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("menu frame");
		this.setSize(640, 480);
		this.setLocationRelativeTo(null);
		
		this.createInnerContent();
	}

	protected void createInnerContent() 
	{
		leftPane = new JScrollPane(leftView = new JPictureBox());
		show(leftPane);
		rightPane = new JScrollPane(rightView = new JPictureBox());
		show(rightPane);
		
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
