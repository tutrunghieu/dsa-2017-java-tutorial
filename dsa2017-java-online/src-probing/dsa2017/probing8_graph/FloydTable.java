package dsa2017.probing8_graph;

import java.util.LinkedHashMap;
import java.util.Map;

import dsa2017.probing7_graph.MyNode;

public class FloydTable 
{
	protected Map<MyNode, Map<MyNode, FloydNode>> cells = new LinkedHashMap<MyNode, Map<MyNode, FloydNode>>();
	
	public FloydNode get(MyNode nj, MyNode nk) 
	{
		Map<MyNode, FloydNode> mj = cells.get(nj);
		if(mj == null) return null;
		
		return mj.get(nk);
	}

	public FloydNode put(MyNode nj, MyNode nk) 
	{
		Map<MyNode, FloydNode> mj = cells.get(nj);
		
		if(mj == null)  {
			cells.put(nj, mj = new LinkedHashMap<MyNode, FloydNode>());
		}
		
		FloydNode res = mj.get(nk);
		if(res == null) mj.put(nk, res = new FloydNode());
		
		return res;
	}
}
