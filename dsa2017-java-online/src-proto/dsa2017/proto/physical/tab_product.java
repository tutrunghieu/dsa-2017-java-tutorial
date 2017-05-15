package dsa2017.proto.physical;

public class tab_product {
//	About a product:
//		1.	pcode (string): the code of the product (this should be unique for the product).
public String pcode;
	//		2.	pro_name (string): the name of the product.
public String pro_name;
//		3.	quantity (integer): the number of  products with the same code in a shop at beginning of a day.
public Integer quantity;
//		4.	saled (integer): the number of  products with the same code, which are saled in the day. Condition: saled ≤ quantity.
public Integer sale;
//		5.	price (double): The price of the product.
public Double price;

}
