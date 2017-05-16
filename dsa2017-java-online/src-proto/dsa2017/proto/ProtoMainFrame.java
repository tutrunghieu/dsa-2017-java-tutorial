package dsa2017.proto;

import javax.swing.JFrame;

import dsa2017.swing.SwingMainFrame;

@SuppressWarnings("serial")
public class ProtoMainFrame  extends SwingMainFrame
{
	protected ProtoMenuBar menuBar;
	protected ProtoMainView mainView;

	public ProtoMainFrame() 
	{
		this.setLocation(50, 50);
		this.setSize(500, 700);
		this.setTitle("Swing Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menuBar = new ProtoMenuBar(this);
		mainView = new ProtoMainView(this);
	}

	public void clearMainView() 
	{
		mainView.setText("");
	}

	

}
