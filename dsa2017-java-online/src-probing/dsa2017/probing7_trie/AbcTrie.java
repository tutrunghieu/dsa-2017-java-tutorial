package dsa2017.probing7_trie;

public class AbcTrie {

	protected AbcTrieNode root = new AbcTrieNode();
	
	public void add(String key, int n) 
	{
		AbcTrieNode t = root;
		
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
	
	private void dump(AbcTrieNode p, String r) 
	{
		String r1 = r + (p.data ==0 ? "": p.data);
		if(p.tag != null) System.out.println(r1 + " >> " + p.tag);
		for(AbcTrieNode pk: p.getChildren()) dump(pk, r1);
	}

	public boolean contains(String key)
	{
		AbcTrieNode t = find(key, root);
		return t != null && t.tag != null;
	}

	public void dumpPref(String s) 
	{
		AbcTrieNode t = find(s, root);
		if(t != null) dump(t, s + "/");		
	}
	
	private AbcTrieNode find(String key, AbcTrieNode p) 
	{
		AbcTrieNode t = p;
		
		for(int k=0; k<key.length(); k++) 
		{
			t = t.find(key.charAt(k));
			if(t == null) break;
		}
		
		return t;
	}

	public void remove(String key) {
		AbcTrieNode t = find(key, root);
		
		if(t == null) return;
		
		System.out.println("To remove " + t);
		t.tag = null;
		
		while(t != root) {
			if(t.tag != null) break;
			if(t.hasChildren()) break;
			
			AbcTrieNode p = t.parent;
			p.remove(t);
			t = p;
		}
		
		return;
	}


}
