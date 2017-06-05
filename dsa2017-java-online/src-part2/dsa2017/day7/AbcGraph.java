package dsa2017.day7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class AbcGraph 
{
	protected List<AbcNode> nodes = new ArrayList<AbcNode>();
	protected List<AbcLink> links = new ArrayList<AbcLink>();

	public AbcNode add(AbcNode n) 
	{
		nodes.add(n);
		return n;
	}

	public AbcLink add(AbcLink n) 
	{
		links.add(n);
		n.linkFrom.addLink(n);
		return n;
	}

	public void draw(Graphics g) 
	{
		for(AbcLink ek: links)
		{
			Point t1 = ek.linkFrom.tag.getCenter();
			Point t2 = ek.linkTo.tag.getCenter();
			g.setColor(Color.black);
			g.drawLine(t1.x, t1.y, t2.x, t2.y);
		}
		
		for(AbcNode nk: nodes)
		{
			AbcTag tk = nk.tag;
			g.setColor(Color.yellow);
			g.fillRect(tk.x, tk.y, tk.width, tk.height);
			g.setColor(Color.black);
			g.drawString(nk.data + "", tk.x + 5, tk.y + 3*tk.height/4);
		}
		
		return;
	}

	public void dump() {
		Set<AbcNode> visited = new LinkedHashSet<AbcNode>();
		Stack<AbcNode> todo = new Stack<AbcNode>();
		
		for(AbcNode root: nodes) {
			if(visited.contains(root)) continue;
			System.out.println("==== root: " + root.data);
			todo.push(root);
			
			while(!todo.isEmpty()) {
				AbcNode nj = todo.pop();
				System.out.println("visiting node: " + nj.data);
				visited.add(nj);
				
				for(AbcLink lj: nj.links) {
					AbcNode nk = lj.linkTo;
					if(! visited.contains(nk) ) todo.push(nk);
				}
			} //inside node
		} //for each available node
		
		return;
	}

	public AbcNode find(String a)
	{
		for(AbcNode nk: nodes) if(a.equals(nk.data)) return nk;
		return null;
	}

	public List<AbcNode> getNodes() 
	{
		return nodes;
	}
}
