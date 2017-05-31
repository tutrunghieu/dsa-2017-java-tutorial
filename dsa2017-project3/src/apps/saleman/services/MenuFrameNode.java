package apps.saleman.services;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MenuFrameNode 
{
	public Object object;
	protected Map<String, MenuFrameNode> nodes = new LinkedHashMap<String, MenuFrameNode>();

	public MenuFrameNode findOrInsert(String pk) 
	{
		MenuFrameNode res = nodes.get(pk);
		if(res == null) nodes.put(pk, res = new MenuFrameNode());
		return res;
	}

	public Set<String> keySet() 
	{
		return nodes.keySet();
	}
	
	public MenuFrameNode get(String nk)
	{
		return nodes.get(nk);
	}

	public String getText() 
	{
		if(object==null) return null;
		
		if(object instanceof javax.swing.JMenu)
		{
			return ((javax.swing.JMenu)object).getText();			
		}
		
		if(object instanceof javax.swing.JMenuItem)
		{
			return ((javax.swing.JMenuItem)object).getText();
		}
		
		if(object instanceof javax.swing.JMenuBar)
		{
			return ((javax.swing.JMenuBar)object).getName();
		}
		
		return object.toString();
	}

}
