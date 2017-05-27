package apps.clickandsave;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import apps.clickandsave.modules.AbcModuleEdit;
import apps.clickandsave.modules.AbcModuleFile;
import apps.clickandsave.modules.AbcModuleHelp;
import apps.clickandsave.utils.MenuFrame;

@SuppressWarnings("serial")
public class AbcMenuFrame extends MenuFrame 
{
	protected AbcModuleFile menuFile = new AbcModuleFile();
	protected AbcModuleEdit menuEdit = new AbcModuleEdit();
	protected AbcModuleHelp menuHelp = new AbcModuleHelp();
	
	public AbcMenuFrame()
	{
		super.menuPut("file", new JMenu("File"));
		super.menuPut("file/new", new JMenuItem("New"), x -> menuFile.actionFileNew(x));
		super.menuPut("file/open", new JMenuItem("Open"), x -> menuFile.actionFileOpen(x));
		super.menuPut("file/save", new JMenuItem("Save"), x -> menuFile.actionFileSave(x));
		
		super.menuPut("edit", new JMenu("Edit"));
		super.menuPut("edit/copy", new JMenuItem("Copy"), x -> menuEdit.actionEditCopy(x));
		super.menuPut("edit/cut", new JMenuItem("Cut"), x -> menuEdit.actionEditCut(x));
		super.menuPut("edit/paste", new JMenuItem("Paste"), x -> menuEdit.actionEditPaste(x));
		
		super.menuPut("help", new JMenu("Help"));
		super.menuPut("help/started", new JMenuItem("Getting started"), x -> menuHelp.actionHelpStarted(x));
		super.menuPut("help/index", new JMenuItem("Index"), x -> menuHelp.actionHelpIndex(x));
		super.menuPut("help/about", new JMenuItem("About"), x -> menuHelp.actionHelpAbout(x));
		
		super.menuDump();
	}

}
