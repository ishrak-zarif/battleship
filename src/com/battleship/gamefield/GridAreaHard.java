package com.battleship.gamefield;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

import com.battleship.shipposition.ShipPosition;



public class GridAreaHard extends JPanel {
	protected int area [][] =
		{{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	}};
	static protected int myarea [][] =
		{{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	}};
	static protected int enemyarea [][] =
		{{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	},
		{	0,	0,	0,	0,	0,	0,	0,	0,	0,	0	}};

	private String title;
	private Rectangle gridRects[][] = new Rectangle[10][10];
	private static ShipPosition ememyShipPos = new ShipPosition();
	private static ShipPosition myShipPos = new ShipPosition();
	
	public GridAreaHard(String title)
	{
		this.title = title;
		for (int y=0; y<10; y++)
			for (int x=0; x<10; x++)
				gridRects[x][y] = new Rectangle(x*25,y*25,25,25);

		setOpaque(false);
		
	}


	public Dimension getPreferredSize() {
		return new Dimension(250,270);
	}
	
	public static int[][] getMyarea() {
		return myarea;
	}


	public static void setMyarea(int myareaX, int myareaY) {
		myarea[myareaX][myareaY] = 1;
	}


	public static int[][] getEnemyarea() {
		return enemyarea;
	}


	public static void setEnemyarea(int enemyareaX, int enemyareaY) {
		enemyarea[enemyareaX][enemyareaY] = 1;
	}

	
	
	public void setEnemyShipPos(ShipPosition shipPosition) {
		ememyShipPos = shipPosition;
	}
	public void setMyShipPos(ShipPosition shipPosition) {
		myShipPos = shipPosition;
	}
	
	public ShipPosition getMyShipPos() {
		return myShipPos;
	}
	public ShipPosition getEnemyShipPos() {
		return ememyShipPos;
	}
	

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;

		GradientPaint gp = new GradientPaint(0.0f, 0.0f, new Color(40,200,140), 250.0f, 250.0f, new Color(40,180,210));
		g2.setPaint(gp);
		g2.fillRect(0, 0, 250, 250);

		//g2.setColor(new Color(0,100,90));
		g2.setColor(Color.black);
		for (int i=1; i<10; i++){
			g2.drawLine(i*25,0,i*25,250);
			g2.drawLine(0,i*25,250,i*25);
		}
		//g2.setColor(Color.black);
		g2.draw3DRect(0,0,250,250,false);

		//g2.setColor(new Color(0,60,60));
		g2.drawString(title, 125-(title.length()*4), 268);
	}

}