package apps.saleman;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import apps.saleman.physical.Tab_Order;


public class SwingUtils 
{
	public static<T1> void showData(String title, List<T1> x) 
	{
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setSize(320, 200);
		f.setLocation(10, 10);
		f.setTitle(title);
		
		JTextArea a = new JTextArea();
		f.add(new JScrollPane(a));
		for(T1 xk: x) a.append(xk + "\r\n");
		
		f.setVisible(true);
	}



}
