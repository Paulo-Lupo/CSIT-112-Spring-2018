/*
 * Programming Project 2 - Student.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 5, 2018
 */

/* Program used to create Student objects with an address and three test scores */

public class Student {
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private int test1, test2, test3;
	private int testScore;

	/* Constructor: Sets up this student with the specified values */
	public Student (String first, String last, Address home, Address school)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}
   
	/* Overloaded constructor if the initial test results are given */
	public Student (String first, String last, Address home, Address school, 
		   			int test1, int test2, int test3) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}

	/* Method to set the test score for three tests */
	public void setTestScore(int testNum, int testScore) {
		if (testNum == 1) {
			test1 = testScore;
		} else if (testNum == 2) {
			test2 = testScore;
		} else if (testNum == 3) {
			test3 = testScore;
		}
	}
   
	/* Method to get the test scores of a given test */
	public int getTestScore(int testNum) {
		if (testNum == 1) {
			return test1;
		} else if (testNum == 2) {
			return test2;
		} else if (testNum == 3) {
			return test3;
		} else {
			System.out.print("There's no test score recorded for the test number entered. Test score set to ");
			return 0;
		}
	}
   
	/* Method that calculates the average test score */
	public double average () {
		return (double) (test1+test2+test3)/3;	  
	}
   
	/* Returns a string description of this Student object */
	public String toString() {
		String result;

		result = firstName + " " + lastName + "\n";
		result += "Home Address:\n" + homeAddress + "\n";
		result += "School Address:\n" + schoolAddress;
      
		result += "\nTest 1 Score: " + test1;
		result += "\nTest 2 Score: " + test2;
		result += "\nTest 3 Score: " + test3;
		result += "\nAverage Score of 3 Tests: " + average()+ "\n";

		return result;
	}
}
