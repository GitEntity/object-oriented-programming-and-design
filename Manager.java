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

public class Manager extends Employee
{
	// instance variable(s)
	private String department;
	
	// constructor/mutator method
	public Manager(String name, double salary, String department)
	{
		super(name,salary);
		this.department = department;
	}
	
	// retrieve info.
	public String toString()
	{
		return super.toString() + department + "\n";
	}
	
	// default no parameter constructor
	public Manager()
	{
		
	}
}
