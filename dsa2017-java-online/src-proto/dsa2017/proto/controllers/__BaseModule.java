package dsa2017.proto.controllers;

import java.awt.event.ActionEvent;

import dsa2017.proto.ProtoAppMain;
import dsa2017.proto.ProtoMainFrame;
import dsa2017.swing.SwingActionListener;
import dsa2017.swing.SwingBaseModule;

public class __BaseModule implements SwingBaseModule {

	public static ProtoMainFrame useFrame()
	{
		return ProtoAppMain.useFrame();
	}

	
	@Override
	public void setActionParams(ActionEvent x1, SwingActionListener x2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void renderAction() {
		// TODO Auto-generated method stub
		
	}

}
