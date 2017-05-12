package dsa2017.day1.part4_double;

import dsa2017.day1.part3_single.MyList;

public class to_add_and_print {

	public static void main(String[] args) 
	{
		MyList2<String> items 
		  = new MyList2<String>();
		
		items.add("Anh---");
		items.add("Bình--");		
		items.add("Anh--");		
		items.add("Cường");		
		
		items.dump();
	}

}
