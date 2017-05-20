package org.tests.readfiles_abs;

import java.io.File;
import java.util.List;

public abstract class DataAccess
{
	protected File root;

	public DataAccess(File r) 
	{
		root = r;
	}

	public abstract<T1> List<T1> readList(Class<T1> cl); 

	public abstract<T1> void writeList(List<T1> items); 
}
