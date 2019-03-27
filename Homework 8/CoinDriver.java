/*
 * Programming Project 8 - CoinDriver.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 2, 2018
 */

/* 
 * Driver using to the demonstrate de functionality of Inheritance in Java.
 * It creates multiple of objects that inherited the Coin class,
 * it also shows how a child class can call a parent method.
 */

public class CoinDriver {
	public static void main(String args[]) {
	
	/* creates MonetaryCoin objects and flips each coin */
	MonetaryCoin quarter = new MonetaryCoin(25);
	MonetaryCoin dime = new MonetaryCoin(10);
	MonetaryCoin penny = new MonetaryCoin(5);
	
	/* calls the getValue method from the child class */
	System.out.println("One quarter + one dime + one penny = " + (quarter.getvalue() + dime.getvalue() + penny.getvalue()) + " cents");
	
	/* 
	 * prints the object, since there is no toString method defined in the child class
	 * it calls the toString method from the parent class 
	 */
	System.out.println("Fliping the quarter gives you: " + quarter);
	System.out.println("Fliping the dime gives you: " + dime);
	System.out.println("Fliping the penny gives you: " + penny);
		
	}
}
