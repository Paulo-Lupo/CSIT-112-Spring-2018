/*
 * Programming Project 11 - PhoneList2.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 28, 2018
 */

/* This program creates an array of integers, sorts them, then prints them */

import java.util.Random;

public class PhoneList2 {

	public static void main (String[] args) {	   
		Integer[] numbers = new Integer[8];
		Random rand = new Random();

		for (int i = 0; i < 8; i++) {
			numbers[i] = rand.nextInt(100);
		}
      
		System.out.println("Insertion Sorting: "); 
		Sorting.insertionSort(numbers);
		for (Integer number : numbers)
			System.out.println (number);
      
		System.out.println("\nSelection Sorting: "); 
		Sorting.selectionSort(numbers);
		for (Integer number : numbers)
			System.out.println (number);
	}
}
