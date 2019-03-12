package com.ibm.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

//CardLayout one component override old component
public class HelloWorld extends JFrame {
	public HelloWorld() {
		// TODO Auto-generated constructor stub
		
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//follow default CardLayout which override old component with new component 
		//thats why we have to explicitly set the layout then we can able to see all the component
		

		JLabel l=new JLabel("Hello World");
		JLabel l1=new JLabel("Welcome Shital");
		
		add(l);
		add(l1);
		
		
		
	}

}
