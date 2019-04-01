/*
 * Programming Project 10 - Sorting.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 22, 2018
 */

/* Reversed insertion and selection Sort. Sorts the items in reverse order */

public class Sorting {
	/* sorts the specified array of objects using the selection sort algorithm */
	public static void selectionSort (Comparable[] list) {
		int max;
		Comparable temp;

		for (int index = 0; index < list.length-1; index++) {
			max = index;
			
			for (int scan = index+1; scan < list.length; scan++) {
				if (list[scan].compareTo(list[max]) > 0)
					max = scan;
			}

			/* swaps the values */
			temp = list[max];
			list[max] = list[index];
			list[index] = temp;
		}
	}

	/* sorts the specified array of objects using the insertion sort algorithm */
	public static void insertionSort (Comparable[] list) {
		for (int index = 1; index < list.length; index++) {
			Comparable key = list[index];
			int position = index;

			/* shifts smaller values to the right */
			while (position > 0 && key.compareTo(list[position-1]) > 0) {
				list[position] = list[position-1];
				position--;
			}
			list[position] = key;
		}
	}
}
