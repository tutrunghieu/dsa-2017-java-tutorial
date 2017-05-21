package dsa2017.probing4_gen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import dsa2017.utils.Res;

public class GenTreeNode 
{
	@Override
	public String toString() {
		return "GenTreeNode [data=" + data
				+ ", parent=" + Res.code(parent)
				+ ", children=" + Res.codeList(children) + "]";
	}

	protected Object data;
	protected GenTreeNode parent;
	protected List<GenTreeNode> children = new ArrayList<GenTreeNode>();

	public GenTreeNode(Object d) 
	{
		data = d;
	}

	public void add(GenTreeNode n) 
	{
		children.add(n);		
	}

	public List<GenTreeNode> getChildrenReverse() 
	{
		List<GenTreeNode> res = new ArrayList<GenTreeNode>(children);
		Collections.reverse(res);
		return res;
	}

}
