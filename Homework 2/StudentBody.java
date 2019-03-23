/*
 * Programming Project 2 - StudentBody.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 5, 2018
 */

/* Test Driver class for the Address and Student class */

public class StudentBody {
	/* Creates some Address and Student objects and prints them */
	public static void main (String[] args) {
		Address school = new Address ("800 Lancaster Ave.", "Villanova", "PA", 19085);
		Address jHome = new Address ("21 Jump Street", "Lynchburg", "VA", 24551);
		Student john = new Student ("John", "Smith", jHome, school);

		Address mHome = new Address ("123 Main Street", "Euclid", "OH", 44132);
      
		/* Student created using the initial test scores as parameters */
		Student marsha = new Student ("Marsha", "Jones", mHome, school, 81, 96, 84);
      
		/* Setting test scores to a Student created without the test score as parameters */
		john.setTestScore(1, 100);
		john.setTestScore(2, 90);
		john.setTestScore(3, 80);
      
		System.out.println("John's score on test 1 is : " + john.getTestScore(1) + "\n");
         
		System.out.println (john);
		System.out.println ();
		System.out.println (marsha);
	}
}
