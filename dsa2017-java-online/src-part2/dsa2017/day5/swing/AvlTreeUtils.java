package dsa2017.day5.swing;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;

import dsa2017.day5.avl.AvlNode;

public class AvlTreeUtils 
{
	@SuppressWarnings("serial")
	public static void figureLR(int W, int H, PaintAction left, PaintAction right) 
	{
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("figure");
		f.setSize(W, H);
		f.setLocationRelativeTo(null);
		
		f.setLayout(new GridLayout(1, 2));
		
		f.add(new JPanel() 
		{
		  @Override
		  protected void paintComponent(Graphics g) {
			  g.translate(0, 50);
			  left.paintComponent(g); 
		   }			
		});
		
		f.add(new JPanel() 
		{
		  @Override
		  protected void paintComponent(Graphics g) {
			  g.translate(0, 50);
			  right.paintComponent(g); 
		   }			
		});
		
		f.setVisible(true);
	}
	
	@SuppressWarnings("serial")
	public static void figure(int W, int H, PaintAction lf) 
	{
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("figure");
		f.setSize(W, H);
		f.setLocationRelativeTo(null);
		
		f.add(new JPanel() 
		{
		  @Override
		  protected void paintComponent(Graphics g) { lf.paintComponent(g); }			
		});
		
		f.setVisible(true);
	}
	
	public static void draw(Graphics g, LevelTable<AvlNode> levels) 
	{
		int dx = 60, dy = 100, x0 = 0, y0 = 0;
		computeHeights(levels);
		drawLines(g, levels, dx, dy, x0, y0);
		drawNodes(g, levels, dx, dy, x0, y0);
	}

	private static void computeHeights(LevelTable<AvlNode> levels) 
	{
		for(Integer lk: levels.keySetReversed())
		for(AvlNode nj: levels.getLevelNodes(lk))
		{
				LevelMetag<AvlNode> tj = levels.getMetag(nj);
				
				int hj = 1; 
				
				if(nj.left!=null) 
				{
					LevelMetag<AvlNode> t = levels.getMetag(nj.left);
					hj = Math.max(t.height+1, hj);
				}
				
				if(nj.right!=null) {
					LevelMetag<AvlNode> t = levels.getMetag(nj.right);
					hj = Math.max(t.height+1, hj);
				}
				
				tj.height = hj; 
		}

		return;				
	}



	private static void drawNodes(Graphics g, LevelTable<AvlNode> levels, int dx, int dy, int x0, int y0)
	{
		for(Integer lk: levels.keySet())
		for(AvlNode nj: levels.getLevelNodes(lk))
		{
				LevelMetag<AvlNode> tj = levels.getMetag(nj);
//				int xj = tj.drawX = tj.location * wj + wj/2 + x0;
//				int yj = tj.drawY = tj.level * dy + y0;
				
				int bf = getBalanceFactor(tj, levels);
				drawStrings(g, tj, "data=" + nj.data, "bf=" + trans(bf), "h=" + tj.height); 
		}
		
		return;
	}

	private static String trans(int bf) 
	{
		if(bf==-2) return "L2";
		if(bf==-1) return "L1";
		if(bf==+2) return "R2";
		if(bf==+1) return "R1";
		if(bf==0) return "B";
		return "##";
	}

	private static void drawStrings(Graphics g, LevelMetag<AvlNode> tj, String... args) 
	{
		int xj = tj.drawX, yj = tj.drawY;
		
		
		//g.drawString(nj.data + "", xj + 4, yj + tj.sizeH - 4);
		g.setColor(Color.yellow);
		g.fillRect(xj, yj, tj.sizeW + 8, tj.sizeH + 6);
		g.setColor(Color.black);
		
		for(String ak: args) g.drawString(ak, xj + 4, yj += tj.sizeH);		
	}

	private static int getBalanceFactor(LevelMetag<AvlNode> tj, LevelTable<AvlNode> levels) 
	{
		LevelMetag<AvlNode> l = levels.getMetag(tj.original.left);
		LevelMetag<AvlNode> r = levels.getMetag(tj.original.right);
		return (r==null ? 0 : r.height) - (l==null ? 0 : l.height);
	}

	private static void drawLines(Graphics g, LevelTable<AvlNode> levels, int dx, int dy, int x0, int y0) 
	{
		int wj = dx * levels.maxWidth();
		FontMetrics fm = g.getFontMetrics();
		
		g.setColor(new Color(200, 200, 200));
		for(Integer lk: levels.keySet()) 
		{
			//System.out.println("drawing level " + lk);
			for(AvlNode nj: levels.getLevelNodes(lk))
			{
				String dk = nj.data + "";
				LevelMetag<AvlNode> tk = levels.getMetag(nj);
				tk.drawX = tk.location * wj + wj/2 + x0;
				tk.drawY = tk.level * dy + y0;
				
				tk.sizeW = fm.stringWidth("data=" + dk);
				tk.sizeH = fm.getHeight();
				
				if(lk == 0) continue;
				
				LevelMetag<AvlNode> pk = levels.getMetag(nj.parent);
				g.drawLine(tk.getCenterX(), tk.getCenterY(), pk.getCenterX(), pk.getCenterY());
			}
			
			wj /= 2;
		}		
		
		return;
	}

}
