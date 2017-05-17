package org.DungChung;

import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.JMenuItem;

public interface SwingActionListener extends ActionListener 
{
	void setActionParams(JMenuItem mj, Class<? extends SwingActionListener> cj, Field fj);
}
