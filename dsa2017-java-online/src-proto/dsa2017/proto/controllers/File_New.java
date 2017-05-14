package dsa2017.proto.controllers;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.File;

public class File_New extends __BaseModule 
{
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		useFrame().inspectEvent(arg0);
		useFrame().showColorDialog(x -> newFile(x));
		
	}

	private void newFile(Color x) 
	{
		System.out.println("You have selected " + x);
	}
}
