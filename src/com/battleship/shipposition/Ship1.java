package com.battleship.shipposition;

public class Ship1 {
	TwoDPoint a = new TwoDPoint();;
	TwoDPoint b = new TwoDPoint();
	TwoDPoint c = new TwoDPoint();
	TwoDPoint d = new TwoDPoint();
	
	//private String imgPath;
	
	public Ship1(int a1,int a2,String ai, int b1,int b2,String bi, int c1,int c2,String ci, int d1,int d2,String di){
		a.set(a1, a2, ai);
		b.set(b1, b2, bi);
		c.set(c1, c2, ci);
		d.set(d1, d2, di);
	}
	
	public TwoDPoint getA() {
		return a;
	}
	public TwoDPoint getB() {
		return b;
	}
	public TwoDPoint getC() {
		return c;
	}
	public TwoDPoint getD() {
		return d;
	}

	
}
