package dsa2017.proto;

import java.awt.event.ActionEvent;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class ProtoAppMain1970 extends JFrame 
{
	protected JMenu newJMenu(String name, int key) 
	{
		JMenu res = new JMenu(name);
		res.setMnemonic(key);
		return res;
	}
	
	protected JMenuItem newJMenuItem(String name, int alt, int ctrl) 
	{
		JMenuItem res = new JMenuItem(name);		
		res.setMnemonic(alt);
		res.setAccelerator(KeyStroke.getKeyStroke(ctrl, ActionEvent.CTRL_MASK));		
		return res;
	}

}
