package dsa2017.day5.swing;

public class LevelMetag<T> {

	public T original;
	public int level;
	public int location;
	public int drawX;
	public int drawY;
	public int sizeW;
	public int sizeH;

	public LevelMetag(int y, int x, T p) 
	{
		level = y;
		location = x;
		original = p;
	}

	public int getCenterX() 
	{
		return drawX + sizeW/2;
	}

	public int getCenterY() 
	{
		return drawY + sizeH/2;
	}


}
