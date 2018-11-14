package com.james.rubricmaker;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class maker {
	
	private JFrame mFrame;
	public JButton submit;
	public JButton reset;
	public JButton addCat;
	public JButton addPoint;
	public JTextField notes;
	
	public String projectName;
	public String className;
	public String stuName;
	public String teacherName;
	
	public JTextField[] cat = new JTextField[999];
	public JTextField[] score = new JTextField[999];
	public String[] catString = new String[999];
	public String[] scoreString = new String[999];
	public int[] scoreInt = new int[999];
	
	public JLabel noteLabel = new JLabel("Teacher's Notes :");
	public JLabel FinalScoreL = new JLabel("Final Grade :");
	
	public maker(String prjName, String clName, String stName, String teachName) {
		projectName = prjName;
		className = clName;
		stuName = stName;
		teacherName = teachName;
		init();
	}
	
	public void init() {
		mFrame = new JFrame("James Rubric Maker");
		mFrame.setBounds(100, 100, 1000, 900);
		mFrame.setVisible(true);
		mFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mFrame.getContentPane().setLayout(null);
		
		noteLabel.setBounds(125, 450, 300, 400);
		mFrame.getContentPane().add(noteLabel);
	}
	
	
	public void increaseScreenX() {
		// Increase width of notes
	}
	
	public void increaseScreenY() {
		// Screen
		// Notes
		// Buttons
	}
	
	public void send() {
		
	}
	
	public void reset() {
		
	}
	
}
