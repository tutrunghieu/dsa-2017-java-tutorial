package dsa2017.day7;

import java.util.ArrayList;
import java.util.List;

public class MyNode {

	public String data;
	public MyTag tag;
	public List<MyLink> links = new ArrayList<MyLink>();

	public MyNode(String x) 
	{
		data = x;
	}

	public void addLink(MyLink n)
	{
		links.add(n);
	}

}
