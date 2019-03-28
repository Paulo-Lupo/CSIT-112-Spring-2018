/*
 * Programming Project 9 - ReadingMaterialDriver.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * April 14, 2018
 */

/* Driver using to the demonstrate the functionality of Inheritance in Java */

public class ReadingMaterialDriver {
	public static void main(String args[]) {

		/* initializes some reading materials */
		Book book1 = new Book("The wonders of the world", "978-1-933624-34-1", "David", 600);
		Magazine magazine1 = new Magazine("Scandal", "978-1-933624-76-1", 35, 16);
		Novel novel1 = new Novel("The adventures of Tim", "978-1-60309-385-9", "Mary Collins", 500);
		TechJournal techJournal1 = new TechJournal("Science", "978-1-891830-51-8", 54, 12);
		Textbook textbook1 = new Textbook("Introduction to Linear Algebra", "978-1-60309-052-0", 200);
		
		/* prints out information about the reading materials */
		System.out.println(book1);
		book1.setMainCharacter("Joseph");
		book1.getMainCharacter();
		
		System.out.println(magazine1);
		magazine1.setStoriesCount(15);
		magazine1.getPublisher();
		
		System.out.println(novel1);
		novel1.setMainCharacter("Tim");
		novel1.getMainCharacter();
		
		System.out.println(techJournal1);
		techJournal1.setMainWritter("J. Phillips");
		techJournal1.getMainWritter();
		
		System.out.println(textbook1);
		textbook1.setSubject("Linear Algebra");
		textbook1.getSubject();		
	}
}
