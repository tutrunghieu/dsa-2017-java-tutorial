package dsa2017.proto.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.JMenuItem;

public class SwingActionListener implements ActionListener
{
	public JMenuItem actionSource;
	public Class<?> actionTarget;
	public Field actionField;

	public SwingActionListener(JMenuItem mj, Class<?> cj, Field fj) {
		actionSource = mj;
		actionTarget = cj;
		actionField = fj;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("processing " + actionSource.getText() + "/" + actionField.getName());
		
		try {
			SwingBaseModule tar = (SwingBaseModule)actionTarget.newInstance();
			tar.setActionParams(e, this);
			tar.renderAction();
		}
		catch(Exception xp) 
		{
			xp.printStackTrace();
		}	
	}


}
