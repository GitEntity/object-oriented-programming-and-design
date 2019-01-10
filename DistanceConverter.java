/*
 * Devante Wilson - 100554361
 * October 5, 2015
 * 
 * Program determines how many feet are in 3.5 yards
 * as well as how many inches are in 3.5 yards.
 */

public class DistanceConverter
{
	public static void main(String[] args)
	{
		// declare variables
		final int FEET_CONVERSION_FACTOR = 3,INCHES_CONVERSION_FACTOR = 12;
		final double YARDS = 3.5;
		double feet = YARDS * FEET_CONVERSION_FACTOR;
		double inches = feet * INCHES_CONVERSION_FACTOR;
		
		// output results
		System.out.println(YARDS + " yards are " + feet + " feet");
		System.out.println(YARDS + " yards are " + inches + " inches");
	}
}