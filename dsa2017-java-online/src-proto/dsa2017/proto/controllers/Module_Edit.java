package dsa2017.proto.controllers;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import dsa2017.swing.SwingMenuProvider;
import dsa2017.swing.SwingMenuBar;

public class Module_Edit extends __BaseModule implements SwingMenuProvider
{
	public JMenuItem menu_edit_clear;
	public JMenuItem menu_edit_select_all;

	
	public JMenu addMenu(JMenu menu_edit) 
	{
		menu_edit.add(menu_edit_clear = SwingMenuBar.newJMenuItem("Clear", KeyEvent.VK_C, KeyEvent.VK_L));
		menu_edit.add(menu_edit_select_all = SwingMenuBar.newJMenuItem("Select all", KeyEvent.VK_A, KeyEvent.VK_A));
		
		
		menu_edit_clear.addActionListener(x -> this.action_help_about());
		menu_edit_select_all.addActionListener(x -> this.action_help_search());
		
		return menu_edit;
	}

	private void action_help_about() {
		useFrame().clearMainView();		
	}
	
	private void action_help_search() {
	}
}
