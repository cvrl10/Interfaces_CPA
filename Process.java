/**
 * This class represents a process that you might run on your computer
 * 
 * @author Carl Archemetre
 * @version 1.0
 * Polymorphism Project
 * Fall 2021
 */
public class Process implements Priority, Comparable<Process>
{
private final String processID;//the ID of the process
private int priority;//the priority of the process
	
	/**
	 * 
	 * @param processID
	 */
	public Process(String processID)
	{
		this.processID = processID;
	}//end constructor
	
	/**
 	* @return the processID
 	*/
	public String getProcessID() 
	{
		return processID;
	}//end getProcessID
	
	/**
	 * @return the priority
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
	 * @return instance field as Strings
	 */
	@Override
	public String toString() 
	{
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString
	
	/**
	 * 
	 * @param obj the Process to compare
	 * @return integer, positive if this priority is greater than the argument's priority
	 * negative if this is priority is less than the argument's priority
	 * 0 if this priority is equal to the argument's priority
	 */
	@Override
	public int compareTo(Process obj) 
	{
		int value;
		if (priority == obj.getPriority())
			value = 0;
		else
			value = (priority > obj.getPriority()) ? 1 : -1;
		return value;
	}//end compareTo	
}//end class
