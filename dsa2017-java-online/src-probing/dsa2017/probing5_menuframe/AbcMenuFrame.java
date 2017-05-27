package dsa2017.probing5_menuframe;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class AbcMenuFrame extends MenuFrame 
{
	protected AbcModuleFile m1 = new AbcModuleFile();
	protected AbcModuleEdit m2 = new AbcModuleEdit();
	protected AbcModuleHelp m3 = new AbcModuleHelp();
	
	public AbcMenuFrame()
	{
		super.put("file", new JMenu("File"));
		super.put("file/new", new JMenuItem("New"));
		super.put("file/open", new JMenuItem("Open"));
		super.put("file/save", new JMenuItem("Save"));
		
		super.dump();
	}

}
