/*
 * Programming Project 8 - HospitalDriver.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 2, 2018
 */

/* 
 * Driver using to the demonstrate de functionality of Inheritance in Java.
 * It creates multiple of objects that inherited the HospitalEmployee class,
 * it also shows how a child class can call a parent method.
 */


public class HospitalDriver {
	public static void main(String args[]) {
		
		/* creates one of each object from the child classes */
		Administrator admin1 = new Administrator("Allison", 1001);
		Doctor doc1 = new Doctor("Robert", 2001);
		Janitor jan1 = new Janitor("Carl", 3001);
		Nurse nur1 = new Nurse("Will", 4001);
		Receptionist recep1 = new Receptionist("Joyce", 5001);
		Surgeon surg1 = new Surgeon("Paul", 6001);
		
		/* alls a method from the parent class using the child object and a unique method from each child class */
		admin1.work();
		System.out.println("She's an administrator. " + admin1.overiview() + "\n");
		
		doc1.work();
		System.out.println("He's a Doctor. " + doc1.diagnose() + "\n");
		
		jan1.work();
		System.out.println("He's a Janitor. " + jan1.cleaning() + "\n");
		
		nur1.work();
		System.out.println("He's a Nurse. " + nur1.medAdmin() + "\n");
		
		recep1.work();
		System.out.println("She's a Receptionist. " + recep1.answeringPhone() + "\n");
		
		surg1.work();
		System.out.println("He's a Surgeon. " + surg1.surgery() + "\n");
	}
}
