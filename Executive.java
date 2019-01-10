/**
 * Devante Wilson
 * November 21, 2015 
 * 
 * Question 2
 * 
 * Program describes a set of
 * entities of a company such as
 * an employee, manager and executive.
 */

public class Executive extends Manager
{
	// constructor/mutator method
	public Executive(String name, double salary, String department)
	{
		super(name, salary, department);
	}
	
	// retrieve info.
	public String toString()
	{
		return super.toString();
	}
	
	// default no parameter constructor
	public Executive()
	{
		
	}
}
