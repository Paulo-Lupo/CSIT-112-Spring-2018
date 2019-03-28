/*
 * Programming Project 9 - Worker.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* This program inherits the attributes of the Person class */

public class Worker extends Person {
	
	private String occupation, nationality, firstName, secondName;
	private int income;
	
	/* constructor initializes a worker */
	public Worker (String name1, String name2, int pAge, String pLocation) {

		super(pAge, pLocation);
		firstName = name1;
		secondName = name2;
	}
	
	/* sets the worker's nationality */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	/* returns the worker's nationality */
	public String getNationality() {
		return "" + nationality;
	}
	
	/* sets the worker's occupation */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	//* returns the worker's occupation */
	public String getOccupation() {
		return "" + occupation;
	}
	
	/* sets the worker's income */
	public void setIncome(int inc) {
		income = inc;
	}
	
	/* returns the worker's income */
	public int getIncome() {
		return income;
	}
	
	/* prints some information about the foreign student */
	public String toString() {
		
		String result = "Name: " + firstName + " " + secondName +"\n";
		result += super.toString();
		result += "\nOccupation: " + occupation + "\nIncome: $" + income + " a year";
		result += "\nNationality: " + nationality;
		return result;
	}
}
