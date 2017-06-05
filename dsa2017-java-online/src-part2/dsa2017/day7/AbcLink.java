package dsa2017.day7;

public class AbcLink {

	public AbcNode linkFrom;
	public AbcNode linkTo;
	public boolean linkDir;
	public double linkDist;

	public AbcLink(AbcNode a, AbcNode b) 
	{
		linkFrom = a;
		linkTo = b;
		linkDir = true; 
	}

	public AbcLink(AbcNode a, AbcNode b, double d) 
	{
		linkFrom = a;
		linkTo = b;
		linkDir = true; 
		linkDist = d;
	}

}
