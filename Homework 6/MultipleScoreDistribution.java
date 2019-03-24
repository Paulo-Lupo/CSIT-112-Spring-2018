/*
 * Programming Project 6 - MultipleScoreDistribution.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * March 18, 2018
 */

/*
 * This program reads in an arbitrary number of integers from the console
 * that are in the range 1 to 100 inclusive; then produce a histogram that indicates 
 * how many input values fell in the range 1 to 10, 11 to 20, and so on. 
 * It prints one asterisk for every 5 values in the range
 */

import java.util.Scanner;

public class MultipleScoreDistribution {
	public static void main(String args[]) {
		
		/* initializes the scanner object and an array */
		int[] Counter = new int[10];
		Scanner scan = new Scanner(System.in);
		
		/* initializes x as 1 so it can enter the loop */
		int x = 1;
				
		/* checks if the number entered is inside of the range */
		while (x >= 1 && x <= 100 ) {
			
			/* asks the user for an input inside of the range */
			System.out.print("Enter a value between 1 and 100 inclusve, or a value outside of the range to stop: ");
			x = scan.nextInt();
			
			/* counts how many times each number is entered for each sub-range */
			if ( x >= 1 && x <=10 ) {
				Counter[0]++;
			} else if ( x >= 11 && x <= 20) {
				Counter[1]++;
			} else if ( x >= 21 && x <= 30) {
				Counter[2]++;
			} else if ( x >= 31 && x <= 40) {
				Counter[3]++;
			} else if ( x >= 41 && x <= 50) {
				Counter[4]++;
			} else if ( x >= 51 && x <= 60) {
				Counter[5]++;
			} else if ( x >= 61 && x <= 70) {
				Counter[6]++;
			} else if ( x >= 71 && x <= 80) {
				Counter[7]++;
			} else if ( x >= 81 && x <= 90) {
				Counter[8]++;
			} else if ( x >= 91 && x <= 100) {
				Counter[9]++;
			} else {
				System.out.println("The value you entered is outside of the range.");
			}
		}
				
		/* prints out all the results */
		System.out.println("\nFrequency distribution of the values entered: ");
		for (int i= 0; i <10 ; i++) {
			/* switch statement organizes the output to look a little nicer */
			switch (i) {
			case 0:
				System.out.print((i*10+1) + "  - " + (i*10+10) +  "  | ");
				for (int z=1; z <= Counter[i]/5; z++) {
					System.out.print("*");
				} // end case 0 for
				System.out.println();
				break;
			case 9: 
				System.out.print((i*10+1) + " - " + (i*10+10) +  " | ");
				for (int z=1; z <= Counter[i]/5; z++) {
					System.out.print("*");
				} // end case 9 for
				System.out.println();
				break;
			default:
				System.out.print((i*10+1) + " - " + (i*10+10) +  "  | ");
				for (int z=1; z <= Counter[i]/5; z++) {
					System.out.print("*");
				} // end default for
				System.out.println();	
			} // end switch	
		} // end outer for
	}
}
