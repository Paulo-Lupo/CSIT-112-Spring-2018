/*
 * Programming Project 8 - Doctor.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 2, 2018
 */

/* This program inherits the attributes of the HospitalEmployee class */

public class Doctor extends HospitalEmployee {
	
	/* child's constructor calls the Parent's constructor */
	public Doctor(String name, int number)
	{
		super(name, number);
	}
	
	/* method defines a service provided by a Doctor */
	public String diagnose() 
	{
		return "It is the doctor's job to diagnose patients.";
	}
}
