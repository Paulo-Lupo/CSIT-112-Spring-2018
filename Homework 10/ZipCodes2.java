/*
 * Programming Project 10 - ZipCodes2.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 22, 2018
 */

/* This program stores the contacts read from the file in an array and prints them */

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ZipCodes2 {
	public static void main(String[] args)  throws IOException {
		
		/* creates an ArrayList to store the Contacts */
		ArrayList<Contacts> contacts = new ArrayList<>();
	
		/* scans the contacts2 file */
		Scanner scan = new Scanner(new File("contacts2.dat"));
		
		/* stores the information in the ArrayList and prints it in a nice way */
		System.out.println("Name\t\t\tAddress\t\t\t\t\tZIP\tPhone");
		for (int i=0; i < 22; i++) {
			Contacts contact = new Contacts(scan);
			contacts.add(contact);
			
			System.out.println(contacts.get(i));
		}
	}
}
