package apps.saleman;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import apps.saleman.physical.Tab_Customer;
import apps.saleman.physical.Tab_Order;

public class ModuleOrder 
{
	public File dataFile;
	private List<Tab_Order> items;
	//Order list:
	//3.1.      Input data
	public void inputData() throws Exception
	{
		items = readList(dataFile, Tab_Order.class);		
	}
	//3.2.  Display data with total value
	public void displayDataWithTotal()
	{
		for(Tab_Order ik: items)
		System.out.println(ik.ccode 
				+ "|" + ik.pcode
				+ "|" + ik.quantity);
	}
	
	public void displayFigure(String t)
	{
		SwingUtils.showData(t, items);		
	}
	
	//3.3.      Sort  by pcode and ccode
	public void sortBy_pcode_and_ccode()
	{
		Collections.sort(items, (x, y) -> pcode_then_code(x, y));		
		this.displayDataWithTotal();
	}
	

	private int pcode_then_code(Tab_Order x, Tab_Order y)
	{
		int d = x.pcode.compareTo(y.pcode);
		if(d != 0) return d;
		
		return x.ccode.compareTo(y.ccode);
	}
	
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
	protected static<T1> List<T1> readList(File f, Class<T1> cl) throws Exception
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
