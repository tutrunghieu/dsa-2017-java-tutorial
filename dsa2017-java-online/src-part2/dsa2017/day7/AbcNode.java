package dsa2017.day7;

import java.util.ArrayList;
import java.util.List;

public class AbcNode {

	public String data;
	public AbcTag tag;
	public List<AbcLink> links = new ArrayList<AbcLink>();

	public AbcNode(String x) 
	{
		data = x;
	}

	public void addLink(AbcLink n)
	{
		links.add(n);
	}

}
