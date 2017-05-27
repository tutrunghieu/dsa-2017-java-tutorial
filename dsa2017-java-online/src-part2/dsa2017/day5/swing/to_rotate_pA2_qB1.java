package dsa2017.day5.swing;

public class to_rotate_pA2_qB1
{

	public static void main(String[] args) 
	{
		AvlFramework fw = new AvlFramework();
		
//		fw.run(new int[]{ 4, 3, 10, 12, 8, 7 },
//				x -> x.rotate_pA2_qB1(x.getRoot() ) );
		
		fw.run(new int[]{ 4, 1, 2, 3, 7, 0 },
				x -> { x.rotate_pB2_qA1(x.getRoot()); });
	}
	
}
