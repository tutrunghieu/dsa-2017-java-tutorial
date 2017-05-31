package apps.saleman.physical;

//About ordering:
//1.	pcode (string): the code of the product to be ordered.
//2.	ccode (string): the code of the customer.
//3.	quantity (integer): the number of  ordered products.
public class Tab_Order {
@Override
	public String toString() {
		return "Tab_Order ["
				+ "pcode=" + pcode
				+ ", ccode=" + ccode
				+ ", quantity=" + quantity + "]";
	}
public String pcode;
public String ccode;
public Integer quantity;

}
