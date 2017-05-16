package dsa2017.probing2_frame;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import dsa2017.swing.SwingMainFrame;
import dsa2017.utils.Res;

@SuppressWarnings("serial")
public class BucketFrame extends SwingMainFrame 
{
	protected BucketView mainView;
	
	protected BucketModule_File moduleFile;
	protected BucketModule_Edit moduleEdit;

	protected JMenuBar menuBar;
	protected JMenu menu_file;
	protected JMenu menu_edit;

	private JMenuItem menu_file_open;
	private JMenuItem menu_file_save;

	private JMenuItem menu_edit_color;
	private JMenuItem menu_edit_undo;
	
	
	public BucketFrame() 
	{
		this.setLocation(50, 50);
		this.setSize(800, 600);
		this.setTitle("Bucket");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.add( mainView = createBucketView() );
		this.setJMenuBar(menuBar = createMenuBar());
		
		this.bind();
	}

	private void bind() 
	{
		menu_file_open.addActionListener(x -> moduleFile.action_file_open(x));
		menu_file_save.addActionListener(x -> moduleFile.action_file_save(x));
		
		menu_edit_color.addActionListener(x -> moduleEdit.action_edit_color(x));		
		menu_edit_undo.addActionListener(x -> moduleEdit.action_edit_undo(x));		
		
		mainView.addMouseClickListener(x -> moduleEdit.action_edit_fill(x));
	}

	private BucketView createBucketView() 
	{
		BucketView res = new BucketView();
		
		try { res.setImage(Res.getDesktopFile("input.png")); }
		catch(Exception xp) { xp.printStackTrace(); }

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
		res.add(menu_file_open = new JMenuItem("Load"));
		res.add(menu_file_save = new JMenuItem("Save"));
		return res;
	}
	
	private JMenu createMenuEdit() 
	{
		JMenu res = new JMenu("Edit");
		res.add(menu_edit_color = new JMenuItem("Color"));
		res.add(menu_edit_undo = new JMenuItem("Undo"));
		return res;
	}


	public static void main(String[] args) 
	{
		BucketFrame f = new BucketFrame();
		f.setVisible(true);
	}

}
