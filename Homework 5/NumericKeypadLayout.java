/*
 * Programming Project 5 - NumericKeypadLayout.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 26, 2018
 */

/* This program sets up the main Keypad GUI components */

import java.awt.Dimension;
import javax.swing.JFrame;

public class NumericKeypadLayout {
	public static void main (String[] args) {
		JFrame frame = new JFrame ("Numeric Keypad");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      
		frame.setPreferredSize (new Dimension(275, 250));
      
		frame.getContentPane().add(new NumericKeypadPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
