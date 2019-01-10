/*
 * Devante Wilson - 100554361
 * September 30th, 2015
 * 
 * Program calculates the weekly salary of an employee
 */

// import packages
import javax.swing.JOptionPane;

public class Salary
{
	public static void main(String[] args) 
	{
		// declare variables
		String id, wage, hours;
		double wageD, hoursD, salary;
		int selection;
		boolean test;
		
		// initialize variables
		id = JOptionPane.showInputDialog(null, "Employee ID: ");
		
		wage = JOptionPane.showInputDialog(null, "Specify hourly rate: ");
		wageD = Double.parseDouble(wage);
		
		hours = JOptionPane.showInputDialog(null, "Specify the number of hours: ");
		hoursD = Double.parseDouble(hours);
		
		// calculate salary
		salary = wageD * hoursD;
		
		// output result in message box
		JOptionPane.showMessageDialog(null, "The weekly salary for Employee ID " + id + " is $ "+ salary);
		
		// ********verify if overtime rate is applicable*********
		selection = JOptionPane.showConfirmDialog(null, "Has the employee worked overtime?");
		test = (selection == JOptionPane.YES_OPTION);
		
		if (test)
			JOptionPane.showMessageDialog(null, "Overtime", "Overtime Status", JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null, "No Overtime", "Overtime Status", JOptionPane.INFORMATION_MESSAGE);
	}
}
