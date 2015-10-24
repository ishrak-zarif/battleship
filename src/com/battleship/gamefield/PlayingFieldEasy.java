package com.battleship.gamefield;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import com.battleship.shipposition.ShipPosition;
import com.utility.Utility;


public class PlayingFieldEasy extends JPanel {
	private JPanel fields;

	private LeftFieldEasy myOcean;
	private RightFieldEasy enemyOcean;


	private ShipPosition[] shipPos;
	private ShipPosition playerShipPos, enemyShipPos;

	final String a11 = new String("/graphics/Ships pic/Horizontal/a11.png");
	final String a21 = new String("/graphics/Ships pic/Horizontal/a21.png");
	final String a31 = new String("/graphics/Ships pic/Horizontal/a31.png");
	final String a41 = new String("/graphics/Ships pic/Horizontal/a41.png");
	final String b11 = new String("/graphics/Ships pic/Horizontal/b11.png");
	final String b21 = new String("/graphics/Ships pic/Horizontal/b21.png");
	final String b31 = new String("/graphics/Ships pic/Horizontal/b31.png");
	final String c11 = new String("/graphics/Ships pic/Horizontal/c11.png");
	final String c21 = new String("/graphics/Ships pic/Horizontal/c21.png");
	final String d11 = new String("/graphics/Ships pic/Horizontal/d11.png");
	final String d21 = new String("/graphics/Ships pic/Horizontal/d21.png");
	final String d31 = new String("/graphics/Ships pic/Horizontal/d31.png");


	final String a12 = new String("/graphics/Ships pic/Vertical/a12.png");
	final String a22 = new String("/graphics/Ships pic/Vertical/a22.png");
	final String a32 = new String("/graphics/Ships pic/Vertical/a32.png");
	final String a42 = new String("/graphics/Ships pic/Vertical/a42.png");
	final String b12 = new String("/graphics/Ships pic/Vertical/b12.png");
	final String b22 = new String("/graphics/Ships pic/Vertical/b22.png");
	final String b32 = new String("/graphics/Ships pic/Vertical/b32.png");
	final String c12 = new String("/graphics/Ships pic/Vertical/c12.png");
	final String c22 = new String("/graphics/Ships pic/Vertical/c22.png");
	final String d12 = new String("/graphics/Ships pic/Vertical/d12.png");
	final String d22 = new String("/graphics/Ships pic/Vertical/d22.png");
	final String d32 = new String("/graphics/Ships pic/Vertical/d32.png");

