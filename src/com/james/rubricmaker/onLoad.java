package com.james.rubricmaker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class onLoad implements ActionListener {

	public JFrame rub;
	public JTextField prjName;
	public JTextField prjClass;
	public JTextField prjStuName;
	public JTextField prjTeacherName;
	private JButton enter;
	
	public static void main(String[] args) {
		onLoad mainclass = new onLoad();
		mainclass.rub.setVisible(true);
	}

	public onLoad() {
		rub = new JFrame();
		rub.setTitle("Rubric Maker");
		rub.setBounds(50, 50, 235, 200);
		rub.getContentPane().setLayout(null);
		rub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		enter = new JButton("Continue");
		enter.setBounds(15, 125, 200, 25);
		rub.getContentPane().add(enter);
		enter.addActionListener(this);
		rub.setResizable(false);
		// Instance Labels & Text Fields
		prjName = new JTextField("Project Name");
		prjClass = new JTextField("Class Name");
		prjStuName = new JTextField("Student Name");
		prjTeacherName = new JTextField("Teacher Name");
		// Set Bounds
		prjTeacherName.setBounds(15, 75, 200, 25);
		prjClass.setBounds(15, 100, 200, 25);
		prjStuName.setBounds(15, 50, 200, 25);
		prjName.setBounds(15, 25, 200, 25);
		// Add to pane
		rub.getContentPane().add(prjTeacherName);
		rub.getContentPane().add(prjClass);
		rub.getContentPane().add(prjStuName);
		rub.getContentPane().add(prjName);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(enter)) {
			rub.setVisible(false);
			maker mak = new maker(prjName.getText(), prjClass.getText(), prjStuName.getText(), prjTeacherName.getText());
		}	
	}
}
