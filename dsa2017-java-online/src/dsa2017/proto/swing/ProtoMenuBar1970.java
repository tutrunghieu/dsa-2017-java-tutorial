package dsa2017.proto.swing;

import java.awt.event.ActionEvent;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class ProtoMenuBar1970 {
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
