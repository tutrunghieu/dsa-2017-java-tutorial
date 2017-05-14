package dsa2017.proto.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.JMenuItem;

import dsa2017.proto.ProtoAppMain;
import dsa2017.proto.ProtoMainFrame;
import dsa2017.swing.SwingBaseModule;

public class __BaseModule implements SwingBaseModule {

	public static ProtoMainFrame useFrame()
	{
		return ProtoAppMain.useFrame();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setActionParams(JMenuItem mj, Class<? extends ActionListener> cj, Field fj) {
		// TODO Auto-generated method stub
		
	}

}
