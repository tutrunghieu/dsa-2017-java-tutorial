package dsa2017.proto.controllers;

import java.awt.event.ActionEvent;
import java.io.File;

public class File_Save extends __BaseModule {
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		useFrame().inspectEvent(arg0);
		useFrame().showSaveDialog(null, x -> saveFile(x));
		
	}

	private void saveFile(File x) 
	{
		System.out.println("Saving to " + x.getAbsolutePath());
	}
}
