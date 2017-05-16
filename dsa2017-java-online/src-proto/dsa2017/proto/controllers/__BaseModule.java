package dsa2017.proto.controllers;

import dsa2017.proto.ProtoAppMain;
import dsa2017.proto.ProtoMainFrame;

public class __BaseModule  {
	

	public static ProtoMainFrame useFrame()
	{
		return ProtoAppMain.useFrame();
	}

//	@Override
//	public void actionPerformed(ActionEvent arg0) 
//	{
//		useFrame().inspectEvent(arg0);		
//	}
//
//	@Override
//	public void setActionParams(JMenuItem mj, Class<? extends SwingActionListener> cj, Field fj) 
//	{
//		System.out.println(  mj.getText()  + " >> " + fj.getName() + " >> " + cj.getName());
//		
//	}

}
