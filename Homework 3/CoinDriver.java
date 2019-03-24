/*
 * Programming Project 3 - Task.java 
 * Joao Paulo D. S. Ferreira
 * CSIT 112 - Fundamentals of Programming II
 * Dr. Dajin Wang
 * Febuary 17, 2018
 */

/* Test Driver class for the Task class */

public class TaskDriver {
	public static void main(String arg[]) {
	
		/* creates two new tasks */
		Task Work = new Task("Work", 1, 4);
		Task Dishes = new Task("Dishes", 1, 5);
		
		/* changes the priority of one of the tasks */
		Work.setPriority(4);
		
		/* changes the complexity of one of the tasks */
		Dishes.setComplexity(2);
		
		/* prints out the tasks, priority and complexity level */
		System.out.println(Work);
		System.out.println(Dishes);
	}
}
