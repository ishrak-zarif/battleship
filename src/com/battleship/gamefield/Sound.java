package com.battleship.gamefield;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;

public class Sound {
	
	static AudioClip victorious, defeated, yourturn, boom, splash, shipdeployed;
	public static AudioClip getAudioClip(String path){
		return Applet.newAudioClip(Sound.class.getResource(path));
	}
	static{
		victorious = Sound.getAudioClip("/sounds/victorious.wav");
		defeated = Sound.getAudioClip("/sounds/defeated.wav");
		yourturn = Sound.getAudioClip("/sounds/yourTurn.wav");
		boom = Sound.getAudioClip("/sounds/bomb blast.wav");
		splash = Sound.getAudioClip("/sounds/water splash.wav");
		shipdeployed = Sound.getAudioClip("/sounds/ship deployed.wav");
	}
}
