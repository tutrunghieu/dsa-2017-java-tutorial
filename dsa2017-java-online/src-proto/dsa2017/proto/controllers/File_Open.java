package dsa2017.proto.controllers;

import java.awt.event.ActionEvent;
import java.io.File;

public class File_Open extends __BaseModule 
{
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		useFrame().inspectEvent(arg0);
		useFrame().showOpenDialog(x -> openFile(x));
		
	}

	private void openFile(File x) 
	{
		System.out.println("You have selected " + x.getAbsolutePath());
	}

}
