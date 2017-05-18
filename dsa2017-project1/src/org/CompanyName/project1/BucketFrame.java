package org.CompanyName.project1;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.services.SwingMainFrame;
import org.services.SwingUtils;

@SuppressWarnings("serial")
public class BucketFrame extends SwingMainFrame 
{
	public static void main(String[] args) 
	{
		__frame = new BucketFrame();
		__frame.setVisible(true);
	}

	public static BucketFrame useFrame() 
	{
		return (BucketFrame)__frame;		
	}
	
	
	protected BucketModule_File module_file;
	protected BucketModule_Edit module_edit;
	
	protected BucketView main_view;

	protected JMenuBar menu_bar;
	protected JMenu menu_file;
	protected JMenu menu_edit;

	private JMenuItem menu_file_open;
	private JMenuItem menu_file_save;

	private JMenuItem menu_edit_color;
	private JMenuItem menu_edit_undo;

	protected Color currentColor;

	
	public BucketFrame() 
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLocation(50, 50);
		this.setSize(800, 600);
		this.setTitle("Bucket");
		this.setIconImage(loadIcon());
		
		this.add( main_view = createMainView() );
		this.setJMenuBar(menu_bar = createMenuBar());
		
		module_file = new BucketModule_File();
		module_edit = new BucketModule_Edit();
		
		this.bind();
	}



	private void bind() 
	{
		menu_file_open.addActionListener(
				x -> module_file.action_file_open(x));
		menu_file_save.addActionListener(
				x -> module_file.action_file_save(x));
		
		menu_edit_color.addActionListener(
				x -> module_edit.action_edit_color(x));		
		menu_edit_undo.addActionListener(
				x -> module_edit.action_edit_undo(x));		
		
		main_view.addMouseListener(
				SwingUtils.newMouseClickListener(x -> module_edit.action_edit_fill(x)) );
	}

	private BucketView createMainView() 
	{
		BucketView res = new BucketView();
		
//		try { res.setImage(Res.getDesktopFile("input.png")); }
//		catch(Exception xp) { xp.printStackTrace(); }

		return res;
	}

	private JMenuBar createMenuBar() 
	{
		JMenuBar res = new JMenuBar();
		
		res.add(menu_file = createMenuFile());
		res.add(menu_edit = createMenuEdit());
		
		return res;
	}

	private JMenu createMenuFile() 
	{
		JMenu res = new JMenu("File");
		res.add(menu_file_open = SwingUtils.newJMenuItem("Load", KeyEvent.VK_L, KeyEvent.VK_L));

		res.add(menu_file_save = SwingUtils.newJMenuItem("Save", KeyEvent.VK_S, KeyEvent.VK_S));
		return res;
	}
	
	private JMenu createMenuEdit() 
	{
		JMenu res = new JMenu("Edit");
		res.add(menu_edit_color = new JMenuItem("Color"));
		res.add(menu_edit_undo = new JMenuItem("Undo"));
		return res;
	}



	
	public BucketView getMainView() {
		return main_view;
	}


	public Color getCurrentColor() 
	{
		return currentColor;
	}

}
