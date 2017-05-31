package apps.ltg;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import apps.MyFirstApp.utils.MenuFrame;
import apps.ltg.modules.LtgModuleGraph;
import apps.ltg.modules.LtgModuleList;
import apps.ltg.modules.LtgModuleTree;

@SuppressWarnings("serial")
public class LtgFrame extends MenuFrame 
{
	//GUI elements
	protected JTextArea mainView;
	protected JScrollPane mainOuter;
	
	//modules
	protected LtgModuleList menuFile = new LtgModuleList();
	protected LtgModuleTree menuEdit = new LtgModuleTree();
	protected LtgModuleGraph menuHelp = new LtgModuleGraph();
	
	//adding GUL elements
	public LtgFrame()
	{
		this.setTitle("Ltg");
		this.add(mainOuter = new JScrollPane(mainView = new JTextArea()));
		
		this.bind();
	}

	//binding GUI elements to target module
	private void bind() 
	{
		super.menuPut("list", newJMenu("List", 'L'));
		super.menuPut("list/new", newJMenuItem("New", 'N', KeyEvent.VK_1, ActionEvent.SHIFT_MASK | ActionEvent.CTRL_MASK), x -> menuFile.actionNew(x));
		super.menuPut("list/open", newJMenuItem("Open", 'O', KeyEvent.VK_2, ActionEvent.SHIFT_MASK | ActionEvent.CTRL_MASK), x -> menuFile.actionLoad(x));
		super.menuPut("list/save", newJMenuItem("Save", 'S', KeyEvent.VK_3, ActionEvent.SHIFT_MASK | ActionEvent.CTRL_MASK), x -> menuFile.actionSave(x));
		super.menuPut("list/***1", "");
		super.menuPut("list/add", newJMenuItem("Add", 'A', KeyEvent.VK_4, ActionEvent.SHIFT_MASK | ActionEvent.CTRL_MASK), x -> menuFile.actionAdd(x));
		super.menuPut("list/remove", newJMenuItem("Remove", 'R', KeyEvent.VK_5, ActionEvent.SHIFT_MASK | ActionEvent.CTRL_MASK), x -> menuFile.actionRemove(x));
		
		super.menuPut("tree", newJMenu("Tree", 'T'));
		super.menuPut("tree/new", newJMenuItem("New", 'N', KeyEvent.VK_1, ActionEvent.SHIFT_MASK), x -> menuEdit.actionNew(x));
		super.menuPut("tree/open", newJMenuItem("Open", 'O', KeyEvent.VK_2, ActionEvent.SHIFT_MASK), x -> menuEdit.actionLoad(x));
		super.menuPut("tree/save", newJMenuItem("Save", 'S', KeyEvent.VK_3, ActionEvent.SHIFT_MASK), x -> menuEdit.actionSave(x));
		super.menuPut("tree/***1", "");
		super.menuPut("tree/add", newJMenuItem("Add", 'A', KeyEvent.VK_4, ActionEvent.SHIFT_MASK), x -> menuEdit.actionAdd(x));
		super.menuPut("tree/remove", newJMenuItem("Remove", 'R', KeyEvent.VK_5, ActionEvent.SHIFT_MASK), x -> menuEdit.actionRemove(x));
		super.menuPut("tree/move", newJMenuItem("Move", 'V', KeyEvent.VK_6, ActionEvent.SHIFT_MASK), x -> menuEdit.actionMove(x));
		
		super.menuPut("graph", newJMenu("Graph", 'G'));
		super.menuPut("graph/new", newJMenuItem("New", 'N', KeyEvent.VK_1, ActionEvent.CTRL_MASK), x -> menuHelp.actionNew(x));
		super.menuPut("graph/open", newJMenuItem("Open", 'O', KeyEvent.VK_2, ActionEvent.CTRL_MASK), x -> menuHelp.actionOpen(x));
		super.menuPut("graph/save", newJMenuItem("Save", 'S', KeyEvent.VK_3, ActionEvent.CTRL_MASK), x -> menuHelp.actionSave(x));
		super.menuPut("graph/***1", "");
		super.menuPut("graph/add-node", newJMenuItem("Add node", 'A', KeyEvent.VK_4, ActionEvent.CTRL_MASK), x -> menuHelp.actionAddNode(x));
		super.menuPut("graph/remove-node", newJMenuItem("Remove node", 'R', KeyEvent.VK_5, ActionEvent.CTRL_MASK), x -> menuHelp.actionRemoveNode(x));
		super.menuPut("graph/move-node", newJMenuItem("Move node", 'V', KeyEvent.VK_6, ActionEvent.CTRL_MASK), x -> menuHelp.actionMoveNode(x));
		super.menuPut("graph/***2", "");
		super.menuPut("graph/add-link", newJMenuItem("Add link", 'D', KeyEvent.VK_7, ActionEvent.CTRL_MASK), x -> menuHelp.actionAddLink(x));
		super.menuPut("graph/remove-link", newJMenuItem("Remove link", 'L', KeyEvent.VK_8, ActionEvent.CTRL_MASK), x -> menuHelp.actionRemoveLink(x));
		
		super.menuDump();		
	}

	private static LtgFrame __frame;
	
	public static LtgFrame useFrame()
	{
		return __frame;
	}
	
	public static void main(String[] args) 
	{
		__frame = new LtgFrame();
		__frame.setVisible(true);
	}
	
}