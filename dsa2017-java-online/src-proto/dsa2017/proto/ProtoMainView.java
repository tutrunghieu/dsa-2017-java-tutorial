package dsa2017.proto;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ProtoMainView 
{
	protected JTextArea mainView;
	protected JScrollPane mainOuter;

	public ProtoMainView(JFrame f) 
	{
		f.add(mainOuter = new JScrollPane(mainView = new JTextArea()));

			for (int k = 0; k < 1000; k++)
				mainView.append("Line " + k + "\r\n");
	}

	public void setText(String s) 
	{
		mainView.setText(s);		
	}

}
