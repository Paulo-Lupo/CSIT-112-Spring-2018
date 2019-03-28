/*
 * Programming Project 9 - Football.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* This program inherits the attributes of the PlayerStats class */

public class Football extends PlayerStats {

	private int  goals;
	int touchdown, fieldGoal;
	
	/* constructor initializes a Football team player and calculates its score */
	public Football (String player, String team, int touchdown, int fieldGoal) {
		
		super(player, team);
		this.touchdown = touchdown;
		this.fieldGoal = fieldGoal;
		score();
	}
	
	/* abstract method from parent class that calculates the score of a football game */
	public void score() {
		score = touchdown*6 + fieldGoal*1;
	}
	
	/* method to change the score of a football game */
	public void changeScore (int touchdown, int fieldgoal) {
		this.touchdown = touchdown;
		this.fieldGoal = fieldgoal;
		score();
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nNumber of touchdowns: " + touchdown + "\nNumber of field goals: " + fieldGoal;
		return result;
	}

}
