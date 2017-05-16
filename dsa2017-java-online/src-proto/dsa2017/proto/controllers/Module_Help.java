package dsa2017.proto.controllers;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import dsa2017.swing.SwingMenuProvider;
import dsa2017.swing.SwingMenuBar;

public class Module_Help implements SwingMenuProvider
{
	public JMenuItem menu_help_about;
	public JMenuItem menu_help_search;
	
	public JMenu addMenu(JMenu menu_help) 
	{
		menu_help.add(menu_help_about = SwingMenuBar.newJMenuItem("About", KeyEvent.VK_A, KeyEvent.VK_F1));
		menu_help.add(menu_help_search = SwingMenuBar.newJMenuItem("Search", KeyEvent.VK_S, KeyEvent.VK_F2));
		
		menu_help_about.addActionListener(x -> this.action_help_about());
		menu_help_search.addActionListener(x -> this.action_help_search());
		
		return menu_help;
	}

	private void action_help_about() {
	}
	
	private void action_help_search() {
	}
}
