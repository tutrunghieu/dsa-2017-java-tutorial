package dsa2017.probing4_bt;

import dsa2017.utils.Res;

public class BinaryNode {

	@Override
	public String toString() {
		return "BinaryNode#"+this.hashCode()+" [info=" + info 
				+ ", left=" + Res.code(left) 
				+ ", right=" + Res.code(right)
				+ ", parent=" + Res.code(parent) + "]";
	}

	public Object info;
	public BinaryNode left;
	public BinaryNode right;
	public BinaryNode parent;
	
	public BinaryNode(Object d) 
	{
		info = d;		
	}

	public int getLevel()
	{
		int cnt = 0;
		BinaryNode c = this;
		while(c != null) { cnt++; c = c.parent; } 
		return cnt;
	}

}
