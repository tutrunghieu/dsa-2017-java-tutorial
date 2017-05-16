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
		System.out.println(x.getX() + ":" + x.getY());
		
		Color c = BucketFrame.useFrame().getCurrentColor();	
		BufferedImage img = BucketFrame.useFrame().getMainView().getImage();

		ImageService.floodFill(img, c, new Point(x.getX(), x.getY()));		
	}

}
