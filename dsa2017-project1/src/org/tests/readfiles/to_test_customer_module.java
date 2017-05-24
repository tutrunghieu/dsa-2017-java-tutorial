package org.tests.readfiles;

public class to_test_customer_module {

	public static void main(String[] args) 
	{
//		Customer list:
//			2.1.      Load data from file
//			2.2.      Input & add new item
//			2.3.      Display data
//			2.4.      Save customer list to file
//			2.5.      Search by ccode
//			2.6.      Delete by ccode
	
		Module_Customer m = new Module_Customer();
		m.readCustomer();
		m.showCustomer();
		m.writeCustomer();
		m.searchForCode("CST1234");
	}

}

