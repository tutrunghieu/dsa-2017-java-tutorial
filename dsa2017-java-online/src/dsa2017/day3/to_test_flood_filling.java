package dsa2017.day3;

public class to_test_flood_filling {

	public static void main(String[] args) 
	{
		floodfill(13, 17, 3);
	}

	private static void floodfill(int x, int y, int n) 
	{
		if(n==0) return;
		System.out.println("n="+n+",x=" + x + ", y="+y);
		floodfill(x+1, y, n-1); 
		floodfill(x-1, y, n-1); 
		floodfill(x, y+1, n-1); 
		floodfill(x, y-1, n-1); 
	}

}
