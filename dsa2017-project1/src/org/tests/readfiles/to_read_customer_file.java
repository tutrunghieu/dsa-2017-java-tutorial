package org.tests.readfiles;

import java.io.File;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

public class to_read_customer_file {

	//xem huong dan tai
	// https://docs.google.com/document/d/1jG4vWu3Bf-WjjAnQSlR7eAoMjxVMPhrh1Xycv1fihRc/edit?usp=sharing
	public static void main(String[] args)
	throws Exception
	{
		File f = getDesktopFile("dsa2017-data/1e2/customers.json");
		
		ObjectMapper m = new ObjectMapper();
		List<Object> kq = (List<Object>)m.readValue(f, Object.class);
		for(Object x: kq)
			System.out.println(x);
	}

	public static File getDesktopFile(String name)
	{
		return new File(System.getProperty("user.home") + "/Desktop/" + name);
	}	
}
