/*
 * Programming Project 10 - CarPanel.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 22, 2018
 */

/* This program creates the visual presentation of a car using swing */

import javax.swing.JPanel;
import java.awt.*;

public class CarPanel extends JPanel {

	/* sets the coordinates of each point */
	private int[] xCar = {10, 10, 30, 70, 115, 150, 180, 180};
	private int[] yCar = {140, 95, 95, 60, 60, 95, 95, 140};
	private int[] xWindow = {85, 115, 115, 85};
	private int[] yWindow = {70, 70, 90, 90};
	private int radius = 45;
	private int y = 115;
	private int x1 = 20;
	private int x2 = 125;
	
	/* constructor: sets up the basic characteristics of this panel. */
	public CarPanel() {
		setBackground (Color.white);
		setPreferredSize (new Dimension(200, 200));
	}
	
	/* draws a car using polygons and polylines. */
	public void paintComponent (Graphics page){
	super.paintComponent (page);
	page.setColor (Color.blue);
	page.fillPolygon (xCar, yCar, xCar.length);
	page.setColor (Color.yellow);
	page.fillPolygon (xWindow, yWindow, xWindow.length);
	page.setColor (Color.black);
	page.fillOval(x1, y, radius, radius);
	page.setColor (Color.black);
	page.fillOval(x2, y, radius, radius);	
	}
}
