package com.ibm.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Add2Num extends JFrame implements ActionListener{

	JTextField t1,t2;
	JButton btn;
	JLabel l;
	
	public Add2Num() {
		// TODO Auto-generated constructor stub
	     t1=new JTextField(20);
		 t2=new JTextField(20);
		 btn=new JButton("OK");
		 l=new JLabel("RESULT");
		
		btn.addActionListener(this);//ActionListener is an interface
		
		
		add(t1);
		add(t2);
		add(btn);
		add(l);
		
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		// TODO Auto-generated method stub
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		int value=num1+num2;
		l.setText(value+"");
		
	}
}
