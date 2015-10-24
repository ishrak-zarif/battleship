package com.utility;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Utility {
	public static ImageIcon getImageIcon(String path){
		return new ImageIcon(Utility.class.getResource(path));
	}
	public static Image getImage(String path){
		return Utility.getImageIcon(path).getImage();
	}
}
