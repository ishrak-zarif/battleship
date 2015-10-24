package com.battleship;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import com.utility.Utility;

public class Instructions extends JFrame{
	private JLabel Title;
	private JTextArea SubTitle;
	private JLabel SelectDifficulity;
	private JButton EasyMode;
	private JButton HardMode;
	private JButton exitBtn;
	
	public Instructions(){
		super("Battleships");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 800);
		setResizable(false);
		setUndecorated(true);
		setLocationRelativeTo(null);
		
		Image iconImage = Utility.getImage("/graphics/icon.jpg");
		setIconImage(iconImage);
		
		setContentPane(new JLabel(Utility.getImageIcon("/graphics/3.jpg")));
		
		Title = new JLabel();
		Title.setText(("Instructions"));
		Title.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 50));
		Title.setForeground(Color.RED);
		
		Title.setSize(260, 80);
		Title.setLocation(500, 20);
		getContentPane().add(Title);
		
		SubTitle = new JTextArea();
		SubTitle.append("On your turn fire at the \"Opponent Field\" and wait for your turn while computer is firing at \"Home Field\".\n"
				+ "Search for enemy ships, fire at them and try to sink them. You'll hear the sound of a blast when a portion\n"
				+ "of a ship is destroyed. Win the game by sinking all four of your opponent's ships before computer can sink\n"
				+ "all four of yours!");
		SubTitle.setFont(new Font("Serif", Font.CENTER_BASELINE, 20));
		SubTitle.setBackground(Color.LIGHT_GRAY);
		SubTitle.setForeground(Color.BLUE);
		SubTitle.setEditable(false);
		SubTitle.setSize(910, 130);
		SubTitle.setLocation(150, 120);
		getContentPane().add(SubTitle);
		
		SelectDifficulity = new JLabel();
		SelectDifficulity.setText("Select difficulity: ");
		SelectDifficulity.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
		SelectDifficulity.setForeground(Color.RED);
		SelectDifficulity.setSize(250, 60);
		SelectDifficulity.setLocation(500, 420);
		getContentPane().add(SelectDifficulity);
		
		EasyMode = new JButton("Easy Mode");
		EasyMode.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));
		EasyMode.setBackground(Color.WHITE);
		EasyMode.setForeground(Color.MAGENTA);
		EasyMode.setLocation(460, 500);
		EasyMode.setSize(140,60);
		getContentPane().add(EasyMode);
		
		HardMode = new JButton("Hard Mode");
		HardMode.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));
		HardMode.setBackground(Color.WHITE);
		HardMode.setForeground(Color.MAGENTA);
		HardMode.setLocation(640, 500);
		HardMode.setSize(140,60);
		getContentPane().add(HardMode);
		
		Icon exitIcon1 = Utility.getImageIcon("/graphics/exit1.jpg");
		Icon exitIcon2 = Utility.getImageIcon("/graphics/exit2.jpg");;
		exitBtn = new JButton("Exit", exitIcon1);
		exitBtn.setRolloverIcon(exitIcon2);
		exitBtn.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));
		exitBtn.setBounds(560, 600, 120, 60);
		getContentPane().add(exitBtn);
		
		
		setVisible(true);
		
		
		EasyMode.addActionListener(
			new ActionListener() {
					
				@Override
				public void actionPerformed(ActionEvent event) {
					setVisible(false);
					SinglePlayerFrameEasy singlePlayerFrame = new SinglePlayerFrameEasy();
	
				}
			}
		);
		
		HardMode.addActionListener(
			new ActionListener() {
					
				@Override
				public void actionPerformed(ActionEvent event) {
					setVisible(false);
					SinglePlayerFrameHard singlePlayerFrame = new SinglePlayerFrameHard();
	
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
