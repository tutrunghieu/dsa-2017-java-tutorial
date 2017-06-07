package dsa2017.day7.hamilton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import dsa2017.probing7_graph.MyGraph;
import dsa2017.probing7_graph.MyLink;
import dsa2017.probing7_graph.MyNode;

public class to_enumerate_graph {

	public static void main(String[] args) 
	{
		MyGraph g = DijkCase4.create();		
		DijkCase4.placeAndDraw(g);

		List<MyNode> conf = new ArrayList<MyNode>();
		conf.add( g.find("1") );
		enumGraph(conf, g);
	}
	
	static void enumGraph(List<MyNode> conf, MyGraph g)
	{
		if(conf.size() == g.getNodes().size())
		{
			MyNode f = conf.get(0);
			MyNode l = conf.get(conf.size()-1);
			if(connected(f, l)) print(conf);
		}
		else 
		{
		   Set<MyNode> avail = new LinkedHashSet<MyNode>();
		   for(MyLink lj: conf.get(conf.size()-1).links)
		   {
			   avail.add(lj.linkFrom);
			   avail.add(lj.linkTo);
		   }
		   avail.removeAll(conf);
		   
		   for(MyNode ak: avail) 
		   {
			   conf.add(ak);
			   enumGraph(conf, g);
			   conf.remove(ak);
		   }
		}
	}

	private static boolean connected(MyNode f, MyNode l) 
	{
		for(MyLink fj: f.links)
		{
		    if(fj.linkFrom==f 
		    	&& fj.linkTo==l) return true;
		    if(fj.linkFrom==l 
			    	&& fj.linkTo==f) return true;
		}
			
		return false;
	}

	private static void print(List<MyNode> conf) 
	{
		for(MyNode c: conf) System.out.print(c.data + " ");
		System.out.println("");
	}

}
