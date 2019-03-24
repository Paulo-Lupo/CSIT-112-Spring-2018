/*
 * Programming Project 6 - NumCounter2525.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * March 18, 2018
 */

/* 
 * This program reads an arbitrary number that are in the range -25 to 25
 * inclusive and counts how many occurrences of each are entered.
 * Indicate the end of the input by a value outside the range.
 */

import java.util.Scanner;

public class NumCounter2525 {

	public static void main(String args[]) {
		
		/* initializes the scanner object and an array to count the occurrences */
		int[] numCounter = new int[51];
		Scanner scan = new Scanner(System.in);
		
		/* initializes x as 0 so it can enter the loop */
		int x = 0;
		
		/* checks if the number entered is inside of the range */
		while (x >= -25 && x <= 25 ) {
			
			/* asks the user for an input inside of the range */
			System.out.print("Enter a number greater than or equals to -25 and less than or equals to 25: ");
			x = scan.nextInt();
			
			/* counts how many times each number is entered if it is inside of the range */
			if (x >= -25 && x <= 25 )  {		
				numCounter[x+25]++;
			} 
			else {
				System.out.println("You have entered a number outside of the range.");
			}
		} // end while
		
		/* prints out all the numbers with more than one occurrences */
		System.out.println("\nNumber of occurency for each input in the range: ");
		System.out.println();
		for (int i = 0; i <= 50; i++) {
			if (numCounter[i] != 0) {
				/* this if-else block organizes the output to look a little nicer */
				if (i<=15)
					System.out.println((i-25) + ": " + numCounter[i]);
				else if (i>=16 && i <= 24)
					System.out.println(" " + (i-25) + ": " + numCounter[i]);
				else if (i>=25 && i<=34)
					System.out.println("  " + (i-25) + ": " + numCounter[i]);
				else
					System.out.println(" " + (i-25) + ": " + numCounter[i]);
			} // end outer if
		} // end for		
	}
}
