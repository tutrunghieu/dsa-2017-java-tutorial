package dsa2017.day5.swing;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TabularTree {

	public List<TabularNode> items = new ArrayList<TabularNode>();

	public<T1> void add(T1 root, NeighborFunc<T1> lf) 
	{
		Stack<T1> todo = new Stack<T1>();
		todo.add(root);
		
		while(!todo.isEmpty())
		{
			T1 ik = todo.pop();
			//System.out.println("adding " + ik);
			items.add(new TabularNode(ik));
			
			for(T1 cj: lf.invokeNeighborAction(ik)) 
				if(cj != null) todo.push(cj);
		}
		
		return;
	}

	public void dump() 
	{
		for(TabularNode ik: items) System.out.println(ik.original);
		
	}
	public<T1> void dump(Class<T1> cl, PrintAction<T1> lf) 
	{
		for(TabularNode ik: items) {
			T1 rk = cl.cast(ik.original);
			lf.invokeAction(rk);		
		}
	}
}
