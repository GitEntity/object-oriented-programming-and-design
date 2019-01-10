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

public class Employee 
{
	// instance variables
	private String name;
	private double salary;
	
	// constructor/mutator method
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}
	
	// retrieve info.
	public String toString()
	{
		return "name: " + name + 
			   "\nsalary: " + salary + 
			   "\n";
	}
	
	// default no parameter constructor
	public Employee()
	{
		
	}
}
