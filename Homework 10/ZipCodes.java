import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ZipCodes {
	public static void main(String[] args)  throws IOException {
		
		// Creates an array to store up to 25 Contacts
		Contacts[] contacts = new Contacts[25];
		
		// Scans the contacts file
		Scanner scan = new Scanner(new File("contacts.dat"));
		
		// Loop stores the information in the ArrayList
		// and prints it in a nice way
		System.out.println("Name: \t\t\tZIP Code:");
		for (int i=0; i < 22; i++) 
		{
			Contacts contact = new Contacts(scan);
			contacts[i] = contact;
			
			System.out.println(contacts[i]);
		}
	}
}
