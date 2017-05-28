package dsa2017.probing7_graph;

public class MyLink {

	public MyNode linkFrom;
	public MyNode linkTo;
	public boolean linkDir;

	public MyLink(MyNode a, MyNode b) 
	{
		linkFrom = a;
		linkTo = b;
		linkDir = true; 
	}

}
