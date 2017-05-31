package apps.saleman;

public class to_test_order_module {

	public static void main(String[] args) throws Exception
	{
		ModuleOrder m = new ModuleOrder();
		m.dataFile = Res.getDesktopFile("dsa2017-data/1e2/orders.json");
		
		m.inputData();
		m.displayDataWithTotal();
		m.displayFigure("before");
		
		m.sortBy_pcode_and_ccode();
		m.displayFigure("after");
	}

}
