package dsa2017.day5.bst_dsw;

public class to_fold_the_tree {

	public static void main(String[] args)
	{
		SearchTreeDsw t = new SearchTreeDsw();
		t.addMany(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16);
		t.dump(true);
		
		t.fold();
		t.dump(true);
	}



}
