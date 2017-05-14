package dsa2017.proto;

import javax.swing.BorderFactory;
import javax.swing.UIManager;

public class ProtoAppMain 
{
	private static ProtoMainFrame __frame;
	
	public static ProtoMainFrame useFrame()
	{
		return __frame;
	}
	
	public static void main(String[] args) throws Exception 
	{
//		UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//		UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");	
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
//		UIManager.put("Menu.border", BorderFactory.createLineBorder(Color.gray, 1));
		UIManager.put("MenuBar.border", BorderFactory.createCompoundBorder() );
//		UIManager.put("MenuItem.border", BorderFactory.createLineBorder(Color.gray, 1));		
		  
		__frame = new ProtoMainFrame();

		__frame.setVisible(true);

	}
	

}
