/*
 * Programming Project 5 - NumericKeypadPanek.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 26, 2018
 */

/* 
 * This program contains the implementation of a keypad
 * It includes numerical buttons and displays them as they are pressed
 * It also contains a button that clears the display.
 */ 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class NumericKeypadPanel extends JPanel {
	/* creates privates variables that will be used for the labels, panels and buttons */
	private JLabel displayLabel;
	private JPanel keypadPanel, clearpadPanel, displayPanel;
	private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bStar, bPound, bClear;
   
	public NumericKeypadPanel() {
		/* sets a Border Layout to manage the overall presentation */
		setLayout (new BorderLayout());
		
		/* Creates the keypad panel using a grid layout and a red border around it */
		keypadPanel = new JPanel();
		keypadPanel.setLayout(new GridLayout(4,3));
		keypadPanel.setBorder(BorderFactory.createLineBorder (Color.red, 2));
	  
		/* creates and adds the buttons to the keypad panel */
		b0 = new JButton ("0");
		b1 = new JButton ("1");
		b2 = new JButton ("2");
		b3 = new JButton ("3");
		b4 = new JButton ("4");
		b5 = new JButton ("5");
		b6 = new JButton ("6");
		b7 = new JButton ("7");
		b8 = new JButton ("8");
		b9 = new JButton ("9");
		bPound = new JButton ("#");
		bStar = new JButton ("*");
	 
		keypadPanel.add (b7);
		keypadPanel.add (b8);
		keypadPanel.add (b9);
		keypadPanel.add (b4);
		keypadPanel.add (b5);
		keypadPanel.add (b6);
		keypadPanel.add (b1);
		keypadPanel.add (b2);
		keypadPanel.add (b3);
		keypadPanel.add (bStar);
		keypadPanel.add (b0);
		keypadPanel.add (bPound);
		
		/* adds an action for each button */
		b0.addActionListener (new ButtonListener());
		b1.addActionListener (new ButtonListener());
		b2.addActionListener (new ButtonListener());
		b3.addActionListener (new ButtonListener());
		b4.addActionListener (new ButtonListener());
		b5.addActionListener (new ButtonListener());
		b6.addActionListener (new ButtonListener());
		b7.addActionListener (new ButtonListener());
		b8.addActionListener (new ButtonListener());
		b9.addActionListener (new ButtonListener());
		bStar.addActionListener (new ButtonListener());
		bPound.addActionListener (new ButtonListener());
		
		/* creates a Panel for the clear button and adds an action to it */
		clearpadPanel = new JPanel(new GridLayout(1,1));
		bClear = new JButton ("Clear");
		clearpadPanel.add(bClear);
		bClear.addActionListener (new ClearButtonListener());
		
		/* creates the display panel with a border */
		displayPanel = new JPanel(new GridLayout(1,1));
		Border border1 = BorderFactory.createLoweredBevelBorder ();
		Border border2 = BorderFactory.createLineBorder (Color.blue, 3);
		displayPanel.setBorder (BorderFactory.createCompoundBorder (border1, border2));
		displayPanel.setBackground (Color.white);
		
		/* creates a label to display the number entered */
		displayLabel = new JLabel();
		displayPanel.add(displayLabel);
		displayLabel.setPreferredSize(new Dimension(275, 25));
		
		
		/* adds the panels using the border layout */
		add(keypadPanel,BorderLayout.CENTER);
		add(clearpadPanel,BorderLayout.EAST);
		add(displayPanel,BorderLayout.NORTH);
		
	}
   
	/* creates an action for the keypad buttons */
	private class ButtonListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
		   String num = ((JButton)event.getSource()).getText();
    	   
		   /* concatenates the pressed number to the displayed number */
		   displayLabel.setText(displayLabel.getText() + num);
		}     
	}
   
	/* creates an action for the clear button */
	private class ClearButtonListener implements ActionListener {	   
	   	public void actionPerformed (ActionEvent event) {    	    	    	
	   		displayLabel.setText("");
	   	}     
	} 
}
