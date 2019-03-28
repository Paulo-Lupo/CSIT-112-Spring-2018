/*
 * Programming Project 9 - Student.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* This program inherits the attributes of the Person class */

public class Student extends Person {
	
	private String occupation, nationality, firstName, secondName;
	private int income;
	
	/* constructor initializes an American student */
	public Student (String name1, String name2, int pAge, String pLocation) {

		super(pAge, pLocation);
		firstName = name1;
		secondName = name2;
		occupation = "Student";
		nationality = "American";
	}
	
	/* sets the student's income */
	public void setIncome(int inc) {
		income = inc;
	}
	
	/* sets the student's income */
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
