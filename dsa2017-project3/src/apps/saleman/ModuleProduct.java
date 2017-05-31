package apps.saleman;

import java.io.File;
import java.util.List;

import apps.saleman.physical.Tab_Product;
import apps.saleman.services.Json;
import apps.saleman.services.SwingUtils;

public class ModuleProduct {
public File dataFile;
private List<Tab_Product> items;

	//	Product list:
//		1.1.      Load data from file
	public void inputData() throws Exception
	{
		items = Json.readList(dataFile, Tab_Product.class);				
	}
//		1.2.      Input & add new item
	public void addItem(Tab_Product t) {
		items.add(t);
	}
//		1.3.      Display data
	public void displayData() {
		for(Tab_Product ik: items)
		System.out.println(ik);	
	}	
	
	public void displayDataSwing(String t) 
	{
		SwingUtils.showData(t, items);			}	

//		1.4.      Save product list to file
	public void saveData() {}	
//		1.5.      Search by pcode
	public void searchBy_pcode() {}	

//		1.6.      Delete by pcode
	public void deleteBy_pcode(String pcode) 
	{
		Tab_Product f = null;
		for(Tab_Product ik: items)
			if(pcode.equals(ik.pcode)) 
			{
				f = ik; break;
			}
		if(f != null) items.remove(f);
	}	
	
//		1.7.      Sort by pcode
	public void sortBy_pcode() {}	
	
//		1.8.      Delete the node after the node having code = xCode
	public void deleteAfter_pcode() {}	

}
