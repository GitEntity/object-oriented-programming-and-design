/*
 * Devante Wilson - 100554361
 * October 5, 2015
 * 
 * Program prompts the user for two integers.
 * The smaller of the two will be printed.
 */

// import packages
import java.util.Scanner;

public class SmallerNumber 
{
	public static void main(String[] args)
	{
		// declare variables/objects
		int num1, num2;
		Scanner scan = new Scanner (System.in);
		
		// prompt user for input
		System.out.println("Please your first integer.");
		num1 = scan.nextInt();
		System.out.println("Please your second integer.");
		num2 = scan.nextInt();
		
		// close Scanner object
		scan.close();
		
		// determine smaller integer using min method
		System.out.println("The smaller integer is " + Math.min(num1,num2));
	}
}
