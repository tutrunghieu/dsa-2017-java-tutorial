package dsa2017.proto.controllers;

import java.awt.Color;
import java.io.File;

public class Module_File extends __BaseModule {

	public void action_file_new() {
		useFrame().showColorDialog(x -> newFile(x));

	}

	public void newFile(Color x) {
		System.out.println("You have selected " + x);
	}

	public void action_file_open() {
		useFrame().showOpenDialog(x -> openFile(x));
	}

	private void openFile(File x) {
		System.out.println("You have selected " + x.getAbsolutePath());
	}

	public void action_file_save() {
		useFrame().showSaveDialog(null, x -> saveFile(x));

	}

	private void saveFile(File x) {
		System.out.println("Saving to " + x.getAbsolutePath());
	}
}
