/*
 * Programming Project 10 - QuoteOptionsPanel.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 22, 2018
 */

/* 
 * This program is a modified version of the program written by Lewis/Loftus 
 * from chapter 5. It contains buttons that prints quotes when pressed
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuoteOptionsPanel extends JPanel {
	private JLabel quote;
	private JRadioButton comedy, philosophy, carpentry, inspirational, heartBreak, happy;
	private String comedyQuote, philosophyQuote, carpentryQuote, inspirationalQuote, heartBreakQuote, happyQuote;
	private String[] quotes = {"dasdasd", "asadsadas", "dasdascae"};

	/* sets up a panel with a label and a set of radio buttons that controls its text. */
	public QuoteOptionsPanel() {
	 
		quotes = new String[6];
		comedyQuote = "Take my wife, please.";
		philosophyQuote = "I think, therefore I am.";
		carpentryQuote = "Measure twice. Cut once.";
      	inspirationalQuote = "I believe you can do it!";
      	heartBreakQuote = "Your heart is my piñata.";
      	happyQuote = "Be happy for this moment";
  
      	quotes[0] = comedyQuote;
      	quotes[1] = philosophyQuote;
      	quotes[2] = carpentryQuote;
      	quotes[3] = inspirationalQuote;
      	quotes[4] = heartBreakQuote;
      	quotes[5] = happyQuote;
      
      	quote = new JLabel (comedyQuote);
      	quote.setFont (new Font ("Helvetica", Font.BOLD, 24));

      	comedy = new JRadioButton ("Comedy", true);
      	comedy.setBackground (Color.green);
      	philosophy = new JRadioButton ("Philosophy");
      	philosophy.setBackground (Color.green);
      	carpentry = new JRadioButton ("Carpentry");
      	carpentry.setBackground (Color.green);
      	inspirational = new JRadioButton ("Inspirational");
      	inspirational.setBackground (Color.green);
      	heartBreak= new JRadioButton ("Heart break");
      	heartBreak.setBackground (Color.green);
      	happy = new JRadioButton ("Happy");
      	happy.setBackground (Color.green);
      
      	ButtonGroup group = new ButtonGroup();
      	group.add (comedy);
      	group.add (philosophy);
      	group.add (carpentry);
      	group.add(inspirational);
      	group.add(heartBreak);
      	group.add(happy);

      	QuoteListener listener = new QuoteListener();
      	comedy.addActionListener (listener);
      	philosophy.addActionListener (listener);
      	carpentry.addActionListener (listener);
      	inspirational.addActionListener(listener);
      	heartBreak.addActionListener(listener);
      	happy.addActionListener(listener);
      
      	add (quote);
      	add (comedy);
      	add (philosophy);
      	add (carpentry);
      	add (inspirational);
      	add (heartBreak);
      	add (happy);

      	setBackground (Color.green);
      	setPreferredSize (new Dimension(300, 100));
	}

	/* represents the listener for all radio buttons */
	private class QuoteListener implements ActionListener {

		/* sets the text of the label depending on which radio button was pressed */
		public void actionPerformed (ActionEvent event) {
			Object source = event.getSource();

			if (source == comedy)
				quote.setText (quotes[0]);
			else if (source == philosophy)
				quote.setText (quotes[1]);
			else if (source == carpentry)
				quote.setText (quotes[2]);
			else if (source == inspirational)
				quote.setText(quotes[3]);
			else if (source == heartBreak)
				quote.setText (quotes[4]);
			else if (source == happy)
				quote.setText (quotes[5]);  
		}
	}
}
