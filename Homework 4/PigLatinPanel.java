/*
 * Programming Project 4 - PigLatinPanel.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 19, 2018
 */

/* This Program implements the Pig Latin Translator with a GUI */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PigLatinPanel extends JPanel {
	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField piglatin;

	/* constructor: Sets up the main GUI components */
	public PigLatinPanel() {
		inputLabel = new JLabel ("Enter a sentence:");
		outputLabel = new JLabel ("Sentence in Pig Latin:");
		resultLabel = new JLabel ("---");

		piglatin = new JTextField (25);
		piglatin.addActionListener (new PhraseListener());

		add (inputLabel);
		add (piglatin);
		add (outputLabel);
		add (resultLabel);

		setPreferredSize (new Dimension(300, 120));
		setBackground (Color.yellow);
     
	}

   	/* represents an action listener for the initial phrase input field */
   	private class PhraseListener implements ActionListener {	   
   		/* performs the translation when the enter key is pressed in the text field */
   		public void actionPerformed (ActionEvent event) {
         
   			String text = piglatin.getText();

   			text = PigLatinTranslator.translate(text);

   			resultLabel.setText (text);
   		}
   	}
}
