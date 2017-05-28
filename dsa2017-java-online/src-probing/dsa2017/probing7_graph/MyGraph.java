package dsa2017.probing7_graph;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

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
			g.drawString(nk.data + "", tk.x, tk.y + 3*tk.height/4);
		}
		
		return;
	}
}
