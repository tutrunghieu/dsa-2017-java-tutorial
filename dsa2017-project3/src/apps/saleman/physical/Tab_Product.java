package apps.saleman.physical;

//About a product:
//1.	pcode (string): the code of the product (this should be unique for the product).
//2.	pro_name (string): the name of the product.
//3.	quantity (integer): the number of  products with the same code in a shop at beginning of a day.
//4.	saled (integer): the number of  products with the same code, which are saled in the day. Condition: saled ≤ quantity.
//5.	price (double): The price of the product.
public class Tab_Product 
{
	@Override
	public String toString() {
		return "Tab_Product [pcode=" + pcode + ", pro_name=" + pro_name + ", quantity=" + quantity + ", sale=" + sale
				+ ", price=" + price + "]";
	}
	public String pcode;
	public String pro_name;
	public Integer quantity;
	public Integer sale;
	public Double price;
	public String pro_image_url;
}
