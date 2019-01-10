/*
 * Devante Wilson - 100554361
 * October 8, 2015
 * 
 * Program calculates the force on a pair
 * of charged particles.
 */

// import packages
import java.util.Scanner;

public class Coulombs 
{
	public static void main(String[] args) 
	{
		// declare and initialize variables
		Scanner scan = new Scanner(System.in);
		double q1 = 0, q2 = 0, r = 0, force = 0;
		
		// prompt user for input
		System.out.println("Please enter charge Q1 in Coulombs");
		q1 = scan.nextDouble();
		
		System.out.println("Please enter charge Q2 in Coulombs");
		q2 = scan.nextDouble();
		
		System.out.println("Enter the distnace between the charges (in metres)");
		r = scan.nextDouble();
		
		// close Scanner object
		scan.close();
		
		// calculate result
		force = (q1*q2)/(4*Math.PI*8.854e-12*Math.pow(r,2));
		
		// output result
		System.out.println("The electric force between the two charged particles is\n" + Math.round(force));
	}
}
