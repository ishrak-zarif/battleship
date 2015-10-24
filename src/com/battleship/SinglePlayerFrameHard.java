package com.battleship;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.battleship.gamefield.PlayingFieldHard;
import com.utility.Utility;

public class SinglePlayerFrameHard extends JFrame{
	private PlayingFieldHard myGame;
	private JButton exitBtn;
	private JButton changeDifficulty;
	
	public SinglePlayerFrameHard(){
		super("Battleships");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 800);
//		setSize(1400, 800);
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		Image iconImage = Utility.getImage("/graphics/icon.jpg");
		setIconImage(iconImage);
		
//		setContentPane(new JLabel(new ImageIcon(getClass().getResource("/graphics/2.jpg"))));
		setContentPane(new JLabel(Utility.getImageIcon("/graphics/2.jpg")));
		
		
		myGame = new PlayingFieldHard("BattleShip Game in Hard Mode");
//		myGame.setLocation(100, 20);
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
		changeDifficulty = new JButton("Change Difficulty To Easy", changeDifficultyIcon1);
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
					SinglePlayerFrameEasy singlePlayerFrame = new SinglePlayerFrameEasy();
				}
			}
		);
	}

}
