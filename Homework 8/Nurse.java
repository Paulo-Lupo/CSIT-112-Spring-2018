/*
 * Programming Project 8 - Nurse.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 2, 2018
 */

/* This program inherits the attributes of the HospitalEmployee class */

public class Nurse extends HospitalEmployee {
	
	/* child's constructor calls the Parent's constructor */
	public Nurse(String name, int number)
	{
		super(name, number);
	}
		
	/* method defines a service provided by a Nurse */
	public String medAdmin () 
	{
		return "It is the nurse's job to administer medication.";
	}
}
