package dsa2017.day5.avl;

import dsa2017.day5.swing.LevelTable;

public class AvlTree 
{
	private static final boolean LEFT = true;
	private static final boolean RIGHT = false;
	public AvlNode root;

	public AvlTree() 
	{
	}
	
	public AvlTree(int[] a) {
		addMany(a);
	}

	public AvlNode search(int x) 
	{
		if(root==null) return null;
		return search(x, root);
	}

	public AvlNode search(int x, AvlNode n) 
	{
		if(x==n.data) return n;
		if(x<n.data && n.left != null) return search(x, n.left);
		else if(x>n.data && n.right != null) return search(x, n.right);
		else return null;
	}	

	public AvlNode add(int x)
	{
		AvlNode t = new AvlNode(x);
		if(root == null) root = t;
		else add(t, root);
		
		return t;
	}

	private void add(AvlNode n, AvlNode p) 
	{
		if(n.data < p.data)
		{
			if(p.left == null) { p.left = n; n.parent = p; }
			else add(n, p.left);
		}
		if(n.data > p.data)
		{
			if(p.right == null)
			{ p.right = n; n.parent = p; }
			else add(n, p.right);
		}
	}

//	public void dump()
//	{
//		dump(root, 1);
//	}

//	private void dump(AvlNode t, int level) 
//	{
//		if(t==null) return;
//		for(int k=0; k<level; k++) System.out.print("-- ");
//		System.out.print(t.data);
//		printParent(t);
//		printBalanceFactor(t);
//		System.out.println();
//		
//		if(t.left != null) dump(t.left, level+1);
//		if(t.right != null) dump(t.right, level+1);
//	}

//	private void printBalanceFactor(AvlNode t) {
//		if(t == null) return;
//		int h_right = height(t.right);
//		int h_left = height(t.left);
//		int bf = h_right - h_left;
//		System.out.print(
//				" hl=" + h_left
//				+ " hr=" + h_right				
//				+ " bf=" + bf);
//	}

//	public int height(AvlNode n) 
//	{
//		if(n==null) return 0;
//		
//		int l = height(n.left);
//		int r = height(n.right);
//		
//		return Math.max(l, r) + 1;
//	}

	private void printParent(AvlNode t) 
	{
		if(t.parent == null) return;
		AvlNode p = t.parent;
		if(p.left == t) 
			System.out.print(" left_of_" + p.data);
		else
			System.out.print(" right_of_" + p.data);			
	}



	public void addMany(int... a) 
	{
		for(int ak: a) add(ak);
	}

	public AvlNode getRoot() 
	{
		return root;
	}

//	public int height() 
//	{
//		return height(root);
//	}
//
//	public int maxWidth() 
//	{
//		int h = height(root);
//		if(h==0) return 0;
//		return (int)Math.pow(2, h-1);
//	}

	public LevelTable<AvlNode> getLevelTable() 
	{
		LevelTable<AvlNode> levels = new LevelTable<AvlNode>();
		getLevelTable(root, 0, 0, levels);		
		return levels;
	}

	public void getLevelTable(AvlNode p, int l, int loc, LevelTable<AvlNode> levels) 
	{
		levels.add(l, loc, p);
		if(p.left != null) getLevelTable(p.left, l+1, loc*2 + 0, levels);
		if(p.right != null) getLevelTable(p.right, l+1, loc*2 + 1, levels);
	}
	
	public void rotate_pA2_qA1(AvlNode p) 
	{
		AvlNode g, q, a, b, c;
		g = p.parent;
		q = p.right;
		a = p.left;
		b = q.left;
		c = q.right;
		
		p.left = a;
		p.right = b;
		q.left = p;
		q.right = c;
		
		if(g==null) root = q;
		else if(g.left==p) g.left = q;
		else g.right = q;
		
		if(a != null) a.parent = p;
		if(b != null) b.parent = p;
		if(c != null) c.parent = q;
		p.parent = q;
		q.parent = g;		
	}
	
	public void rotate_pA2_qB1(AvlNode p) 
	{
		AvlNode g, q, r, a, b, c, d;
		g = p.parent; q = p.right; r = q.left;
		a = p.left; b = r.left; c = r.right; d = q.right;
		
		p.left = a; p.right = b;
		q.left = c; q.right = d;
		r.left = p; r.right = q;
		
		if(g==null) root = r;
		else if(g.left==p) g.left = r;
		else g.right = r;
		
		if(a != null) a.parent = p;
		if(b != null) b.parent = p;
		
		if(c != null) c.parent = q;
		if(d != null) d.parent = q;
		p.parent = r;
		q.parent = r;		
		r.parent = g;
	}		

	private void link(AvlNode a, AvlNode p, boolean l) 
	{
		if(a != null) a.parent = p;
		if(l) p.left = a; else p.right = a;
	}

	private void linkRoot(AvlNode q, AvlNode g, AvlNode p) 
	{
		if(g==null) root = q;
		else if(g.left==p) g.left = q;
		else g.right = q;
		
		q.parent = g;		
	}
	
	public void rotate_pB2_qA1(AvlNode p) 
	{
		AvlNode g, q, r, a, b, c, d;
		g = p.parent; q = p.left; r = q.right;
		a = q.left; b = r.left; c = r.right; d = p.right;
		
		p.left = a; p.right = b;
		q.left = c; q.right = d;
		r.left = p; r.right = q;
		
		if(g==null) root = r;
		else if(g.left==p) g.left = r;
		else g.right = r;
		
		if(a != null) a.parent = p;
		if(b != null) b.parent = p;
		
		if(c != null) c.parent = q;
		if(d != null) d.parent = q;
		p.parent = r;
		q.parent = r;		
		r.parent = g;		
	}

	public void rotate_L2_L1(AvlNode p) 
	{
		AvlNode g, q, a, b, c;
		g = p.parent; q = p.left; 
		a = q.left; b = q.right; c = p.right;
		
		linkRoot(q, g, q);
		
		link(a, q, LEFT);
		link(b, p, LEFT);
		link(c, p, RIGHT);
		
		link(p, q, RIGHT);
	}



	public void rotate_L2_R1(AvlNode p) 
	{
		AvlNode g, q, a, b, c, d, r;
		g = p.parent; q = p.left; r = q.right;
		a = q.left; b = r.left; c = r.right; d = p.right; 
				
		linkRoot(r, g, p);
		
		link(a, q, LEFT);
		link(b, q, RIGHT);
		link(c, p, LEFT);
		link(d, p, RIGHT);
		
		link(q, r, LEFT);
		link(p, r, RIGHT);
	}

	public void rotate_R2_L1(AvlNode p) 
	{
		AvlNode g, q, a, b, c, d, r;
		g = p.parent; q = p.right; r = q.left;
		a = p.left; b = r.left; c = r.right; d = q.right;
				
		linkRoot(r, g, p);
		
		link(a, p, LEFT);
		link(b, p, RIGHT);
		link(c, q, LEFT);
		link(d, q, RIGHT);
		
		link(p, r, LEFT);
		link(q, r, RIGHT);
		
	}

	public void rotate_R2_R1(AvlNode p) 
	{
		AvlNode g, q, a, b, c;
		g = p.parent; q = p.right; 
		a = p.left; b = q.left; c = q.right;
		
		linkRoot(q, g, p);
		link(a, p, LEFT);
		link(b, p, RIGHT);
		link(c, q, RIGHT);
		
		link(p, q, LEFT);
	}

}
