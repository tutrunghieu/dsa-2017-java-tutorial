package dsa2017.utils;

import java.io.File;

public class Res {

	public static File getDesktopFile(String name)
	{
		return new File(System.getProperty("user.home") + "/Desktop/" + name);
	}
}
