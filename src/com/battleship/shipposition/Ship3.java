package com.battleship.shipposition;

public class Ship3 {
	TwoDPoint a = new TwoDPoint();;
	TwoDPoint b = new TwoDPoint();
	//private String imgPath;
	
	public Ship3(int a1,int a2,String ai, int b1,int b2,String bi){
		a.set(a1, a2, ai);
		b.set(b1, b2, bi);
		
	}
	
	public TwoDPoint getA() {
		return a;
	}
	public TwoDPoint getB() {
		return b;
	}

}
