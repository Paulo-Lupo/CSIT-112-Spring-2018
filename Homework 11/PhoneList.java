/*
 * Programming Project 11 - PhoneList.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 28, 2018
 */

/* This program creates an array of Contact objects, sorts them, then prints them */

public class PhoneList {
	
	public static void main (String[] args) {
		  Contact[] friends = new Contact[8];
		
		  friends[0] = new Contact ("John", "Smith", "610-555-7384");
		  friends[1] = new Contact ("Sarah", "Barnes", "215-555-3827");
		  friends[2] = new Contact ("Mark", "Riley", "733-555-2969");
		  friends[3] = new Contact ("Laura", "Getz", "663-555-3984");
		  friends[4] = new Contact ("Larry", "Smith", "464-555-3489");
		  friends[5] = new Contact ("Frank", "Phelps", "322-555-2284");
		  friends[6] = new Contact ("Mario", "Guzman", "804-555-9066");
		  friends[7] = new Contact ("Marsha", "Grant", "243-555-2837");
		
		  System.out.println("Selection Sorting: "); 
		  Sorting.selectionSort(friends);
		  for (Contact friend : friends)
		     System.out.println (friend);
		  
		  
		  System.out.println("\nInsertion Sorting: ");
		  Sorting.insertionSort(friends);
		  for (Contact friend : friends)
			     System.out.println (friend);
	}
}
