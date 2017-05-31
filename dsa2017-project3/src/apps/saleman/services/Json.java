package apps.saleman.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import apps.saleman.physical.Tab_Customer;

public class Json {
	//xem huong dan tai
	// https://docs.google.com/document/d/1jG4vWu3Bf-WjjAnQSlR7eAoMjxVMPhrh1Xycv1fihRc/edit?usp=sharing
	public static void main(String[] args) throws Exception
	{
		File f = Res.getDesktopFile("dsa2017-data/1e2/customers.json");

//		List<Object> kq = readList(f);
//		for(Object x: kq) System.out.println(x);
	
		List<Tab_Customer> kq = readList(f, Tab_Customer.class);
		for(Tab_Customer x: kq)
			System.out.println(x.cus_name + " | " + x.phone);
		
		f = Res.getDesktopFile("test1.json");
		writeList(f, kq.subList(0, 5));
	}
	


	@SuppressWarnings("unchecked")
	public static<T1> List<T1> readList(File f, Class<T1> cl) throws Exception
	{
		List<T1> items = new ArrayList<T1>();
		
		for(Object s: readList(f))
		{
			Map<String, Object> sjj = (Map<String, Object>)s;
			T1 tjj = cl.newInstance();
			for(String k: sjj.keySet()) 
			{
				Object vk = sjj.get(k);
				cl.getField(k).set(tjj, vk);
			}
			
			items.add(tjj);
		}
		
		return items;
	}
	
	private static<T1> void writeList(File f, List<T1> items) throws Exception 
	{
		ObjectMapper m = new ObjectMapper();
		m.writeValue(f, items);				
	}
	
	@SuppressWarnings("unchecked")
	private static List<Object> readList(File f) throws Exception
	{
		ObjectMapper m = new ObjectMapper();
		return (List<Object>)m.readValue(f, Object.class);
	}


}
