/*
 * Programming Project 9 - PersonDriver.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* Driver using to the demonstrate the functionality of Inheritance in Java. */

public class PersonDriver {
	public static void main(String args[]) {

		/* initializes some "people" */
		Worker worker1 = new Worker("John", "Smith", 25, "Colorado");
		Student stud1 = new Student("Ana", "Banana", 18, "New York");
		ForeignStudent forstud1 = new ForeignStudent("Juan", "Pablo", 23, "Mexico");
		
		/* 
		 * sets some values of the missing variables value
		 * and prints some information about the people */
		worker1.setIncome(81000);
		worker1.setNationality("Peruvian");
		worker1.setOccupation("Accountant");
		System.out.println(worker1);
		System.out.println();
		
		stud1.setIncome(20000);
		System.out.println(stud1);
		System.out.println();
		
		forstud1.setIncome(40000);
		forstud1.setNationality("Mexican");
		System.out.println(forstud1);
		
	}
}
