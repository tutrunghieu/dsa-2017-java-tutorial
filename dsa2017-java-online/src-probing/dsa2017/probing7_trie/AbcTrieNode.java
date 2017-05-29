package dsa2017.probing7_trie;

import java.util.ArrayList;
import java.util.List;

public class AbcTrieNode {

	@Override
	public String toString() {
		return "MyTrieNode [data=" + data + ", tag=" + tag + "]";
	}

	public char data;
	public Object tag;
	
	public List<AbcTrieNode> children = new ArrayList<AbcTrieNode>();
	public AbcTrieNode parent;
	
	public List<AbcTrieNode> getChildren() 
	{
		return children;
	}

	public AbcTrieNode findOrInsert(char c) 
	{
		for(AbcTrieNode nk: children) if(c==nk.data) return nk;
		
		AbcTrieNode nk = new AbcTrieNode();
		nk.data = c;
		nk.parent = this;
		
		children.add(nk);
		
		return nk;
	}
	
	public AbcTrieNode find(char c) 
	{
		for(AbcTrieNode nk: children) if(c==nk.data) return nk;
		return null;
	}

	public boolean hasChildren() 
	{
		return children.size() > 0;
	}

	public void remove(AbcTrieNode t) 
	{
		children.remove(t);
	}
}
