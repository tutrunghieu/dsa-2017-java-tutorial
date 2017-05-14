package dsa2017.proto;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import dsa2017.proto.swing.ProtoMenuBar1970;

public class ProtoMenuBar extends ProtoMenuBar1970
{
	public JMenuBar menuBar;
	public JMenu menu_file;
	public JMenu menu_edit;
	public JMenu menu_help;
	public JMenuItem menu_file_new;
	public JMenuItem menu_file_open;
	public JMenuItem menu_file_save;
	public JMenuItem menu_file_save_as;
	public JMenuItem menu_help_about;
	public JMenuItem menu_help_search;
	public JMenuItem menu_edit_clear;
	public JMenuItem menu_edit_select_all;

	public void createMenuBar(JFrame f) 
	{
		f.setJMenuBar(menuBar = new JMenuBar());

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
		
		menu_edit.add(menu_edit_clear = newJMenuItem("Clear", KeyEvent.VK_C, KeyEvent.VK_L));
		menu_edit.add(menu_edit_select_all = newJMenuItem("Select all", KeyEvent.VK_A, KeyEvent.VK_A));
		
		menu_help.add(menu_help_about = newJMenuItem("About", KeyEvent.VK_A, KeyEvent.VK_F1));
		menu_help.add(menu_help_search = newJMenuItem("Search", KeyEvent.VK_S, KeyEvent.VK_F2));
	}	
}
