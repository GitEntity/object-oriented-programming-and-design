/**
 * Devante Wilson
 * November 21, 2015 
 * 
 * Question 2
 * 
 * Programs describes a set of
 * entities of a company such as
 * an employee, manager and executive.
 * 
 * Class tests program
 */

public class Q2Tester 
{
	public static void main(String[] args) 
	{
		// create objects
		Employee emp = new Employee("Employee name", 1);
		Manager ma = new Manager("Manager name", 2, "Manager department");
		Executive ex = new Executive("Executive name", 3, "Executive department");
		
		// call methods and print results
		System.out.println(emp.toString());	// employee info.
		System.out.println(ma.toString());	// manager info.
		System.out.println(ex.toString());	// executive info.
	}
}
