package com.battleship;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.utility.Utility;

public class MainMenuFrame extends JFrame{
	
	private JButton playBtn;
	private JButton exitBtn;
	
	public MainMenuFrame(){
		super("Battleships");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 800);
//		setSize(1400, 800);
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		Image iconImage = Utility.getImage("/graphics/icon.jpg");
		setIconImage(iconImage);
		
		setContentPane(new JLabel(Utility.getImageIcon("/graphics/1.jpg")));
		Icon playIcon1 = Utility.getImageIcon("/graphics/play1.jpg");
		Icon playIcon2 =Utility.getImageIcon("/graphics/play2.jpg");
		playBtn = new JButton("Play", playIcon1);
		playBtn.setRolloverIcon(playIcon2);
		playBtn.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));
		playBtn.setLocation(470, 480);
		playBtn.setSize(120,60);
		getContentPane().add(playBtn);
		
		Icon exitIcon1 = Utility.getImageIcon("/graphics/exit1.jpg");
		Icon exitIcon2 = Utility.getImageIcon("/graphics/exit2.jpg");;
		exitBtn = new JButton("Exit", exitIcon1);
		exitBtn.setRolloverIcon(exitIcon2);
		exitBtn.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));
		exitBtn.setBounds(610, 480, 120, 60);
		getContentPane().add(exitBtn);
		
		setVisible(true);
		
		playBtn.addActionListener(
			new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent event) {
					setVisible(false);
					//SinglePlayerFrameHard singlePlayerFrame = new SinglePlayerFrameHard();
					Instructions instructions = new Instructions();
					
				}
			}
		);
		
		
		exitBtn.addActionListener(
			new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent event) {
					System.exit(0);
				}
			}
		);
		
	}
	
}
