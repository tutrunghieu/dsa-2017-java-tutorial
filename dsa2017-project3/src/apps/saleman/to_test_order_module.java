package apps.saleman;

public class to_test_order_module {

	public static void main(String[] args) 
	{
		ModuleOrder m = new ModuleOrder();
		m.dataFile = Res.getDesktopFile("dsa2017-data/1e2/orders.txt");
		
		m.inputData();
		m.displayDataWithTotal();
		m.sortBy_pcode_and_ccode();
	}

}
