package apps.saleman;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import apps.saleman.services.MenuFrame;
import apps.saleman.services.Res;

@SuppressWarnings("serial")
public class AbcMainFrame extends MenuFrame 
{
	protected ModuleProduct menuProd = new ModuleProduct();
	protected ModuleCustomer menuCust = new ModuleCustomer();
	protected ModuleOrder menuOrd = new ModuleOrder();
	
	public AbcMainFrame()
	{
		this.setTitle("untitle");
		
		super.menuPut("prod", newJMenu("Product", 'P'));
		super.menuPut("prod/input", newJMenuItem("Input", 'I', 'I'),
				x -> menuProd.inputData());
		super.menuPut("prod/display", newJMenuItem("Display", 'D', 'D'), 
				x -> menuProd.displayDataSwing("products"));
		super.menuPut("prod/add", newJMenuItem("Add", 'A', 'A'), 
				x -> menuProd.addItem());
		
		super.menuPut("order", newJMenu("Order", 'O'));
		super.menuPut("order/input", newJMenuItem("Input", 'C', 'C'), 
				x -> menuOrd.inputData());
		super.menuPut("order/display", newJMenuItem("Display", 'u', 'X'), 
				x -> menuOrd.displayFigure("orders"));
		
		super.menuDump();
	}

	public static void main(String[] args) 
	{
		AbcMainFrame f = new AbcMainFrame();
		f.menuProd.dataFile = Res.getDesktopFile("dsa2017-data/1e2/products.json");
		f.menuOrd.dataFile = Res.getDesktopFile("dsa2017-data/1e2/orders.json");
		
		f.setVisible(true);
	}
	
}