	public PlayingFieldEasy(String gameTitle) {
		setLayout(new BorderLayout());

		ShipPosition[] shipPos = new ShipPosition[10];
		shipPos[0] = new ShipPosition();
		shipPos[1] = new ShipPosition();
		shipPos[2] = new ShipPosition();
		shipPos[3] = new ShipPosition();
		shipPos[4] = new ShipPosition();
		shipPos[5] = new ShipPosition();
		shipPos[6] = new ShipPosition();
		shipPos[7] = new ShipPosition();
		shipPos[8] = new ShipPosition();
		shipPos[9] = new ShipPosition();

		shipPos[0].setShipPosition(0,0, a11, 1,0, a21, 2,0, a31, 3,0, a41, 5,2, b32, 5,3, b22, 5,4, b12, 7,7, c22, 7,8, c12, 2,8, d11, 3,8, d21, 4,8, d31);
		shipPos[1].setShipPosition(8,1, a42, 8,2, a32, 8,3, a22, 8,4, a12, 3,6, b11, 4,6, b21, 5,6, b31, 0,8, c22, 0,9, c12, 1,1, d11, 2,1, d21, 3,1, d31);
		shipPos[2].setShipPosition(4,4, a11, 5,4, a21, 6,4, a31, 7,4, a41, 0,7, b32, 0,8, b22, 0,9, b12, 4,0, c11, 5,0, c21, 2,6, d32, 2,7, d22, 2,8, d12);
		shipPos[3].setShipPosition(4,9, a11, 5,9, a21, 6,9, a31, 7,9, a41, 1,2, b32, 1,3, b22, 1,4, b12, 9,3, c22, 9,4, c12, 3,7, d11, 4,7, d21, 5,7, d31);
		shipPos[4].setShipPosition(2,6, a11, 3,6, a21, 4,6, a31, 5,6, a41, 8,1, b32, 8,2, b22, 8,3, b12, 1,3, c11, 2,3, c21, 9,7, d32, 9,8, d22, 9,9, d12);
		shipPos[5].setShipPosition(3,1, a42, 3,2, a32, 3,3, a22, 3,4, a12, 3,9, b11, 4,9, b21, 5,9, b31, 1,4, c11, 2,4, c21, 7,3, d32, 7,4, d22, 7,5, d12);
		shipPos[6].setShipPosition(2,5, a11, 3,5, a21, 4,5, a31, 5,5, a41, 4,7, b32, 4,8, b22, 4,9, b12, 7,7, c11, 8,7, c21, 5,1, d11, 6,1, d21, 7,1, d31);
		shipPos[7].setShipPosition(1,3, a42, 1,4, a32, 1,5, a22, 1,6, a12, 1,1, b11, 2,1, b21, 3,1, b31, 8,4, c22, 8,5, c12, 6,6, d32, 6,7, d22, 6,8, d12);
		shipPos[8].setShipPosition(1,0, a11, 2,0, a21, 3,0, a31, 4,0, a41, 4,2, b32, 4,3, b22, 4,4, b12, 2,7, c11, 3,7, c21, 6,8, d11, 7,8, d21, 8,8, d31);
		shipPos[9].setShipPosition(1,3, a11, 2,3, a21, 3,3, a31, 4,3, a41, 2,6, b32, 2,7, b22, 2,8, b12, 3,7, c22, 3,8, c12, 6,5, d11, 7,5, d21, 8,5, d31);

		fields = new JPanel();

		Random randomNumLeft = new Random();
		Random randomNumRight = new Random();

		myOcean = new LeftFieldEasy();
		playerShipPos = shipPos[randomNumLeft.nextInt(10)];
		myOcean.setMyShipPos(playerShipPos);

		enemyOcean = new RightFieldEasy();
		enemyShipPos = shipPos[randomNumRight.nextInt(10)];
		enemyOcean.setEnemyShipPos(enemyShipPos);
		enemyOcean.setPlayerOcean(myOcean);

		fields.setLayout(new FlowLayout());
		fields.add(myOcean);
		fields.add(enemyOcean);

		fields.setBorder(new TitledBorder(gameTitle));

		add(fields, BorderLayout.CENTER);

		Sound.shipdeployed.play();

	}
}


class LeftFieldEasy extends GridAreaEasy {
	ShipPosition shipPositionLeft = new ShipPosition();

	public LeftFieldEasy() {
		super("Home Field");
	}
	public void setMyShipPos(ShipPosition shipPos) {
		super.setMyShipPos(shipPos);
		shipPositionLeft = shipPos;
	}

