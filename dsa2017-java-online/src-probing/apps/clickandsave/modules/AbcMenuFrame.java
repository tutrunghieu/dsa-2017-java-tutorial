package apps.clickandsave.modules;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import apps.clickandsave.MenuFrame;

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
