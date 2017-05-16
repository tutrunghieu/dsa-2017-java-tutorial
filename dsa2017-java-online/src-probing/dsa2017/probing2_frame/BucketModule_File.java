package dsa2017.probing2_frame;

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

	public Object action_file_save(ActionEvent x) {
		// TODO Auto-generated method stub
		return null;
	}

}
