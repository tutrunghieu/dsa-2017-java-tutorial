package dsa2017.proto.controllers;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import dsa2017.swing.SwingMenuProvider;
import dsa2017.swing.SwingMenuBar;

public class Module_File extends __BaseModule implements SwingMenuProvider
{

	public JMenuItem menu_file_new;
	public JMenuItem menu_file_open;
	public JMenuItem menu_file_save;
	public JMenuItem menu_file_save_as;
	
	public JMenu addMenu(JMenu menu_file) 
	{
		menu_file.add(menu_file_new = SwingMenuBar.newJMenuItem("New", KeyEvent.VK_N, KeyEvent.VK_N));
		menu_file.add(menu_file_open = SwingMenuBar.newJMenuItem("Open", KeyEvent.VK_O, KeyEvent.VK_O));

		menu_file.addSeparator();
		menu_file.add(menu_file_save = SwingMenuBar.newJMenuItem("Save", KeyEvent.VK_S, KeyEvent.VK_S));
		menu_file.add(menu_file_save_as = SwingMenuBar.newJMenuItem("Save as...", KeyEvent.VK_A, KeyEvent.VK_F12) );
		
		menu_file_new.addActionListener(x -> this.action_file_new());
		menu_file_open.addActionListener(x -> this.action_file_open());
		menu_file_save.addActionListener(x -> this.action_file_save());
		
		return menu_file;
	}

	private void action_file_new() {
		useFrame().showColorDialog(x -> newFile(x));
		
	}

	private void newFile(Color x) 
	{
		System.out.println("You have selected " + x);
	}
	
	private void action_file_open() {
		useFrame().showOpenDialog(x -> openFile(x));		
	}

	private void openFile(File x) 
	{
		System.out.println("You have selected " + x.getAbsolutePath());
	}
	
	private void action_file_save() {
	useFrame().showSaveDialog(null, x -> saveFile(x));

}

private void saveFile(File x) 
{
	System.out.println("Saving to " + x.getAbsolutePath());
}	
}
