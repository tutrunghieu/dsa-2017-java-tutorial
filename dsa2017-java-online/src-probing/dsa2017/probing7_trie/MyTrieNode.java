package dsa2017.probing7_trie;

import java.util.ArrayList;
import java.util.List;

public class MyTrieNode {

	public char data;
	public Object tag;
	
	public List<MyTrieNode> nodes = new ArrayList<MyTrieNode>();
	public MyTrieNode parent;
	
	public List<MyTrieNode> getChildren() 
	{
		return nodes;
	}

	public MyTrieNode findOrInsert(char c) 
	{
		for(MyTrieNode nk: nodes) if(c==nk.data) return nk;
		
		MyTrieNode nk = new MyTrieNode();
		nk.data = c;
		nk.parent = this;
		
		nodes.add(nk);
		
		return nk;
	}
	
	public MyTrieNode find(char c) 
	{
		for(MyTrieNode nk: nodes) if(c==nk.data) return nk;
		return null;
	}
}
