/**
 * Devante Wilson - 100554361
 * September 17th, 2015
 * 
 * OOP - Assignment 1 - Question 3
 * Program reads a temperature in degrees celsius
 * then outputs its equivalent in degrees fahrenheit
 */

// import packages
import java.util.*;

public class Temperature
{
	public static void main(String[] args)
	{
		// declare variables/objects
		double celsius;
		Scanner scan = new Scanner (System.in);

		// prompt user for input
		System.out.println("Please enter a temperature in degrees celsius.");
		celsius = scan.nextDouble();
		
		// close Scanner object
		scan.close();
		
		// calculate and output temperature in fahrenheit
		System.out.println("Temperature in Fahrenheit: " + (celsius * (9/5.0) + 32));
	}
}
