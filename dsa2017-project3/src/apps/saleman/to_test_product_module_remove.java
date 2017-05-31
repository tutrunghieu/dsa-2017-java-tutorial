package apps.saleman;

import apps.saleman.physical.Tab_Product;
import apps.saleman.services.Res;

public class to_test_product_module_remove {

	public static void main(String[] args) throws Exception 
	{
		ModuleProduct m = new ModuleProduct();
		m.dataFile = Res.getDesktopFile("dsa2017-data/1e2/products.json");
		
		m.inputData();
	
		m.deleteBy_pcode("PRDVSl0WFS");
		m.displayData();	
		m.displayDataSwing("after adding");
	}

	private static Tab_Product getSwingProduct() {
		Tab_Product t = new Tab_Product();
		t.pcode = "abc";
		t.pro_name = "thu them";
		t.price = 1234.0;
		return t;
	}

}
