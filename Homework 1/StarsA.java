/*
 * Programming Project 1 - StarsA.java
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 1, 2018
 */

/* This program Prints some pattern using for loops */

public class StarsA {
	public static void main(String[] args) {
		final int MAX_ROLLS = 10;
		
		for (int row = MAX_ROLLS; row >= 1; row--) {
			for (int star=1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
