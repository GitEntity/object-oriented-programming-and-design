/*
 * Devante Wilson - 100554361
 * October 5, 2015
 * 
 * Program determines how many completely filled jars of
 * milk can be had.
 */

public class MilkJarCalculator 
{
	public static void main(String[] args)
	{
		// declare variables
		
		// gallons
		double milk = 5.5;
		// gallons
		double jarCapacity = 0.75;
		double completelyFilledJars = (milk / jarCapacity);
		
		// output result by rounding
		System.out.println(Math.round(completelyFilledJars));
	}
}
