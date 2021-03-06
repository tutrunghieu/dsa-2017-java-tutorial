package dsa2017.probing8_graph;

import dsa2017.probing7_graph.MyGraph;
import dsa2017.probing7_graph.MyNode;

public class FloydEngine 
{
	public static void floydMethod(MyGraph g)
	{
		FloydTable t = new FloydTable();
		
		//set t(nj, nk) = weight(nj, nk)
		for(MyNode nj: g.getNodes())
		for(MyNode nk: g.getNodes())
		{
			t.put(nj, nk).weight = nj.getWeight(nk);			
			t.put(nj, nk).parent = nj;			
		}
		
		int cnt = 0;
		print(t, g, cnt++);
	
		//compute the indirect path
		//ni and nj via nk
		for(MyNode nk: g.getNodes()) {
			for(MyNode ni: g.getNodes())
			for(MyNode nj: g.getNodes())
			{
				double dij = t.get(ni, nj).weight;
				double dik_dkj = t.get(ni, nk).weight + t.get(nk, nj).weight;
				
				if(dij <= dik_dkj) continue;
				t.put(ni, nj).weight = dik_dkj;			
				t.put(ni, nj).parent = t.get(nk, nj).parent;			
			}
			
			print(t, g, cnt++);
		}

		return;
	}

	private static void print(FloydTable t, MyGraph g, int cnt) 
	{
		System.out.println();
		System.out.println("===========" + cnt);
		
		for(MyNode nk: g.getNodes())
		{
			System.out.print(nk.data + ": ");
			
			for(MyNode nj: g.getNodes())
				System.out.print(t.get(nk, nj) + "   ");
			System.out.println();
		}
		
		return;
	}

}
