package apps.saleman.services;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Res {

	public static final boolean IGNORE = false;

	public static File getDesktopFile(String name)
	{
		return new File(System.getProperty("user.home") + "/Desktop/" + name);
	}

	public static int code(Object src) 
	{
		if(src == null) return 0;
		return src.hashCode();
	}

	public static<T1> List<Integer> codeList(Collection<T1> c) 
	{
		List<Integer> res = new ArrayList<Integer>();
		for(T1 ck: c) res.add(ck.hashCode());
		return res;
	}
}
