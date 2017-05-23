package dsa2017.day5.bst;

import dsa2017.utils.Res;

public class SearchNode {

	@Override
	public String toString() {
		return "id="+Res.code(this)
		+", data=" + data
		+ ", parent=" + Res.code(parent)
		+ ", left=" + Res.code(left)
		+ ", right=" + Res.code(right);
	}

	public Integer data;
	public SearchNode left;
	public SearchNode right;
	public SearchNode parent;
	
	public int getLevel() 
	{
		int l = 0;
		for(SearchNode t=this; t!= null; t = t.parent) l++; 
		return l;
	}

}
