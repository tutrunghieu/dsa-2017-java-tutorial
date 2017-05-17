package org.TenCongTy.project1;

import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class BucketModule_File  
{
	public void action_file_open(ActionEvent x) 
	{
		BucketFrame.useFrame().showOpenDialog(f -> openFile(f));		
	}

	private void openFile(File x) 
	{
		try {
			BufferedImage t = ImageIO.read(x);
			BucketFrame.useFrame().getMainView().setImage(t);
			BucketFrame.useFrame().repaint();
		}
		
		catch(Exception xp) {
			xp.printStackTrace();
		}
	}

	public void action_file_save(ActionEvent x) 
	{
		BucketFrame.useFrame().showSaveDialog(null, f -> saveFile(f));		
	}

	private void saveFile(File f)
	{
		try {
			BufferedImage t = BucketFrame.useFrame().getMainView().getImage();
			ImageIO.write(t, "png", f);
		}
		catch(Exception xp) {
			xp.printStackTrace();
		}
	}

}
