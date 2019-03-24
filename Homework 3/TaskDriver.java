public class TaskDriver {
	public static void main(String arg[]) {
	
		// Creates two new tasks
		Task Work = new Task("Work", 1, 4);
		Task Dishes = new Task("Dishes", 1, 5);
		
		// Changes the priority of one of the tasks
		Work.setPriority(4);
		
		// Changes the complexity of one of the tasks
		Dishes.setComplexity(2);
		
		// Prints out the tasks, priority and complexity level
		System.out.println(Work);
		System.out.println(Dishes);
	}
}
