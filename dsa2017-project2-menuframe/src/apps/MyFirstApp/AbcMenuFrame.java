package apps.MyFirstApp;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import apps.MyFirstApp.modules.AbcModuleEdit;
import apps.MyFirstApp.modules.AbcModuleFile;
import apps.MyFirstApp.modules.AbcModuleHelp;
import apps.MyFirstApp.utils.MenuFrame;

@SuppressWarnings("serial")
public class AbcMenuFrame extends MenuFrame 
{
	protected AbcModuleFile menuFile = new AbcModuleFile();
	protected AbcModuleEdit menuEdit = new AbcModuleEdit();
	protected AbcModuleHelp menuHelp = new AbcModuleHelp();
	
	public AbcMenuFrame()
	{
		super.menuPut("file", newJMenu("File", 'F'));
		super.menuPut("file/new", newJMenuItem("New", 'N', 'N'), x -> menuFile.actionFileNew(x));
		super.menuPut("file/open", newJMenuItem("Open", 'O', 'O'), x -> menuFile.actionFileOpen(x));
		super.menuPut("file/save", newJMenuItem("Save", 'S', 'S'), x -> menuFile.actionFileSave(x));
		
		super.menuPut("edit", newJMenu("Edit", 'E'));
		super.menuPut("edit/copy", newJMenuItem("Copy", 'C', 'C'), x -> menuEdit.actionEditCopy(x));
		super.menuPut("edit/cut", newJMenuItem("Cut", 'u', 'X'), x -> menuEdit.actionEditCut(x));
		super.menuPut("edit/paste", newJMenuItem("Paste", 'p', 'V'), x -> menuEdit.actionEditPaste(x));
		
		super.menuPut("help", newJMenu("Help", 'H'));
		super.menuPut("help/started", newJMenuItem("Getting started", 'G', KeyEvent.VK_F1), x -> menuHelp.actionHelpStarted(x));
		super.menuPut("help/index", newJMenuItem("Index", 'I', KeyEvent.VK_F1, ActionEvent.ALT_MASK), x -> menuHelp.actionHelpIndex(x));
		super.menuPut("help/about", newJMenuItem("About", 'A', KeyEvent.VK_F12), x -> menuHelp.actionHelpAbout(x));
		
		super.menuDump();
	}

}
