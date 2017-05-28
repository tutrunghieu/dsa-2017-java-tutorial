package dsa2017.probing7_trie;

public class MyTrie {

	protected MyTrieNode root = new MyTrieNode();
	
	public void add(String key, int n) 
	{
		MyTrieNode t = root;
		
		for(int k=0; k<key.length(); k++) 
		{
			t = t.findOrInsert(key.charAt(k));
		}
		
		t.tag = n;
	}

	public void dump() 
	{
		dump(root, "");
	}
	
	private void dump(MyTrieNode p, String r) 
	{
		String r1 = r + (p.data ==0 ? "": p.data);
		if(p.tag != null) System.out.println(r1 + " >> " + p.tag);
		for(MyTrieNode pk: p.getChildren()) dump(pk, r1);
	}

	public boolean contains(String key)
	{
		MyTrieNode t = find(key, root);
		return t != null && t.tag != null;
	}

	private MyTrieNode find(String key, MyTrieNode p) 
	{
		MyTrieNode t = p;
		
		for(int k=0; k<key.length(); k++) 
		{
			t = t.find(key.charAt(k));
			if(t == null) break;
		}
		
		return t;
	}

	public void remove(String key)
	{
		MyTrieNode t = find(key, root);
		
		if(t == null) return;
		
		System.out.println("To remove " + t);
		t.tag = null;
		
		while(t != root) 
		{
			if(t.tag != null) break;
			if(t.hasChildren()) break;
			
			MyTrieNode p = t.parent;
			p.remove(t);
			t = p;
		}
		
		return;
	}

}
