package apps.saleman.services;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


@SuppressWarnings("serial")
public class MenuFrame extends JFrame {

	protected MenuFrameNode root = new MenuFrameNode();

	public MenuFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(imageFromResource(MenuFrame.class, "icon.png"));
		this.setTitle("menu frame");
		this.setSize(640, 480);
		this.setLocationRelativeTo(null);
		
		root.object = new JMenuBar();
		this.setJMenuBar((JMenuBar)root.object);
	}

	public Image imageFromResource(Class<?> cl, String name) 
	{
		try {
			InputStream in = cl.getResourceAsStream(name);
			BufferedImage img = ImageIO.read(in);
			in.close();
			return img;
		}
		
		catch(Exception xp) { return null; }
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
				
//		System.out.println("root=" + root.hashCode());
//		System.out.println("par=" + par.hashCode());
//		System.out.println("cur=" + cur.hashCode());
		
		if(src instanceof String) 
		{
			javax.swing.JMenu t = (javax.swing.JMenu)par.object;
			t.addSeparator();
		}
		
		else if(src instanceof javax.swing.JMenu) 
		{
			javax.swing.JMenuBar t = (javax.swing.JMenuBar)root.object;
			t.add((javax.swing.JMenu)src);
		}
		
		else if(src instanceof javax.swing.JMenuItem) 
		{
			javax.swing.JMenu t = (javax.swing.JMenu)par.object;
			t.add((javax.swing.JMenuItem)src);
		}  
		
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

	public JMenu newJMenu(String name, int key) 
	{
		JMenu res = new JMenu(name);
		res.setMnemonic(key);
		return res;
	}
	
	public JMenuItem newJMenuItem(String name, int alt, int ctrl) 
	{
		return newJMenuItem(name, alt, ctrl, ActionEvent.CTRL_MASK);
	}
	
	public JMenuItem newJMenuItem(String name, int alt, int ctrl, int mask) 
	{
		JMenuItem res = new JMenuItem(name);		
		res.setMnemonic(alt);
		res.setAccelerator(KeyStroke.getKeyStroke(ctrl, mask));		
		return res;
	}	
}
