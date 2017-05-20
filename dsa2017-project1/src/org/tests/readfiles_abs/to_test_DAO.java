package org.tests.readfiles_abs;

import java.util.List;

import org.CompanyName.project1.physical.Tab_Order;
import org.tests.readfiles.Res;

public class to_test_DAO {

	public static void main(String[] args) throws Exception
	{
		DataAccess d = new DataAccessJson(Res.getDesktopFile("dsa2017-data/1e2"));
//		d = new DataAccessXlsx(Res.getDesktopFile("dsa2017-data/1e2"));
//		d = new DataAccessLintex(Res.getDesktopFile("dsa2017-data/1e2"));
		
		List<Tab_Order> items = d.readList("orders", Tab_Order.class);
		
		items = items.subList(0, 10);
		d.writeList(items, Tab_Order.class);
	}

}
