package dsa2017.probing4_bt;

public class to_test_bst_with_add_remove_contains {

	public static void main(String[] args) 
	{
		BST<String> s = new BST<String>();
		s.add("Anh");
		s.add("Nam");
		s.add("Binh");
		s.add("An");
		s.add("Bac");
		
		System.out.println(s.contains("An") + " inside " + s.toList());
		s.remove("An");	
		System.out.println(s.contains("An") + " inside " + s.toList());
	}

}
