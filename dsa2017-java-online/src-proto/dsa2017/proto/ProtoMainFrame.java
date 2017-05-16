package dsa2017.proto;

import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import dsa2017.proto.controllers.Module_Edit;
import dsa2017.proto.controllers.Module_File;
import dsa2017.proto.controllers.Module_Help;
import dsa2017.swing.SwingMainFrame;
import dsa2017.swing.SwingMenuBar;

@SuppressWarnings("serial")
public class ProtoMainFrame  extends SwingMainFrame
{
	private static ProtoMainFrame __frame;
	
	public static ProtoMainFrame useFrame()
	{
		return __frame;
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
		  
		__frame = new ProtoMainFrame();

		__frame.setVisible(true);

	}
	
	
	protected JMenuBar menuBar;
	protected JMenu menu_file;
	protected JMenu menu_edit;
	protected JMenu menu_help;
	
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
		this.setJMenuBar(menuBar = new JMenuBar());
		
		menuBar.add(menu_file = SwingMenuBar.newJMenu("File", KeyEvent.VK_F, new Module_File()));
		menuBar.add(menu_edit = SwingMenuBar.newJMenu("Edit", KeyEvent.VK_E, new Module_Edit()));
		menuBar.add(menu_help = SwingMenuBar.newJMenu("Help", KeyEvent.VK_H, new Module_Help()));
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
