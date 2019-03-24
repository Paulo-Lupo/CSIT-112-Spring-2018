/*
 * Programming Project 4 - PigLatin.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 19, 2018
 */

/* Creates and displays the Pig Latin Translator GUI */

import javax.swing.JFrame;

public class PigLatin {
	public static void main (String[] args) {
		JFrame frame = new JFrame ("Pig Latin Translator");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		PigLatinPanel panel = new PigLatinPanel();

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
