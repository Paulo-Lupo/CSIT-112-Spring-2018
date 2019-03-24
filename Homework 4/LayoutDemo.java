/*
 * Programming Project 4 - LayoutDemo.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 19, 2018
 */

/* This program sets up the main components of a basic GUI */

import javax.swing.*;

public class LayoutDemo {
	public static void main (String[] args) {
		JFrame frame = new JFrame ("Layout Manager Demo");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		JTabbedPane tp = new JTabbedPane();
		tp.addTab ("Intro", new IntroPanel());   /* IntroPanel object created, added to tp */

		frame.getContentPane().add(tp);
		frame.pack();
		frame.setVisible(true);
	}
}
