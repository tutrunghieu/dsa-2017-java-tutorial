package dsa2017.proto;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class ProtoAppMain extends JFrame {
	private JMenuBar menuBar;
	private JMenu menu_file;
	private JMenu menu_edit;
	private JMenu menu_help;
	private JMenuItem menu_file_new;
	private JMenuItem menu_file_open;
	private JMenuItem menu_file_save;
	private JMenuItem menu_file_save_as;
	private JTextArea mainView;
	private JScrollPane mainOuter;

	public ProtoAppMain() {
		this.setLocation(50, 50);
		this.setSize(400, 700);
		this.setTitle("Project 1");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.createMenuBar();
		this.createMainView();

	}

	private void createMenuBar() {
		this.setJMenuBar(menuBar = new JMenuBar());

		menuBar.add(menu_file = newJMenu("File", KeyEvent.VK_F));

		menuBar.add(menu_edit = new JMenu("Edit"));
		menu_edit.setMnemonic(KeyEvent.VK_E);

		menuBar.add(menu_help = new JMenu("Help"));
		menu_help.setMnemonic(KeyEvent.VK_H);

		menu_file.add(menu_file_new = newJMenuItem("New", KeyEvent.VK_N, KeyEvent.VK_N));
		menu_file.add(menu_file_open = newJMenuItem("Open", KeyEvent.VK_O, KeyEvent.VK_O));

		menu_file.addSeparator();
		menu_file.add(menu_file_save = newJMenuItem("Save", KeyEvent.VK_S, KeyEvent.VK_S));
		menu_file.add(menu_file_save_as = new JMenuItem("Save as..."));
	}

	private JMenu newJMenu(String name, int key) 
	{
		JMenu res = new JMenu(name);
		res.setMnemonic(key);
		return res;
	}
	
	private JMenuItem newJMenuItem(String name, int alt, int ctrl) 
	{
		JMenuItem res = new JMenuItem(name);		
		res.setMnemonic(alt);
		res.setAccelerator(KeyStroke.getKeyStroke(ctrl, ActionEvent.CTRL_MASK));		
		return res;
	}

	private void createMainView() {
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
