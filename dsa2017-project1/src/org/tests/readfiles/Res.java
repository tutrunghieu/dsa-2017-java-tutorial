package org.tests.readfiles;

import java.io.File;

public class Res {

	public static File getDesktopFile(String name)
	{
		return new File(System.getProperty("user.home") + "/Desktop/" + name);
	}	
}
