/*
 * Programming Project 4 - IntroPanel.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 19, 2018
 */

/* This program contains minor applications of java swing */

import java.awt.*;
import javax.swing.*;

public class IntroPanel extends JPanel {
	public IntroPanel() {
		/* changes the layout and background color */
		setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
		setBackground (Color.green);

		/* sets up this panel with two labels. */
		JLabel l1 = new JLabel ("Layout Manager Demonstration");
		JLabel l2 = new JLabel ("Choose a tab to see an example of " +
                              "a layout manager.");

		/* 
		 * creates a invisible vertical glue before and after 
		 * the two labels and a rigid area in between 
		 */
		add (Box.createVerticalGlue()); 
		add (l1);   
		add (Box.createRigidArea (new Dimension (0, 30)));
		add (l2);  
		add (Box.createVerticalGlue());
	}
}
