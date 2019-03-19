/*
 * Programming Project 1 - StarsB.java
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 1, 2018
 */

/* This program Prints some pattern using for loops */

public class StarsB {
	public static void main(String[] args) {
		final int MAX_ROLLS = 10;
		
		for (int row = MAX_ROLLS; row >= 1; row--) {
			
			for (int star=1; star < row; star++) {
				System.out.print(" ");
			} // end 1st for
			
			for (int star = MAX_ROLLS; star >= row; star--) {
				System.out.print("*");
			} // end 2nd for
		} // end outer for
	}
}
