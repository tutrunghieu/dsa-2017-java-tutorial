package dsa2017.day5.avl;

public class AvlTree 
{
	public AvlNode root;

	public AvlTree() 
	{
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

	public void dump()
	{
		dump(root, 1);
	}

	private void dump(AvlNode t, int level) 
	{
		if(t==null) return;
		for(int k=0; k<level; k++) System.out.print("-- ");
		System.out.print(t.data);
		printParent(t);
		printBalanceFactor(t);
		System.out.println();
		
		if(t.left != null) dump(t.left, level+1);
		if(t.right != null) dump(t.right, level+1);
	}

	private void printBalanceFactor(AvlNode t) {
		if(t == null) return;
		int h_right = height(t.right);
		int h_left = height(t.left);
		int bf = h_right - h_left;
		System.out.print(
				" hl=" + h_left
				+ " hr=" + h_right				
				+ " bf=" + bf);
	}

	public int height(AvlNode n) 
	{
		if(n==null) return 0;
		
		int l = height(n.left);
		int r = height(n.right);
		
		return Math.max(l, r) + 1;
	}

	private void printParent(AvlNode t) 
	{
		if(t.parent == null) return;
		AvlNode p = t.parent;
		if(p.left == t) 
			System.out.print(" left_of_" + p.data);
		else
			System.out.print(" right_of_" + p.data);			
	}

	public void rotate_p2_q1(AvlNode p) 
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
		
		a.parent = p;
		b.parent = p;
		c.parent = q;
		p.parent = q;
		q.parent = g;		
	}
}
