package dsa2017.probing5_menuframe;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

@SuppressWarnings("serial")
public class MenuFrame extends JFrame {

	protected MenuFrameNode root = new MenuFrameNode();

	public MenuFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("menu frame");
		this.setSize(320, 200);
		this.setLocationRelativeTo(null);
		
		root.object = new JMenuBar();
		this.setJMenuBar((JMenuBar)root.object);
	}

	public<T1> T1 put(String path, T1 src) 
	{
		MenuFrameNode cur = root;
		for(String pk: path.split("\\/+")) 
		{
			cur = cur.findOrInsert(pk);
		}
		
		cur.object = src;
		return src;
	}

	public void dump() 
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
