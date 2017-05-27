package dsa2017.day5.swing;

import dsa2017.utils.Res;

public class to_test_simple_rotation
{

	public static void main(String[] args) 
	{
		AvlFramework fw = new AvlFramework();
		
		if(Res.IGNORE)
		fw.run(new int[]{ 4, 3, 10, 12, 8, 14, 11 }, x -> x.rotate_R2_R1(x.getRoot() ) );
	
		if(Res.IGNORE)
		fw.run(new int[]{ 4, 2, 1, 3, 7, 0 }, x -> { x.rotate_L2_L1(x.getRoot()); });
		
		if(Res.IGNORE)
		fw.run(new int[]{ 4, 1, 2, 3, 7, 0 }, x -> { x.rotate_L2_R1(x.getRoot()); });

		if(Res.IGNORE)
		fw.run(new int[]{ 4, 1, 10, 7, 5, 12 }, x -> { x.rotate_R2_L1(x.getRoot()); });
	}
	
}
