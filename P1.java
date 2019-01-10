/*
 * Devante Wilson - 100554361
 * September 30th, 2015
 * 
 * Program computes the cube of a number (raise to 3rd power) by using a method
 * Utilizes input and output boxes
 */

// import packages
import javax.swing.*;

public class P1
{
	public static void main(String[] args)
	{
		// declare variables
		String z;
		int zInt;
		
		// prompt user for integer value using an input dialog box
		z = JOptionPane.showInputDialog(null, "Enter an integer ");
		
		// parse the string z and put the resulting integer in zInt
		zInt = Integer.parseInt (z);
		
		// pass integer to cube method
		cube (zInt);
	}
	
	public static void cube (int num)
	{
		// output the result in an output in the console
		System.out.println("The cube of " + num + " is " + (num * num * num));
	}
}
