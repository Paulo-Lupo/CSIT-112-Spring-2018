/*
 * Programming Project 9 - PlayerStatsDriver.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* Driver using to demonstrate de functionality of Inheritance in Java. */

public class PlayerStatsDriver {
	public static void main(String args[]) {
		
		/* initializes team players */
		Baseball team1 = new Baseball("Paul", "Angels", 4);
		Football team2 = new Football("Ravens", "Devils", 7, 6);
	
		/* changes the score */
		team1.changeScore(5);
		team2.changeScore(4, 3);
		
		/* prints out information about the teams */
		System.out.println(team1);
		System.out.println();
		System.out.println(team2);
	}
}
