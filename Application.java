/**
 * This class test both Task and Process objects as well as the compareTo method of the RationalNumber class
 * 
 * @author Carl Archemetre
 * @version 1.0
 * Polymorphism Project
 * Fall 2021
 */
public class Application 
{	
	public static void main(String[] args) 
	{				
		//RationalNumber 
		System.out.println("If this rational number is equal to the argument's rational number then compareTo returns 0."
			+"\nif this ratitonal number is greater than the argument's rational number then compareTo returns 1."
			+"\nif this rational number is less than the argument's rational number then compareTo returns -1.\n");
		
		RationalNumber[] num = {new RationalNumber(6, 8), new RationalNumber(1, 3), new RationalNumber(3, 1)};
		
		for (int i = 0; i < 3; i++)
			System.out.println(num[0].compareTo(num[i]));
		
		//Task
		Task task = new Task("Grocery Shopping");
		task.setStatus(Task.Status.COMPLETE);
		System.out.println("Checking the toString method of my class: "+task.toString());
		System.out.println();
		task.setPriority(-1);
		System.out.println("Checking the priority of my task: "+task.getPriority());
		System.out.println();
		
		Task sleep = new Task("I need to get 8 hrs of sleep tonight");
		sleep.setPriority(Priority.MAX_PRIORITY);
		sleep.setStatus(Task.Status.IN_PROCESS);
		
		System.out.println(task.getSatus());
		
		System.out.println("Comparing two tasks using the implemented Comparable interface\n"
				+"this implementation of the Comparable interface compares the status of the tasks\n"
				+ "this method returns a positive integer since this task is COMPLETE, when compare to the argument's IN_PROCESS status\n"
				+"the integer returned from compareTo is: "+task.compareTo(sleep));
		//sleep.setName("Testing the setName method of the class.");
		System.out.println(sleep.getName());
		
		Task.Status[] status = {Task.Status.NOT_STARTED, Task.Status.IN_PROCESS, Task.Status.COMPLETE};
		for (int i = 0; i < 3; i++)
		{
			sleep.setStatus(status[i]);
			System.out.println(task.compareTo(sleep));
			System.out.println();
		}
		task.setStatus(Task.Status.NOT_STARTED);
		System.out.println("changed the status of task to Task.Status.NOT_STARTED so that compareTo method returns an negative integer\n"
				+"The integer returned from the compareTo method is: "+task.compareTo(sleep));
		//Process
		Process process = new Process("Coding");
		Process videoGame = new Process("Gaming");
		process.setPriority(10);
		videoGame.setPriority(1);
		System.out.println("checking the priority of my process: "+videoGame.getPriority());
		System.out.println("checking the ID of my process: "+process.getProcessID());
		System.out.println("checking the toString method of the class: "+process.toString());
		
		System.out.println();
		
		System.out.println("This implementation of the Comparable interface compares this priority to the argument's priority.\n"
				+"if this priority is equal to the argument's priority, the integer returned is 0\n"
				+"if this priority is greater than the argument's priority, the integer returned is positive\n"
				+"if this priority is less than the argument's priroty, the integer returned is negative\n"
				+"the integer returned from compareTo is: "+process.compareTo(videoGame));
	}//end main
}//end class
