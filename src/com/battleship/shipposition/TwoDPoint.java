package com.battleship.shipposition;

public class TwoDPoint {
	private int x, y;
	private String img;
	
	public TwoDPoint(){
		x=0;
		y=0;
	}
	
	
	public void set(int x, int y, String img) {
		this.x = x;
		this.y = y;
		this.img = img;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String getImg() {
		return img;
	}
	
}
