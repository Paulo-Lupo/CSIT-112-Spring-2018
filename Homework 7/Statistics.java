/*
 * Programming Project 7 - Statistics.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * March 23, 2018
 */

/* This program computes and prints  the mean and standard deviation of a list of integers */

import java.util.Scanner;

public class Statistics {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		/* defines a create an array */
		System.out.println("Enter how many values will be entered: ");
		int size = 0;
		size = scan.nextInt();
		int[] array = new int[size];
			
		/* fills in the array */
		System.out.println("Enter all the values, press enter after each value: ");
		for (int i = 0; i < size; i++) {
			array [i] = scan.nextInt();
		}
	
		/* calculates the mean */
		int sum = 0;
		for (int i=0; i < size; i++) {
			sum = sum + array[i];
		}
		double mean = (double) sum/size;
		
		/* calculates the Standard Deviation */
		double sum2 = 0.0;
		for (int i=0; i < size; i++)  {
			sum2 = sum2 + Math.pow((array[i] - mean), 2);
		}
		double sd =  Math.sqrt(sum2);
		
		/* prints out the Results */
		System.out.println("Mean: " + String.format("%.2f", mean));
		System.out.println("Standard Deviation: " + String.format("%.2f", sd));
	}
}
