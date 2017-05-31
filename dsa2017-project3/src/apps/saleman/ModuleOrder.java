package apps.saleman;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import apps.saleman.physical.Tab_Customer;
import apps.saleman.physical.Tab_Order;
import apps.saleman.services.Json;
import apps.saleman.services.Res;
import apps.saleman.services.SwingUtils;

public class ModuleOrder 
{
	public File dataFile;
	private List<Tab_Order> items;
	//Order list:
	//3.1.      Input data
	public void inputData() throws Exception
	{
		items = Json.readList(dataFile, Tab_Order.class);		
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
		

}
