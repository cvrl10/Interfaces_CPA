/**
 * This interface defines the methods for all classes that implements the interface
 * 
 * @author Carl Archemetre
 * @version 1.0
 * Polymorphism Project
 * Fall 2021
 */
public interface Priority 
{
int MED_PRIORITY = 5, MAX_PRIORITY = 10, MIN_PRIORITY = 1;//constants of the interface

	/**
	 * 
	 * @param priority the priority to set
	 */
	void setPriority(int priority);
	
	/**
	 * 
	 * @return priority
	 */
	int getPriority();
}//end interface
