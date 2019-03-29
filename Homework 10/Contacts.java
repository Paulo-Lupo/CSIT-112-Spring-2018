/*
 * Programming Project 10 - ZipCodes.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 22, 2018
 */

/* This program stores the contacts read from the file in an array and prints them */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ZipCodes {
	public static void main(String[] args)  throws IOException {
		
		/* creates an array to store up to 25 Contacts */
		Contacts[] contacts = new Contacts[25];
		
		/* scans the contacts file */
		Scanner scan = new Scanner(new File("contacts.dat"));
		
		/* stores the information in the ArrayList and prints it in a nice way */
		System.out.println("Name: \t\t\tZIP Code:");
		for (int i=0; i < 22; i++) {
			Contacts contact = new Contacts(scan);
			
			contacts[i] = contact;
			
			System.out.println(contacts[i]);
		}
	}
}


