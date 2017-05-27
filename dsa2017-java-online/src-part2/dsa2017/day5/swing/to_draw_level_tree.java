package dsa2017.day5.swing;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;

import dsa2017.day5.avl.AvlNode;
import dsa2017.day5.avl.AvlTree;

public class to_draw_level_tree
{
	public static void main(String[] args) 
	{
		AvlTree tree = new AvlTree();
		tree.addMany(4, 3, 7, 1, 5, 8, 12, 14);
		
		TreeUtils.figure(800, 600, x -> draw(x, tree.getLevelTable()));
	}

	private static void draw(Graphics g, LevelTable<AvlNode> levels) 
	{
		int dx = 30, dy = 70, x0 = 120, y0 = 70;
		drawLines(g, levels, dx, dy, x0, y0);
		drawNodes(g, levels, dx, dy, x0, y0);
	}

	private static void drawNodes(Graphics g, LevelTable<AvlNode> levels, int dx, int dy, int x0, int y0)
	{
		for(Integer lk: levels.keySet())
		for(AvlNode nj: levels.getLevelNodes(lk))
		{
				LevelMetag<AvlNode> tj = levels.getMetag(nj);
//				int xj = tj.drawX = tj.location * wj + wj/2 + x0;
//				int yj = tj.drawY = tj.level * dy + y0;
				
				int xj = tj.drawX, yj = tj.drawY;
				
				g.setColor(Color.gray);
				g.fillRect(xj, yj, tj.sizeW, tj.sizeH);
				g.setColor(Color.black);
				g.drawString(nj.data + "", xj + 4, yj + tj.sizeH - 4);
		}
		
		return;
	}

	private static void drawLines(Graphics g, LevelTable<AvlNode> levels, int dx, int dy, int x0, int y0) 
	{
		int wj = dx * levels.maxWidth();
		FontMetrics fm = g.getFontMetrics();
		
		g.setColor(Color.blue);
		for(Integer lk: levels.keySet()) 
		{
			System.out.println("drawing level " + lk);
			for(AvlNode nj: levels.getLevelNodes(lk))
			{
				String dk = nj.data + "";
				LevelMetag<AvlNode> tk = levels.getMetag(nj);
				tk.drawX = tk.location * wj + wj/2 + x0;
				tk.drawY = tk.level * dy + y0;
				
				tk.sizeW = fm.stringWidth(dk) + 8;
				tk.sizeH = fm.getHeight() + 4;
				
				if(lk == 0) continue;
				
				LevelMetag<AvlNode> pk = levels.getMetag(nj.parent);
				g.drawLine(tk.getCenterX(), tk.getCenterY(), pk.getCenterX(), pk.getCenterY());
			}
			
			wj /= 2;
		}		
		
		return;
	}

//	
//	private static void printNode(AvlNode x, LevelTable<AvlNode> levels) 
//	{
//		System.out.print(" data=" + x.data);
//		
//		LevelMetag<AvlNode> m = levels.getMetag(x);
//		System.out.print(" level=" + m.level);
//		System.out.print(" loc=" + m.location);
//				
//		System.out.println();
//	}
}
