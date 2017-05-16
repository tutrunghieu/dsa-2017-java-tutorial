package dsa2017.proto;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import dsa2017.proto.controllers.Module_Edit;
import dsa2017.proto.controllers.Module_File;
import dsa2017.proto.controllers.Module_Help;
import dsa2017.swing.SwingMenuBar;

public class ProtoMenuBar 
{
	protected JMenuBar menuBar;
	protected JMenu menu_file;
	protected JMenu menu_edit;
	protected JMenu menu_help;
	
	private Module_File target_file;
	private Module_Edit target_edit;
	private Module_Help target_help;
	
	public JMenuItem menu_edit_clear;
	public JMenuItem menu_edit_select_all;

	public JMenuItem menu_file_new;
	public JMenuItem menu_file_open;
	public JMenuItem menu_file_save;
	public JMenuItem menu_file_save_as;
	
	public JMenuItem menu_help_about;
	public JMenuItem menu_help_search;
	
	public ProtoMenuBar(JFrame f) 
	{
		addMenuBar(f);
	}


	public void addMenuBar(JFrame f) 
	{
		f.setJMenuBar(menuBar = new JMenuBar());		
		menuBar.add(menu_file = SwingMenuBar.newJMenu("File", KeyEvent.VK_F));
		menuBar.add(menu_edit = SwingMenuBar.newJMenu("Edit", KeyEvent.VK_E));
		menuBar.add(menu_help = SwingMenuBar.newJMenu("Help", KeyEvent.VK_H));
		
		target_file = new Module_File();
		target_edit = new Module_Edit();
		target_help = new Module_Help();
	
		addMenuFile();
		addMenuEdit();
		addMenuHelp();	
	}
	
	
	public JMenu addMenuFile() 
	{
		menu_file.add(menu_file_new = SwingMenuBar.newJMenuItem("New", KeyEvent.VK_N, KeyEvent.VK_N));
		menu_file.add(menu_file_open = SwingMenuBar.newJMenuItem("Open", KeyEvent.VK_O, KeyEvent.VK_O));

		menu_file.addSeparator();
		menu_file.add(menu_file_save = SwingMenuBar.newJMenuItem("Save", KeyEvent.VK_S, KeyEvent.VK_S));
		menu_file.add(menu_file_save_as = SwingMenuBar.newJMenuItem("Save as...", KeyEvent.VK_A, KeyEvent.VK_F12) );
		
		menu_file_new.addActionListener(x -> target_file.action_file_new());
		menu_file_open.addActionListener(x -> target_file.action_file_open());
		menu_file_save.addActionListener(x -> target_file.action_file_save());
		
		return menu_file;
	}
	
	public JMenu addMenuEdit() 
	{
		menu_edit.add(menu_edit_clear = SwingMenuBar.newJMenuItem("Clear", KeyEvent.VK_C, KeyEvent.VK_L));
		menu_edit.add(menu_edit_select_all = SwingMenuBar.newJMenuItem("Select all", KeyEvent.VK_A, KeyEvent.VK_A));
		
		
		menu_edit_clear.addActionListener(x -> target_edit.action_help_about());
		menu_edit_select_all.addActionListener(x -> target_edit.action_help_search());
		
		return menu_edit;
	}
	
	public JMenu addMenuHelp() 	
	{
		menu_help.add(menu_help_about = SwingMenuBar.newJMenuItem("About", KeyEvent.VK_A, KeyEvent.VK_F1));
		menu_help.add(menu_help_search = SwingMenuBar.newJMenuItem("Search", KeyEvent.VK_S, KeyEvent.VK_F2));

		menu_help_about.addActionListener(x -> target_help.action_help_about());
		menu_help_search.addActionListener(x -> target_help.action_help_search());

		return menu_help;
	}

	
}
