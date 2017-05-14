package dsa2017.proto;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import dsa2017.swing.SwingMainFrame;

@SuppressWarnings("serial")
public class ProtoMainFrame  extends SwingMainFrame
{
	protected ProtoMenuBar menuBar;
	protected JTextArea mainView;
	protected JScrollPane mainOuter;
	

	public ProtoMainFrame() 
	{
		this.setLocation(50, 50);
		this.setSize(400, 700);
		this.setTitle("Swing Sample");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		this.createMenuBar();
		this.createMainView();
	}


	private void createMenuBar() 
	{
		menuBar = new ProtoMenuBar();
		menuBar.createMenuBar(this);
		menuBar.bind();		
	}


	private void createMainView() 
	{
		this.add(mainOuter = new JScrollPane(mainView = new JTextArea()));

		for (int k = 0; k < 1000; k++)
			mainView.append("Line " + k + "\r\n");
	}



	public void clearMainView() 
	{
		mainView.setText("");
	}

	public void selectMainView() 
	{
		mainView.selectAll();
	}

}
