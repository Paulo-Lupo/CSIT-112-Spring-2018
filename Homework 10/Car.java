/*
 * Programming Project 10 - Car.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 22, 2018
 */

/* This program creates and presents the program frame for the CarPanel */

import javax.swing.JFrame;

public class Car {
	public static void main (String[] args) {
		JFrame frame = new JFrame ("Car");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		CarPanel panel = new CarPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}
