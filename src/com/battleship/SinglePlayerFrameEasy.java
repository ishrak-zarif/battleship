package com.battleship;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.battleship.gamefield.PlayingFieldEasy;
import com.utility.Utility;

public class SinglePlayerFrameEasy extends JFrame{
	private PlayingFieldEasy myGame;
	private JButton exitBtn;
	private JButton changeDifficulty;
	
	public SinglePlayerFrameEasy(){
		super("Battleships");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 800);
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		Image iconImage = Utility.getImage("/graphics/icon.jpg");
		setIconImage(iconImage);
		
//		setContentPane(new JLabel(new ImageIcon(getClass().getResource("/graphics/4.jpg"))));
		setContentPane(new JLabel(Utility.getImageIcon("/graphics/4.jpg")));
		
		
		myGame = new PlayingFieldEasy("BattleShip Game in Easy Mode");
		myGame.setLocation(260, 20);
		myGame.setSize(650,350);
		getContentPane().add(myGame, BorderLayout.CENTER);
		
		Icon exitIcon1 = Utility.getImageIcon("/graphics/exit1.jpg");
		Icon exitIcon2 = Utility.getImageIcon("/graphics/exit2.jpg");;
		exitBtn = new JButton("Exit", exitIcon1);
		exitBtn.setRolloverIcon(exitIcon2);
		exitBtn.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));
		exitBtn.setBounds(530, 650, 120, 60);
		getContentPane().add(exitBtn);
		
		Icon changeDifficultyIcon1 = Utility.getImageIcon("/graphics/change_button1.jpg");
		Icon changeDifficultyIcon2 = Utility.getImageIcon("/graphics/change_button2.jpg");
		changeDifficulty = new JButton("Change Difficulty To Hard", changeDifficultyIcon1);
		changeDifficulty.setRolloverIcon(changeDifficultyIcon2);
		changeDifficulty.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));
		changeDifficulty.setSize(320, 60);
		changeDifficulty.setLocation(420, 580);
		getContentPane().add(changeDifficulty);
	
		setVisible(true);
		
		exitBtn.addActionListener(
			new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent event) {
					System.exit(0);
				}
			}
		);
		
		changeDifficulty.addActionListener(
			new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent event) {
					//setVisible(false);
					dispose();
					SinglePlayerFrameHard singlePlayerFrame = new SinglePlayerFrameHard();
				}
			}
		);
	}

}
