package dsa2017.day5.swing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

import dsa2017.day5.avl.AvlNode;

public class LevelTree 
{
	public Map<Integer, List<LevelNode>> items = new TreeMap<Integer, List<LevelNode>>();
	public Map<Integer, LevelNode> metags = new TreeMap<Integer, LevelNode>();

//	public<T1> void addTree(T1 root, NeighborFunc<T1> lf) 
//	{
//		Stack<T1> todo = new Stack<T1>();
//		todo.add(root);
//		
//		while(!todo.isEmpty())
//		{
//			T1 ik = todo.pop();
//			
//			LevelNode nk = addLink(ik);
//			LevelNode pk = getParent(ik);
//			
//			nk.level = (pk==null ? 0 : pk.level + 1);
//			addLevel(nk.level, nk);
//			
//			for(T1 cj: lf.invokeNeighborFunc(ik)) todo.push(cj);
//		}
//		
//		return;
//	}

	private void addLevel(int level, LevelNode nk) 
	{
		List<LevelNode> gk = items.get(level);
		if(gk == null) items.put(level, gk = new ArrayList<LevelNode>());
		
		gk.add(nk);
	}

//	private<T1> LevelNode getParent(T1 ik) 
//	{
//		int p = ik.
//		return null;
//	}


	private<T1> LevelNode addLink(T1 ik) 
	{
		LevelNode res = new LevelNode(ik);
		metags.put(ik.hashCode(), res);	
		return res;
	}

//	public void dump() 
//	{
//		for(LevelNode ik: items) System.out.println(ik.original);
//		
//	}
//	public<T1> void dump(Class<T1> cl, PrintAction<T1> lf) 
//	{
//		for(LevelNode ik: items) {
//			T1 rk = cl.cast(ik.original);
//			lf.invokeAction(rk);		
//		}
//	}

	public static<T1> List<T1> neighbors(T1 l, T1 r) 
	{
		List<T1> res = new ArrayList<T1>();
		if(l != null) res.add(l);
		if(r != null) res.add(r);
		return res;
	}
}
