package phunghongminh_day2floodfill;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Stack;
import java.util.function.ToDoubleBiFunction;

import javax.imageio.ImageIO;

public class ll_to_fill_color {

	public static void main(String[] args) throws IOException {

		File dauvao = Res.getFileDK("input.png");
		File daura = Res.getFileDK("output.png");

		Desktop.getDesktop().open(dauvao);

		domuc(dauvao, new Point(174, 94), Color.blue, daura);
		domuc(daura, new Point(674, 94), Color.red, daura);
		domuc(daura, new Point(874, 94), Color.green, daura);
		domuc(daura, new Point(935, 562), Color.gray, daura);
		domuc(daura, new Point(166, 614), Color.black, daura);
		Desktop.getDesktop().open(daura);
	}

	public static void domuc(File dauvao, Point vitri, Color blue, File daura) throws IOException {

		BufferedImage chuaanh = ImageIO.read(dauvao);

		int rong = chuaanh.getWidth(), cao = chuaanh.getHeight();

		int mautoadobandau = chuaanh.getRGB((int) vitri.getX(), (int) vitri.getY());

		Stack<Point> chuavitri = new Stack<Point>();

		chuavitri.add(vitri);

		while (!chuavitri.isEmpty()) {

			Point vitrimau = chuavitri.pop();

			int rongmau = (int) vitrimau.getX();
			int caomau = (int) vitrimau.getY();

			int toadomaucanto = chuaanh.getRGB(rongmau, caomau);

			if (toadomaucanto != mautoadobandau)
				continue;

			chuaanh.setRGB(rongmau, caomau, blue.getRGB());

			if (rongmau + 1 < rong)
				chuavitri.add(new Point(rongmau + 1, caomau));
			if (caomau + 1 < cao)
				chuavitri.add(new Point(rongmau, caomau + 1));

			if (rongmau - 1 > 0)
				chuavitri.add(new Point(rongmau - 1, caomau));
			if (caomau - 1 > 0)
				chuavitri.add(new Point(rongmau, caomau - 1));

		}
		ImageIO.write(chuaanh, "png", daura);

	}

	
}
