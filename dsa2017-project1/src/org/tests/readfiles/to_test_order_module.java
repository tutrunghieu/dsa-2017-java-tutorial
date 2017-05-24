package org.tests.readfiles;

public class to_test_order_module {

	public static void main(String[] args)
	{
//		Order list:
//			3.1.      Input data
//			3.2.      Display data with total value
//			3.3.      Sort  by pcode and ccode
		
		Module_Order m = new Module_Order();
		m.readOrders();
		m.displayTotal();
		m.sortOrderByKey();

	}

}
