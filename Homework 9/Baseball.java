/*
 * Programming Project 9 - Baseball.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* This program inherits the attributes of the PlayerStats class */

public class Baseball extends PlayerStats {

	private int homerun;
	
	/* constructor initializes a Baseball team player and calculates its score */
	public Baseball(String player, String team, int homerun) {
		
		super(player, team);
		this.homerun = homerun;
		score();
	}
	
	/* abstract method from parent class that calculates the score of a baseball game */
	public void score() {
		score = homerun;
	}
	
	/* method to change the score of a baseball game */
	public void changeScore (int homerun) {
		this.homerun = homerun;
		score();
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nNumber of homeruns: " + homerun;
		return result;
	}
}
