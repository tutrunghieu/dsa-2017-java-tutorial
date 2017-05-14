package dsa2017.proto;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import dsa2017.proto.swing.ProtoAppMain1970;

@SuppressWarnings("serial")
public class ProtoAppMain extends ProtoAppMain1970 
{
	protected ProtoMenuBar menuBar;
	protected JTextArea mainView;
	protected JScrollPane mainOuter;
	

	public ProtoAppMain() 
	{
		this.setLocation(50, 50);
		this.setSize(400, 700);
		this.setTitle("Project 1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuBar = new ProtoMenuBar();
		menuBar.createMenuBar(this);
		
		this.createMainView();
	}


	private void createMainView() 
	{
		this.add(mainOuter = new JScrollPane(mainView = new JTextArea()));

		for (int k = 0; k < 1000; k++)
			mainView.append("Line " + k + "\r\n");

	}

	public static void main(String[] args) throws Exception 
	{
//		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");	
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
//		UIManager.put("Menu.border", BorderFactory.createLineBorder(Color.gray, 1));
		UIManager.put("MenuBar.border", BorderFactory.createCompoundBorder() );
//		UIManager.put("MenuItem.border", BorderFactory.createLineBorder(Color.gray, 1));		
		  
		ProtoAppMain m = new ProtoAppMain();

		m.setVisible(true);

	}

}
