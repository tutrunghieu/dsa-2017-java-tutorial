package dsa2017.probing2_frame;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class BucketModule_Edit 
{

	public void action_edit_color(ActionEvent x) 
	{
	}

	public void action_edit_undo(ActionEvent x) 
	{
		
	}

	public void action_edit_fill(MouseEvent x) 
	{
		System.out.println("inside " + x.getX() + ":" + x.getY());
		
		Color c = BucketFrame.useFrame().getCurrentColor();	
		if(c == null) c = ImageService.nextColor();
		
		BufferedImage img = BucketFrame.useFrame().getMainView().getImage();

		ImageService.floodFill(img, new Point(x.getX(), x.getY()), c);		
		BucketFrame.useFrame().repaint();
	}

}
