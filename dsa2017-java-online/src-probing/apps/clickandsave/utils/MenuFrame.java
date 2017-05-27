package apps.clickandsave.utils;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import apps.clickandsave.modules.AbcModuleFile;

@SuppressWarnings("serial")
public class MenuFrame extends JFrame {

	protected MenuFrameNode root = new MenuFrameNode();

	public MenuFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("menu frame");
		this.setSize(640, 480);
		this.setLocationRelativeTo(null);
		
		root.object = new JMenuBar();
		this.setJMenuBar((JMenuBar)root.object);
	}

	public JMenuItem menuPut(String string, JMenuItem menu, ActionListener lf) 
	{
		JMenuItem res = menuPut(string, menu);
		res.addActionListener(lf);
		return res;
	}
	
	public<T1> T1 menuPut(String path, T1 src) 
	{
		MenuFrameNode cur = root, par = root;
		
		for(String pk: path.split("\\/+")) 
		{
			par = cur;
			cur = cur.findOrInsert(pk);
		}
		
		System.out.println("root=" + root.hashCode());
		System.out.println("par=" + par.hashCode());
		System.out.println("cur=" + cur.hashCode());
		
		if(src instanceof javax.swing.JMenu) 
		{
			javax.swing.JMenuBar t = (javax.swing.JMenuBar)root.object;
			t.add((javax.swing.JMenu)src);
		}
		
		if(src instanceof javax.swing.JMenuItem) 
		try
		{
			javax.swing.JMenu t = (javax.swing.JMenu)par.object;
			t.add((javax.swing.JMenuItem)src);
		} catch(Exception xp) {} 
		
		cur.object = src;
		
		return src;
	}

	public void menuDump() 
	{
		dump(root, 0);
	}

	private void dump(MenuFrameNode p, int level) 
	{
		for(int k=0; k<level; k++) System.out.print("-- ");
		System.out.println(p.getText());
		
		for(String nk: p.keySet() ) dump(p.get(nk), level+1);
	}

}