	public void paintComponent(Graphics g) {
		//Image img1 = Toolkit.getDefaultToolkit().getImage("F:/java game project/Background and logo/Ships pic/Horizontal/a11.jpg");
		//Image img1 = (new ImageIcon("F:/java game project/Background and logo/Ships pic/Horizontal/a11.jpg")).getImage();
//		Image img1 = (new ImageIcon(shipPositionLeft.getS1().getA().getImg())).getImage();
//		Image img2 = (new ImageIcon(shipPositionLeft.getS1().getB().getImg())).getImage();
//		Image img3 = (new ImageIcon(shipPositionLeft.getS1().getC().getImg())).getImage();
//		Image img4 = (new ImageIcon(shipPositionLeft.getS1().getD().getImg())).getImage();
//		Image img5 = (new ImageIcon(shipPositionLeft.getS2().getA().getImg())).getImage();
//		Image img6 = (new ImageIcon(shipPositionLeft.getS2().getB().getImg())).getImage();
//		Image img7 = (new ImageIcon(shipPositionLeft.getS2().getC().getImg())).getImage();
//		Image img8 = (new ImageIcon(shipPositionLeft.getS3().getA().getImg())).getImage();
//		Image img9 = (new ImageIcon(shipPositionLeft.getS3().getB().getImg())).getImage();
//		Image img10 = (new ImageIcon(shipPositionLeft.getS4().getA().getImg())).getImage();
//		Image img11 = (new ImageIcon(shipPositionLeft.getS4().getB().getImg())).getImage();
//		Image img12 = (new ImageIcon(shipPositionLeft.getS4().getC().getImg())).getImage();
		
		Image img1 = Utility.getImage(shipPositionLeft.getS1().getA().getImg());
		Image img2 = Utility.getImage(shipPositionLeft.getS1().getB().getImg());
		Image img3 = Utility.getImage(shipPositionLeft.getS1().getC().getImg());
		Image img4 = Utility.getImage(shipPositionLeft.getS1().getD().getImg());
		Image img5 = Utility.getImage(shipPositionLeft.getS2().getA().getImg());
		Image img6 = Utility.getImage(shipPositionLeft.getS2().getB().getImg());
		Image img7 = Utility.getImage(shipPositionLeft.getS2().getC().getImg());
		Image img8 = Utility.getImage(shipPositionLeft.getS3().getA().getImg());
		Image img9 = Utility.getImage(shipPositionLeft.getS3().getB().getImg());
		Image img10 = Utility.getImage(shipPositionLeft.getS4().getA().getImg());
		Image img11 = Utility.getImage(shipPositionLeft.getS4().getB().getImg());
		Image img12 = Utility.getImage(shipPositionLeft.getS4().getC().getImg());

		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;

		g2.drawImage(img1, shipPositionLeft.getS1().getA().getX()*25, shipPositionLeft.getS1().getA().getY()*25, this);
		g2.drawImage(img2, shipPositionLeft.getS1().getB().getX()*25, shipPositionLeft.getS1().getB().getY()*25, this);
		g2.drawImage(img3, shipPositionLeft.getS1().getC().getX()*25, shipPositionLeft.getS1().getC().getY()*25, this);
		g2.drawImage(img4, shipPositionLeft.getS1().getD().getX()*25, shipPositionLeft.getS1().getD().getY()*25, this);
		g2.drawImage(img5, shipPositionLeft.getS2().getA().getX()*25, shipPositionLeft.getS2().getA().getY()*25, this);
		g2.drawImage(img6, shipPositionLeft.getS2().getB().getX()*25, shipPositionLeft.getS2().getB().getY()*25, this);
		g2.drawImage(img7, shipPositionLeft.getS2().getC().getX()*25, shipPositionLeft.getS2().getC().getY()*25, this);
		g2.drawImage(img8, shipPositionLeft.getS3().getA().getX()*25, shipPositionLeft.getS3().getA().getY()*25, this);
		g2.drawImage(img9, shipPositionLeft.getS3().getB().getX()*25, shipPositionLeft.getS3().getB().getY()*25, this);
		g2.drawImage(img10, shipPositionLeft.getS4().getA().getX()*25, shipPositionLeft.getS4().getA().getY()*25, this);
		g2.drawImage(img11, shipPositionLeft.getS4().getB().getX()*25, shipPositionLeft.getS4().getB().getY()*25, this);
		g2.drawImage(img12, shipPositionLeft.getS4().getC().getX()*25, shipPositionLeft.getS4().getC().getY()*25, this);

	}
	public Graphics paintCom(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		return g2;
	}
}


