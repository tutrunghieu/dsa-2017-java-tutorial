package dsa2017.day5.bst_dsw;

public class to_fold_the_tree {

	public static void main(String[] args)
	{
		SearchTreeDsw t = new SearchTreeDsw();
		t.addMany(1, 2, 3, 4, 5, 6, 7);
		
		//t.dump(true);
		t.fold(4);
		//t.dump(true);
	}



}
