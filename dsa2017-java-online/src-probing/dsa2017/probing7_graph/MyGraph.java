package dsa2017.probing7_graph;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class MyGraph 
{
	protected List<MyNode> nodes = new ArrayList<MyNode>();
	protected List<MyLink> links = new ArrayList<MyLink>();

	public MyNode add(MyNode n) 
	{
		nodes.add(n);
		return n;
	}

	public MyLink add(MyLink n) 
	{
		links.add(n);
		n.linkFrom.addLink(n);
		return n;
	}

	public void draw(Graphics g) 
	{
		for(MyLink ek: links)
		{
			Point t1 = ek.linkFrom.tag.getCenter();
			Point t2 = ek.linkTo.tag.getCenter();
			g.setColor(Color.black);
			g.drawLine(t1.x, t1.y, t2.x, t2.y);
		}
		
		for(MyNode nk: nodes)
		{
			MyTag tk = nk.tag;
			g.setColor(Color.yellow);
			g.fillRect(tk.x, tk.y, tk.width, tk.height);
			g.setColor(Color.black);
			g.drawString(nk.data + "", tk.x + 5, tk.y + 3*tk.height/4);
		}
		
		return;
	}

	public void dump() 
	{
		Set<MyNode> visited = new LinkedHashSet<MyNode>();
		Stack<MyNode> todo = new Stack<MyNode>();
		
		for(MyNode root: nodes) 
		{
			if(visited.contains(root)) continue;
			System.out.println("==== root: " + root.data);
			todo.push(root);
			
			while(!todo.isEmpty())
			{
				MyNode nj = todo.pop();
				System.out.println("visiting node: " + nj.data);
				visited.add(nj);
				
				for(MyLink lj: nj.links) {
					MyNode nk = lj.linkTo;
					if(! visited.contains(nk) ) todo.push(nk);
				}
			} //inside node
		} //for each available node
		
		return;
	}

	public MyNode find(String a)
	{
		for(MyNode nk: nodes) if(a.equals(nk.data)) return nk;
		return null;
	}

	public List<MyNode> getNodes() 
	{
		return nodes;
	}
}
