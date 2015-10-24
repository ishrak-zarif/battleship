package com.battleship.shipposition;

public class ShipPosition {

	Ship1 s1;
	Ship2 s2;
	Ship3 s3;
	Ship4 s4;
	
	public Ship1 getS1() {
		return s1;
	}

	public Ship2 getS2() {
		return s2;
	}

	public Ship3 getS3() {
		return s3;
	}
	
	public Ship4 getS4() {
		return s4;
	}

	public void setShipPosition(int s1a1, int s1a2, String s11, int s1b1, int s1b2, String s12, int s1c1, int s1c2, String s13, int s1d1, int s1d2, String s14, 
			int s2a1, int s2a2, String s21, int s2b1, int s2b2, String s22, int s2c1, int s2c2, String s23,
			int s3a1, int s3a2, String s31, int s3b1, int s3b2, String s32, 
			int s4a1, int s4a2, String s41, int s4b1, int s4b2, String s42, int s4c1, int s4c2, String s43){
		s1 = new Ship1(s1a1,s1a2,s11, s1b1,s1b2,s12, s1c1,s1c2,s13, s1d1,s1d2,s14);
		s2 = new Ship2(s2a1,s2a2,s21, s2b1,s2b2,s22, s2c1,s2c2,s23);
		s3 = new Ship3(s3a1,s3a2,s31, s3b1,s3b2,s32);
		s4 = new Ship4(s4a1,s4a2,s41, s4b1,s4b2,s42, s4c1,s4c2,s43);
		
		
	}
	
}
