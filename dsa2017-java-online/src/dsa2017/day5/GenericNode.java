package dsa2017.day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericNode 
{
	public GenericNode(Object d) 
	{
		data = d;
	}
	public Object data;
	public List<GenericNode> children = new ArrayList<GenericNode>();
	public GenericNode parent;
	
	public List<GenericNode> getChildrenRev() 
	{
		List<GenericNode> res = new ArrayList<GenericNode>(children);
		Collections.reverse(res);
		return res;
	}

}
