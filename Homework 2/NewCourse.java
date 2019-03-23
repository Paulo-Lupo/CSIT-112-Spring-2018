/*
 * Programming Project 2 - NewCourse.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 5, 2018
 */

/* Driver used to test the Course, Student and Address classes */

public class NewCourse {
	public static void main(String args[]) {
		
		/* Initializes a new course */
		Course newCourse = new Course("Math");
		
		/* Initializes addresses and four students objects */
		Address school = new Address ("800 Lancaster Ave.", "Villanova",
                "PA", 19085);

		Address jHome = new Address ("21 Jump Street", "Lynchburg",
                "VA", 24551);
		Student john = new Student ("John", "Smith", jHome, school, 100, 90, 80);
		
		Address aHome = new Address ("104 Lincoln", "New Brunswick",
                "NJ", 07123);
		Student ana = new Student ("Ana", "Saints", aHome, school, 82, 90, 92);
		
		Address pHome = new Address ("11 Charles Street", "Quahog",
                "MA", 41253);
	    Student paul = new Student ("Paul", "Lupo", pHome, school, 80, 80, 80);
	    
	    Address mHome = new Address ("123 Main Street", "Euclid", "OH",
                  44132);
	    Student marsha = new Student ("Marsha", "Jones", mHome, school, 96, 87, 84);

	    /* Adds students to the course */
		newCourse.addStudent(john);
		newCourse.addStudent(ana);
		newCourse.addStudent(paul);
		newCourse.addStudent(marsha);
		
		/* Prints all students in the course */
		System.out.println(newCourse.roll());
		
		/* Prints the average grade of all students */
		System.out.println("Class average grade: " + newCourse.average());
		
	}	
}