class RightFieldEasy extends GridAreaEasy {
	private LeftFieldEasy leftOcean;
	private Point selected;
	protected Point currentLocMy;

	private int myAttackCount = 0;
	private int enemyAttackCount = 0;

	Image fire = Utility.getImage("/graphics/fire.gif");
	Image water = Utility.getImage("/graphics/water.gif");
	Image actionImg;

	//ShipPosition shipPositionRight = new ShipPosition();
	public RightFieldEasy() {
		super("Opponent Field");
		//leftOcean = new LeftFieldEasy();
		addMouseListener(new MouseHandler());
	}

	public void setEnemyShipPos(ShipPosition shipPos) {
		super.setEnemyShipPos(shipPos);
	}

	public void setPlayerOcean(LeftFieldEasy leftOcean) {
		this.leftOcean = leftOcean;
	}

	private class MouseHandler extends MouseAdapter {
		int attackState = 0;
		public void mousePressed(MouseEvent e) {
			if(e.getModifiers() == e.BUTTON1_MASK) {
				selected = new Point(e.getX(), e.getY());
				//System.out.println(selected);                                                           //sysout
				for(int i=0; i<250; i=i+25){

					int j = e.getX()/25;
					int k = e.getY()/25;
					currentLocMy = new Point(j, k);

					System.out.println("currentLocMy " + currentLocMy);                                                     //sysout
					System.out.println("Enemy "+getEnemyShipPos().getS1().getA().getX()+" "+getEnemyShipPos().getS1().getA().getY());                           //sysout
					System.out.println("My "+getMyShipPos().getS1().getA().getX()+" "+getMyShipPos().getS1().getA().getY());                              //sysout

					attackState = checkMyAttack(currentLocMy, getEnemyShipPos());
					if ( attackState > 0 ) {
						if (attackState == 2 ) myAttackCount++;

						if (myAttackCount == 12){
							//System.out.println("You Win");
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							Sound.victorious.play();
							JOptionPane.showMessageDialog(null, "You Win");
							System.exit(0);
						}


						try {
							Thread.sleep(2500);
						} catch (InterruptedException e1) {
							System.err.println(e1);
						}

						if (myAttackCount < 12) {
							attackState = checkEnemyAttack(getMyShipPos());
							if (attackState == 2 ) enemyAttackCount++;
							if (enemyAttackCount == 12){
								//System.out.println("You Lose");
								try {
									Thread.sleep(2000);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
								Sound.defeated.play();
								JOptionPane.showMessageDialog(null, "You Lose");
								System.exit(0);
							}

							try {
								Thread.sleep(2500);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}

							Sound.yourturn.play();
						}
					}
					break;
				}
			}
		}
		public Graphics paintCom(Graphics g){
			Graphics2D g2 = (Graphics2D)g;
			return g2;
		}

		public int checkMyAttack(Point currentLoc2, ShipPosition shipPos) {
			int action = 0;
			int tempArea[][]= new int[10][10];

			tempArea = getEnemyarea();

			if(tempArea[currentLoc2.y][currentLoc2.x] == 0){
				if( (currentLoc2.x == shipPos.getS1().getA().getX() && currentLoc2.y == shipPos.getS1().getA().getY()) ||
						(currentLoc2.x == shipPos.getS1().getB().getX() && currentLoc2.y == shipPos.getS1().getB().getY()) ||
						(currentLoc2.x == shipPos.getS1().getC().getX() && currentLoc2.y == shipPos.getS1().getC().getY()) ||
						(currentLoc2.x == shipPos.getS1().getD().getX() && currentLoc2.y == shipPos.getS1().getD().getY()) ||
						(currentLoc2.x == shipPos.getS2().getA().getX() && currentLoc2.y == shipPos.getS2().getA().getY()) ||
						(currentLoc2.x == shipPos.getS2().getB().getX() && currentLoc2.y == shipPos.getS2().getB().getY()) ||
						(currentLoc2.x == shipPos.getS2().getC().getX() && currentLoc2.y == shipPos.getS2().getC().getY()) ||
						(currentLoc2.x == shipPos.getS3().getA().getX() && currentLoc2.y == shipPos.getS3().getA().getY()) ||
						(currentLoc2.x == shipPos.getS3().getB().getX() && currentLoc2.y == shipPos.getS3().getB().getY()) ||
						(currentLoc2.x == shipPos.getS4().getA().getX() && currentLoc2.y == shipPos.getS4().getA().getY()) ||
						(currentLoc2.x == shipPos.getS4().getB().getX() && currentLoc2.y == shipPos.getS4().getB().getY()) ||
						(currentLoc2.x == shipPos.getS4().getC().getX() && currentLoc2.y == shipPos.getS4().getC().getY()) ){
					//System.out.println("Hit");                                                                                  //sysout
					action = 2;
					Sound.boom.play();
					actionImg = fire;
					//Graphics g = this.paintCom(getGraphics());
					//g.drawImage(fire, currentLoc2.x*25, currentLoc2.y*25, null);

				}
				else{
					//System.out.println("Miss");                                                                                 //sysout
					action = 1;
					Sound.splash.play();
					actionImg = water;
				}

				Graphics g = this.paintCom(getGraphics());
				g.drawImage(actionImg, currentLoc2.x*25, currentLoc2.y*25, null);
				setEnemyarea(currentLoc2.y, currentLoc2.x);

			}

			return action;

		}

		public int checkEnemyAttack(ShipPosition myShipPos) {
			Point currentLocEnemy;
			int action = 0;

			Random j = new Random();
			Random k = new Random();
			boolean attachSuccess;
			int maxHitCount = 200;
			while (true) {
				attachSuccess = false;

				currentLocEnemy = new Point(j.nextInt(10), k.nextInt(10));
				if( (currentLocEnemy.x == 0 && currentLocEnemy.y == 1) || (currentLocEnemy.x == 0 && currentLocEnemy.y == 2) || (currentLocEnemy.x == 0 && currentLocEnemy.y == 3) ||
						(currentLocEnemy.x == 0 && currentLocEnemy.y == 4) || (currentLocEnemy.x == 0 && currentLocEnemy.y == 5) || (currentLocEnemy.x == 0 && currentLocEnemy.y == 6) ||
						(currentLocEnemy.x == 1 && currentLocEnemy.y == 7) || (currentLocEnemy.x == 1 && currentLocEnemy.y == 8) || (currentLocEnemy.x == 1 && currentLocEnemy.y == 9) ||
						(currentLocEnemy.x == 2 && currentLocEnemy.y == 2) || (currentLocEnemy.x == 2 && currentLocEnemy.y == 9) || (currentLocEnemy.x == 4 && currentLocEnemy.y == 1) ||
						(currentLocEnemy.x == 5 && currentLocEnemy.y == 8) || (currentLocEnemy.x == 6 && currentLocEnemy.y == 0) || (currentLocEnemy.x == 6 && currentLocEnemy.y == 2) ||
						(currentLocEnemy.x == 6 && currentLocEnemy.y == 3) || (currentLocEnemy.x == 7 && currentLocEnemy.y == 0) || (currentLocEnemy.x == 7 && currentLocEnemy.y == 2) ||
						(currentLocEnemy.x == 7 && currentLocEnemy.y == 6) || (currentLocEnemy.x == 8 && currentLocEnemy.y == 0) || (currentLocEnemy.x == 8 && currentLocEnemy.y == 6) ||
						(currentLocEnemy.x == 8 && currentLocEnemy.y == 9) || (currentLocEnemy.x == 9 && currentLocEnemy.y == 0) || (currentLocEnemy.x == 9 && currentLocEnemy.y == 1) ||
						(currentLocEnemy.x == 9 && currentLocEnemy.y == 2) || (currentLocEnemy.x == 9 && currentLocEnemy.y == 5) || (currentLocEnemy.x == 9 && currentLocEnemy.y == 6) ){}
				else
				{
					System.out.println("currentLocEnemy" + currentLocEnemy);                                                                            //sysout

					int tempArea[][]= new int[10][10];

					tempArea = getMyarea();

					if(tempArea[currentLocEnemy.y][currentLocEnemy.x] == 0){
						if( (currentLocEnemy.x == myShipPos.getS1().getA().getX() && currentLocEnemy.y == myShipPos.getS1().getA().getY()) ||
								(currentLocEnemy.x == myShipPos.getS1().getB().getX() && currentLocEnemy.y == myShipPos.getS1().getB().getY()) ||
								(currentLocEnemy.x == myShipPos.getS1().getC().getX() && currentLocEnemy.y == myShipPos.getS1().getC().getY()) ||
								(currentLocEnemy.x == myShipPos.getS1().getD().getX() && currentLocEnemy.y == myShipPos.getS1().getD().getY()) ||
								(currentLocEnemy.x == myShipPos.getS2().getA().getX() && currentLocEnemy.y == myShipPos.getS2().getA().getY()) ||
								(currentLocEnemy.x == myShipPos.getS2().getB().getX() && currentLocEnemy.y == myShipPos.getS2().getB().getY()) ||
								(currentLocEnemy.x == myShipPos.getS2().getC().getX() && currentLocEnemy.y == myShipPos.getS2().getC().getY()) ||
								(currentLocEnemy.x == myShipPos.getS3().getA().getX() && currentLocEnemy.y == myShipPos.getS3().getA().getY()) ||
								(currentLocEnemy.x == myShipPos.getS3().getB().getX() && currentLocEnemy.y == myShipPos.getS3().getB().getY()) ||
								(currentLocEnemy.x == myShipPos.getS4().getA().getX() && currentLocEnemy.y == myShipPos.getS4().getA().getY()) ||
								(currentLocEnemy.x == myShipPos.getS4().getB().getX() && currentLocEnemy.y == myShipPos.getS4().getB().getY()) ||
								(currentLocEnemy.x == myShipPos.getS4().getC().getX() && currentLocEnemy.y == myShipPos.getS4().getC().getY()) ){
							//System.out.println("Hit by Enemy");                                                                                          //sysout
							action = 2;
							Sound.boom.play();
							actionImg = fire;
	//						Graphics g = this.paintCom(getGraphics());
	//						g.drawImage(fire, currentLocEnemy.x*25, currentLocEnemy.y*25, null);
							//graphicObj.getGraphics().drawImage(fire, currentLocEnemy.x*25, currentLocEnemy.y*25, null);

						}
						else{
							//System.out.println("Miss by Enemy");                                                                                          //sysout
							action = 1;
							Sound.splash.play();
							actionImg = water;
	//						Graphics g = this.paintCom(getGraphics());
	//						g.drawImage(water, currentLocEnemy.x*25, currentLocEnemy.y*25, null);
							//graphicObj.getGraphics().drawImage(fire, currentLocEnemy.x*25, currentLocEnemy.y*25, null);

						}

						//leftOcean.paintComponent(g);
						//Graphics2D g2 = (Graphics2D)g;

						//leftOcean.getGraphics().drawImage(actionImg, currentLocEnemy.x*25, currentLocEnemy.y*25, null);
						Graphics lg = leftOcean.paintCom(leftOcean.getGraphics());
						lg.drawImage(actionImg, currentLocEnemy.x*25, currentLocEnemy.y*25, null);

						setMyarea(currentLocEnemy.y, currentLocEnemy.x);
						attachSuccess = true;
					}
				}

				if (attachSuccess && maxHitCount > 0) break;
				maxHitCount--;
			}// end while
			return action;

		}// end function checkEnemyAttack
	}

}
