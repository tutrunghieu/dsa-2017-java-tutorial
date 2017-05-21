package dsa2017.utils;

import java.io.File;

public class Res {

	public static File getDesktopFile(String name)
	{
		return new File(System.getProperty("user.home") + "/Desktop/" + name);
	}

	public static int code(Object src) 
	{
		if(src == null) return 0;
		return src.hashCode();
	}
}
