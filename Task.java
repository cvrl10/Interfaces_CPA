/**
 * This class represents a task such as a to do list
 * 
 * @author Carl Archemetre
 * @version 1.0
 * Polymorphism Project
 * Fall 2021
 */
public class Task implements Priority, Comparable<Task>
{
enum Status {NOT_STARTED, IN_PROCESS, COMPLETE}//enum type for the value of the status of the task
private Status status;//the status of the task
private final String name;//the name of the task
private int priority;//the priority of the task

	/**
	 * 
	 * @param name the name to set
	 * sets status to Status.NOT_STARTED
	 */
	public Task(String name)
	{
		this.name = name;
		status = Status.NOT_STARTED;
	}//end constructor
	
	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}//end getName

	/**
	 * @return priority
	 */
	public int getPriority() 
	{
		return priority;
	}//end getPriority

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority)
	{
		if (priority <5)
			this.priority = Priority.MIN_PRIORITY;
		else 
			this.priority = (priority > 4 && priority < 10) ? Priority.MED_PRIORITY : Priority.MAX_PRIORITY;
	}//end setPriority
	
	/**
	 * 
	 * @return Status
	 */
	public Status getSatus()
	{
		return status;
	}//end getStatus
	
	/**
	 * 
	 * @param status the status to set
	 */
	public void setStatus(Status status)
	{
		this.status = status;
	}//end setStatus
	
	/**
	 * 
	 * @return instance field as Strings
	 */
	@Override
	public String toString() 
	{
		return "Task [name=" + name + ", priority=" + priority + "]";
	}//end toString
	
	/**
	 * 
	 * @param obj the Task to compare
	 * @return 0 if status are the same, 1 if this status = Status.COMPLETE and argument's status = Status.NOT_STARTED || status = Status.IN_PROCESS
	 * and -1 if this status = Status.NOT_STARTED || status = Status.IN_PROCESS and argument's status = Status.COMPLETE
	 */
	@Override
	public int compareTo(Task obj) 
	{
		int value;
		if (status == obj.getSatus())
			value = 0;
		else
			value = (status == Status.COMPLETE && ((obj.getSatus() == Status.NOT_STARTED) || (obj.getSatus() == Status.IN_PROCESS))) ? 1 : -1;
		return value;
	}//end compareTo	
}//end class
